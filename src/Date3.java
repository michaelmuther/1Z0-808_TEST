import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
SimpleDateFormat IS NOT MULTI-THREAD SAFE!! THIS IS AN EXAMPLE OF IT WHERE THE SimpleDateFormat object is being shared.
The SimpleDateFormat object must be created once and thrown away.
Instead, create the object one at a time within the loop

An interchangeable class that is threadsafe is FastDateFormat
*/
public class Date3 {

//    private static final SimpleDateFormat dateformat = new SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss"); // This is original creation of the object
    private static final FastDateFormat dateformat = FastDateFormat.getInstance("yyy-MM-dd'T'HH:mm:ss"); // This is the FastDateFormat version

    public static void main(String[] args) {

        String dateString = "2020-10-17T12:34:51";

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Date date = dateformat.parse(dateString); // Original code
//                    Date date = new SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss").parse(dateString); // Instead, use this
                    System.out.println("Successfully parsed: " + date);
                } catch (Exception e) {
                    System.out.println("Exception: ");
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 1000; i++) {
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }
}
