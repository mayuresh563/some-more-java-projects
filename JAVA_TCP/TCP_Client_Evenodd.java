import java.io.*;
import java.net.*;

class TCP_Client_Evenodd
{
	public static void main(String a[]) throws Exception
	{
		Socket s = new Socket("localhost",8887);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Read from the keyboard
		BufferedReader sbr=new BufferedReader(new InputStreamReader(s.getInputStream()));//To Read from Socket
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));//To Write Through Socket
		
		while(true)
		{
			String str=br.readLine();//reads from the keyboard
			pw.println(str);//writes to the socket
			pw.flush();//sends
			String ans=sbr.readLine();//reads from the socket
			System.out.println("Answer from Server:"+ans);//displays on the client screen
			if(ans.equalsIgnoreCase("BYE, SEE YOU AGAIN!!"))
				break;
		}	
		s.close();
	}
}

