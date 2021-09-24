import java.net.*;
import java.io.*;

class Client{
	public static void main(String[] args){
		Socket s=new Socket("localhost",8000);
		DataInputStream din=new DataInputStream(s.getOutputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str1="",str2="";
		while(!str1.equals("stop")){
			str1=br.readLine();
			dout.writeUTF(str1);
			str2=din.readUTF();
			System.out.println("Server says: "+str2);
		}
	}
}