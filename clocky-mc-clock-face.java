public class Dinglemouse {
    public static String whatTimeIsIt(int angle) {
        // Calculate the hour based on the given angle
        int hour = angle / 30; // 30 degrees per hour
        if (hour == 0) {
            hour = 12; // 0 degrees corresponds to 12 o'clock
        }
        
        // Calculate the minute based on the remaining angle
        int minute = (angle % 30) * 2; // 1 degree corresponds to 2 minutes
        
        // Format the time as HH:MM
        String hourStr = String.format("%02d", hour);
        String minuteStr = String.format("%02d", minute);
        
        return hourStr + ":" + minuteStr;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] angles = {0, 90, 180, 270, 360};
        for (int angle : angles) {
            String time = whatTimeIsIt(angle);
            System.out.println(angle + " degrees => " + time);
        }
    }
}
