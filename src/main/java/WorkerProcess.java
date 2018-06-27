
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkerProcess
{
    public static void main(String[] args) throws MalformedURLException
    {
        String SendString = "https://api.telegram.org/bot526308619:AAHg--iymGkDr4fPiGtsgqzEztMA4_Oq0gQ/sendMessage?chat_id=-1001338127855&text=";
        URLConnection conn = null;
        BufferedReader br = null;
        String message;
        URL url;
        
        Calendar cal;
        String time;        
        
        for(int i = 1 ; i <= 3; i++) {
            try {
                cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+3"));
                time = cal.get(Calendar.HOUR_OF_DAY) +":"+ cal.get(Calendar.MINUTE) +":"+ cal.get(Calendar.SECOND);
                System.out.println("Worker process woke up "+time);
                message = "This is message from heroku server service! "+time;
                url = new URL(SendString+message);
                conn = url.openConnection();
                br = new BufferedReader(new InputStreamReader(new BufferedInputStream(conn.getInputStream())));

                try {
                    
                    Thread.sleep(1000*60*15);  //Sleep for 15 Minutes x 3 times
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(WorkerProcess.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch(IOException ex) {
                Logger.getLogger(WorkerProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
    }    
}
