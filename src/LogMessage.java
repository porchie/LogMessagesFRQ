public class LogMessage {
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        machineId = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        String desc = " " + description + " ";
        keyword = " " + keyword + " ";
        return desc.indexOf(keyword) != -1;
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
}
