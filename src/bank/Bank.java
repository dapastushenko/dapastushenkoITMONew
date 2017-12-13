package bank;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bank {
static int userCount=0;
static int accCount=0;
private Scanner scanner;
    //public enum TxResult(){
//    private final String claim;
//        SUCCESS("SUCCESS"),
//        NOT_ENOUGH("NOT_ENOUGH");
//
//        private final String claim;
//        Bank(String claim) {
//        this.claim = claim;
//    }
//}

    private static class Account{
        int id;
        int abalance;
        int auserid;


        private Account (int balance, int userid){
            this.id=accCount;
            this.abalance=balance;
            this.auserid=userid;
            accCount=accCount+1;

        }
//       Account newAccaunt(int balance, int userid){
//            id = accCount;
//            abalance = balance;
//            auserid = userid;
//           return Account;
//        }
    }


    public class User{
        int userid;
        String username;

        Map<Integer, String> userMap;

        {
            userMap = new HashMap<Integer, String>();
        }

private User(String name){
            this.userid=accCount;
            this.username=name;
            accCount=userCount+1;

                userMap.put(accCount,name);

}

        public User newUser(String name){

//           userMap.put(userCount,name);
//           userCount=userCount+1;
           userid = userCount;
           username = name;
           userMap.put(userid,username);
            return this;
        }

        public String getUser(int id){
           String userame = userMap.get(userid);
            return userame;
        }
    }

    public static  void main(String[] args){
Account acc = new Account(11,0);
Account acc1 = new Account(123, 0);
Account acc2  = new Account(132,1);
Account acc3 = new Account(111, 1);

        System.out.printf(String.valueOf(acc.abalance));
//        transferMoney(Account id, Account id, int ammount);





    }
}
