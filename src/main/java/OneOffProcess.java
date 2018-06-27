
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class OneOffProcess
{
    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
       
        //System.out.println(time.get(Calendar.HOUR_OF_DAY) +":"+ time.get(Calendar.MINUTE) +":"+ time.get(Calendar.SECOND));
        System.out.println("Time from Calendar\t"+(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance(TimeZone.getTimeZone("GMT+3")).getTime())));
        System.out.println("Time from Date\t\t"+(new SimpleDateFormat("HH:mm:ss").format(new Date())));
//        String SendString = "https://api.telegram.org/bot526308619:AAHg--iymGkDr4fPiGtsgqzEztMA4_Oq0gQ/sendMessage?chat_id=-1001338127855&text=";
// 
//        String time = Calendar.getInstance(TimeZone.getTimeZone("GMT+3")).getTime().toString();
//
//        URLConnection conn = null;
//        BufferedReader br = null;
//        
//        System.out.println(Calendar.getInstance(TimeZone.getTimeZone("GMT+3")).getTime().toString());
//        String message = "This is message from heroku server!";
//        URL url = new URL(SendString+message);
//        conn = url.openConnection();
//        br = new BufferedReader(new InputStreamReader(new BufferedInputStream(conn.getInputStream())));
//        Thread.sleep(1000*2);
//
//        System.out.println(Calendar.getInstance(TimeZone.getTimeZone("GMT+3")).getTime().toString());

    }
}
