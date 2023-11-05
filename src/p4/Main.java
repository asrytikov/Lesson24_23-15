package p4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(11111);
        Socket income = serverSocket.accept();
        InputStream inputStream = income.getInputStream();
        OutputStream outputStream = income.getOutputStream();

        Scanner in = new Scanner(inputStream, "UTF-8");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);

    }
}
