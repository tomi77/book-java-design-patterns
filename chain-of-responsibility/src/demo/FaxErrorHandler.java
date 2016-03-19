package demo;

public class FaxErrorHandler implements IReceiver {
    private IReceiver nextReceiver;

    public FaxErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public Boolean processMessage(Message msg) {
        if (msg.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + msg.priority + " priority issue: " + msg.text);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }
}
