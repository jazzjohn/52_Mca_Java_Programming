import java.net.*;
import java.io.*;
import java.util.*;

class Client{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        DatagramSocket ds=new DatagramSocket();
        System.out.print("\nEnter a message : ");
        String sendingData=sc.nextLine();
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        DatagramPacket dp=new DatagramPacket(sendingData.getBytes(), sendingData.length(),ip,8000);
        ds.send(dp);
        byte[] buf=new byte[1024];
        DatagramPacket newdp=new DatagramPacket(buf,buf.length);
        ds.receive(newdp);
        String Receivingdata=new String(newdp.getData(),0,newdp.getLength());
        System.out.println("Received Data from server : "+Receivingdata);
        System.out.println("Exiting.....");
        ds.close();
    }
}