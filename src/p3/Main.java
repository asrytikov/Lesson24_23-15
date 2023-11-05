package p3;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length > 0){
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for(InetAddress address : addresses){
                System.out.println(address);
            }
        }else{
            InetAddress address = InetAddress.getLocalHost();
            String host  = address.getHostName();
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for(InetAddress a : addresses){
                System.out.println(a);
            }
        }
    }

}
