
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WorkerProcess
{
    public static void main(String[] args) throws MalformedURLException, IOException
    {
        String SendString = "https://api.telegram.org/bot526308619:AAHg--iymGkDr4fPiGtsgqzEztMA4_Oq0gQ/sendMessage?chat_id=-1001338127855&text=";
        URLConnection conn = null;
        BufferedReader br = null;
        String message;
        URL url;

        for(int i = 1 ; i <= 3; i++) {

            System.out.println("Worker process woke up");
            message = "This is message from heroku server service! "+i;
            url = new URL(SendString+message);
            conn = url.openConnection();
            br = new BufferedReader(new InputStreamReader(new BufferedInputStream(conn.getInputStream())));
            
            try { 
                Thread.sleep(1000*30);  //Sleep for 10 Seconds 3 times
            } catch(InterruptedException e) {}
 
        }
    }    
}
