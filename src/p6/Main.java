package p6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(11111)){
            int i = 1;
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Get " + i);
                Runnable runnable = new EchoServerThread(socket);
                Thread thread = new Thread(runnable);
                thread.start();
                i++;
            }
        }catch (IOException exception){
        }

    }
}
