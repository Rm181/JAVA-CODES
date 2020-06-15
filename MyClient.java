import java.net.*;
import java.io.*;

class MyClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("192.168.1.66", 5012);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//accepting input
		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = br.readLine();//buffer like scanner
			dout.writeUTF(str);//method of outputstream
			dout.flush();
			str2 = din.readUTF();// sent data read
			
			System.out.println("Server says: " + str2);
		}

		dout.close();
		s.close();
	}
}