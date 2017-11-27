package diplom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;



public class Server {

    private int port;

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        if (args.length == 0) throw new IllegalArgumentException("You need to use a port, for example 1234");

        int port = Integer.parseInt(args[0]);

        Server server= new Server(port);

        server.start();

    }
    public Server(int port){
        this.port=port;
    }

    protected void start() throws IOException {
        try(ServerSocket srvsocket = new ServerSocket(port)){
            Date dt = new Date();
            System.out.printf("Server start:"+ dt.toString() );

            while (true){
                Socket srvsk = srvsocket.accept();
                try {
                    process(srvsk);
                }
                catch (ClassNotFoundException e) {
                    System.err.println("Wrong command");;
                } finally {
                    srvsk.close();
                }
            }

        }
    }

    private void process(Socket srvsk) throws IOException, ClassNotFoundException {

        String host = srvsk.getInetAddress().getHostAddress();

        try(ObjectInputStream objInput = new ObjectInputStream(srvsk.getInputStream());
            OutputStream out= srvsk.getOutputStream()){
            Object obj=objInput.readObject();

            if (obj instanceof Command) {
                Command cmd = (Command) obj;

                int id = cmd.getId();
            }

        }
            catch (IOException | ClassNotFoundException | RuntimeException e) {
            System.err.println("Failed process connection from: " + host);

            e.printStackTrace();

            throw e;
        }
    }

}
