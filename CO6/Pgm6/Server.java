import java.net.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws Exception{
        DatagramSocket ds=new DatagramSocket(8000);
        byte[] buf=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str=new String(dp.getData(),0,dp.getLength());
        System.out.println("\nData from client : "+str);
        String newstr="Thanks for your Message...";
        InetAddress ip=dp.getAddress();
        int port=dp.getPort();
        DatagramPacket newdp=new DatagramPacket(newstr.getBytes(),newstr.length(),ip,port);
        ds.send(newdp);
        System.out.println("Exiting....");
        ds.close();
    }
}
