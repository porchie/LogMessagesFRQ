import java.util.ArrayList;

public class SystemLog {
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private ArrayList<LogMessage> messageList;


    public SystemLog(ArrayList<LogMessage> messageList)
    {
        this.messageList = messageList;
    }
    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries.
     * Postcondition:
     * - Entries in the returned list properly contain keyword and
     * are in the order in which they appeared in the system log.
     * - The remaining entries in the system log do not properly contain keyword and
     * are in their original order.
     * - The returned list is empty if no messages properly contain keyword.
     */
    public ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> removedMessages = new ArrayList<>();
        for(int i = 0; i<messageList.size();i++)
        {
            if(messageList.get(i).containsWord(keyword))
            {
                removedMessages.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return removedMessages;
    }

    public void printLog()
    {
        messageList.forEach((m) -> System.out.println(m.getMachineId() + ":" + m.getDescription()));
    }

}
