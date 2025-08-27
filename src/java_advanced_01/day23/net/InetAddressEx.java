package java_advanced_01.day23.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

//자신의 컴퓨터의 IP 주소를 얻어내는 방법
public class InetAddressEx {
    public static void main(String[] args) {
        InetAddress inetAddress = null;

        try{
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP주소값 " + inetAddress);
            InetAddress[] iaAddress = InetAddress.getAllByName("www.google.com");
            for (InetAddress address : iaAddress) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

}
