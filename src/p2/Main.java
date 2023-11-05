package p2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("ya.ru", 80), 10000);

        InetAddress address = InetAddress.getByName("time-a.nist.gov");
        byte[] addByte = address.getAddress();
        InetAddress[] addresses = InetAddress.getAllByName("time-a.nist.gov");

    }

}
