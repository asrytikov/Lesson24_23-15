package p5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(11111)){
            try(Socket s = serverSocket.accept()){
                InputStream inputStream = s.getInputStream();
                OutputStream outputStream = s.getOutputStream();
                try(Scanner in = new Scanner(inputStream, "UTF-8")){
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
                    out.println("Hello! Enter BYE to exit");
                    boolean done = false;
                    while (!done && in.hasNextLine()){
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.trim().equals("BYE")) done = true;
                    }
                }
            }
        }
    }
}
