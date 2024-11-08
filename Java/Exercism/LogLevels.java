public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].toString().trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].toString().toLowerCase().replace("]","").replace("[","");
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}