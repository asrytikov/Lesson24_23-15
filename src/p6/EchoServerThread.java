package p6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerThread implements Runnable{

    private Socket socket;

    public EchoServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream()){
            Scanner in = new Scanner(inputStream, "UTF-8");
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outputStream, "UTF-8"),
                    true);
            out.println("Hello! Enter BYE to exit");
            boolean done = false;
            while (!done && in.hasNextLine()){
                String line = in.nextLine();
                out.println("Echo: " + line);
                if (line.trim().equals("BYE")) done = true;
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
