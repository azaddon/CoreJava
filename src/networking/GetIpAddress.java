package networking;

import java.net.*;

public class GetIpAddress
{
    public static void main(String args[]) throws Exception
    {
        String url = "www.google.com";
        try
        {
            // Get IP addresses related to the domain
            InetAddress ips[] = InetAddress.getAllByName(url);
 
            // Display ip addresses
            System.out.println("IP Address(es)");
            for (InetAddress addr:ips)
                System.out.println(addr.getHostAddress());
        }
        catch(Exception ex)
        {
            System.out.println("host not found");
        }
    }
}
