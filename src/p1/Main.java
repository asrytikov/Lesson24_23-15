package p1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       try (Socket socket = new Socket("time-a.nist.gov", 13);
            Scanner in = new Scanner(socket.getInputStream(), "UTF-8")
       ){
           socket.setSoTimeout(10000);
           while (in.hasNextLine()){
               String line = in.nextLine();
               System.out.println(line);
           }
       }catch (InterruptedIOException exception){}
    }
}