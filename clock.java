package conditionalsjava;
import java.util.Calendar;
public class clock {
    public static void main(String[] args) {
        while (true) {
            // Get the current time
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);

            String time = String.format("%02d:%02d:%02d", hour, minute, second);

            // Print the time
            System.out.print("\r" + time); // The '\r' carriage return character moves the cursor to the beginning of the line

            try {
                Thread.sleep(1000); // Wait for 1 second before updating the time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      }
    }