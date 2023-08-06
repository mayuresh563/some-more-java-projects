import java.io.*;
import java.net.*;

class TCP_Server_Evenodd
{
	public static void main(String a[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(8887);//Makes the server ready to recieve requests
	
		Socket s = ss.accept();//Server Recieves a Request

		BufferedReader sbr=new BufferedReader(new InputStreamReader(s.getInputStream()));//To Read form Socket
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));//To Write Thorugh Socket
		
		while(true)
		{
			String str=sbr.readLine();//Read From Socket
			System.out.println("Input from Client:"+str);
			int n=Integer.parseInt(str);
            if (n%2==0)
            {
                pw.println("Number is even");
            } 
            else
            {
                pw.println("Number is odd");
            }
			pw.flush();
			if(str.equalsIgnoreCase("BYE"))
			{
				break;
			}
		}

		s.close();
		ss.close();
	}
}
