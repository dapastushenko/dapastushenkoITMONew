package bank;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Bank {
    static int userCount = 0;
    static int accCount = 0;


    static Map<Integer, User> userMap = new HashMap<>();
    static Map<Integer, Account> accountMap = new HashMap<>();

    static BlockingQueue<Integer> mailSrc = new LinkedBlockingQueue();
    static BlockingQueue<Integer> mailDist = new LinkedBlockingQueue();

    public static class Account {
        int accbalance;
        int idaccount;
        int iduser;

        public Account(int accbalance, int iduser) {
            this.accbalance = accbalance;
            this.idaccount = accCount;
            this.iduser = iduser;
            accCount++;
        }

        public void addAccaunt(Account account) {
            accountMap.put(account.idaccount, account);
        }

        public int getAccbalance() {
            return accbalance;
        }

        public int getIdaccount() {
            return idaccount;
        }

        public int getIduser() {
            return iduser;
        }

        public void setAccbalance(int accbalance) {
            this.accbalance = accbalance;
        }

        public void setIdaccount(int idaccount) {
            this.idaccount = idaccount;
        }

        public void setIduser(int iduser) {
            this.iduser = iduser;
        }
    }

    public static class User {
        int idUser;
        String userName;

        public User(String userName) {
            this.idUser = userCount;
            this.userName = userName;
            userCount++;
        }

        public void addUser(User user) {
            userMap.put(user.getIdUser(), user);
        }

        public int getIdUser() {
            return idUser;
        }

        public String getUserName() {
            return userName;
        }

    }

    private class Transaction extends Thread {

        Account src;
        Account dest;
        int amount;

        public Transaction(Account src, Account dest, int amount) {
            this.src = src;
            this.dest = dest;
            this.amount = amount;
        }

        @Override
        public void run() {
            transferMoney(src, dest, amount);
        }
    }

    private TxResult transferMoney(Account src, Account dest, int amount) {

        if (amount > src.getAccbalance()) {
            System.out.println("Not money on " + src.getIdaccount());
            return TxResult.NOT_ENOUGH;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (src) {
            int srcBalance = src.getAccbalance();
            src.setAccbalance(srcBalance - amount);
            synchronized (dest) {
                dest.setAccbalance(dest.getAccbalance() + amount);
            }

            mailSrc.add(src.iduser);
            mailDist.add(dest.iduser);
        }

        return TxResult.SUCCESS;
    }

    private static class Mailer extends Thread {
        private final BlockingQueue<Integer> mailSrc;
        private final BlockingQueue<Integer> mailDist;

        private Mailer(BlockingQueue<Integer> mailSrc, BlockingQueue<Integer> mailDist) {
            this.mailSrc = mailSrc;
            this.mailDist = mailDist;
        }
        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Integer thisSrc = mailSrc.take();
                    System.out.println("User:"+userMap.get(thisSrc).userName+"get money");
                    Integer thisDist = mailDist.take();
                    System.out.println("User:"+userMap.get(thisDist).userName+"send money");
                   sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        //создание+добавление юзера в мапу
        Bank bank = new Bank();


        new Mailer(mailSrc,mailDist).start();

        User usr0 = new User("user0");
        User usr1 = new User("user1");
        User usr2 = new User("user2");


        userMap.put(usr0.getIdUser(), usr0);
        userMap.put(usr1.getIdUser(), usr1);
        userMap.put(usr2.getIdUser(), usr2);

//        System.out.println(String.valueOf(usr0.getIdUser()));
//        System.out.println(usr0.getUserName());
//        System.out.println(String.valueOf(userMap.get(usr0.getIdUser())));

        Account account0 = new Account(12110, usr0.idUser);
        Account account1 = new Account(11150, usr0.idUser);
        Account account2 = new Account(11170, usr1.idUser);
        Account account3 = new Account(111131, usr1.idUser);
        Account account4 = new Account(11120, usr2.idUser);
        Account account5 = new Account(1111120, usr2.idUser);

        accountMap.put(account0.getIdaccount(), account0);
        accountMap.put(account1.getIdaccount(), account1);
        accountMap.put(account2.getIdaccount(), account2);
        accountMap.put(account3.getIdaccount(), account3);
        accountMap.put(account4.getIdaccount(), account4);
        accountMap.put(account5.getIdaccount(), account5);

        Thread thread = bank.new Transaction(account5, account1, 100);
        thread.start();
        Thread thread1 = bank.new Transaction(account2, account0, 100);
        thread1.start();
        Thread thread2 = bank.new Transaction(account1, account2, 100);
        thread2.start();


    }
}
