import java.util.ArrayList;

public class LogMessageRunner {
    public static void main(String[] args) {
        ArrayList<LogMessage> logMessages = new ArrayList<>();

        String str = "CLIENT3:security alert – repeated login failures;Webserver:disk offline;SERVER1:file not found;SERVER2:read error on disk DSK1;SERVER1:write error on disk DSK2;Webserver:error on /dev/disk";
        String[] messages = str.split(";");
        for(String s:messages)
        {
            logMessages.add(new LogMessage(s));
        }

        SystemLog log = new SystemLog(logMessages);
        log.printLog();
        System.out.println();
        System.out.println();

        SystemLog removedLog = new SystemLog(log.removeMessages("disk"));
        log.printLog();
        System.out.println();
        System.out.println();

        removedLog.printLog();


    }
}
