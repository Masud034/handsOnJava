public class Main {

    private static final String INVALID_VALUE_ERROR = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65));
        System.out.println(getDurationString(63, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_ERROR;
        }
        long hours = minutes / 60;
        long calculatedMinutes = minutes % 60;

        String hoursString = hours + "h ";
        String calculatedMinutesString = calculatedMinutes + "m ";
        String secondsString = seconds + "s";

        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        if (minutes < 10) {
            calculatedMinutesString = "0" + calculatedMinutesString;
            System.out.println(calculatedMinutesString);
        }
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + calculatedMinutesString + secondsString;
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_ERROR;
        }
        long minutes = seconds / 60;
        long calculatedSeconds = seconds % 60;
        return getDurationString(minutes, calculatedSeconds);
    }
}
