import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class client21F21919 implements Runnable
{
    public void run()
    {
        try
        {
            Socket sk = new Socket("localhost",8000);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Beverage code");
            int bc = s.nextInt();
            System.out.println("Enter Number of cups");
            int nc = s.nextInt();
            
            DataOutputStream do = new DataOutputStream(sk.getOutputStream());
            do.writeInt(bc);
            do.writeInt(nc);
            do.flush();
            
            
            DataInputStream di = new DataInputStream(sk.getInputStream());
            char bn =di.readChar();
            double sa =di.readDouble();
            double pr =di.readDouble();
            System.out.println("The Beverage name is " + bn);
            System.out.println("The Price is " + sa);
            System.out.println("The Sales name is " + pr);
            
            
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
        
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
