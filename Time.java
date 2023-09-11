public class Time {
    public static void main(String[] args) {
        int hour = 17;
        int minute = 57;
        int second = 59;
        double secondsMidnight = 62519.0;
        double totalSeconds = 86400.0;
        double secondsCurrent = 64679.0;

        System.out.print ("The number of seconds since midnight: ");
        System.out.println ((hour * 60 * 60) + (minute * 60) + second);

        System.out.print ("The number of seconds left in the day: ");
        System.out.println (totalSeconds - ((hour * 60 * 60) + (minute * 60) + second));

         System.out.print ("Percentage of the day that has passed: ");
         System.out.print ((secondsMidnight/totalSeconds)*100);
         System.out.println ("%");

        System.out.print ("Elasped time since started in seconds: ");
        System.out.println (secondsCurrent - secondsMidnight);
    }

}