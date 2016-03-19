package demo;

public class IssueRaiser {
    public IReceiver firstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg) {
        if (firstReceiver != null) {
            firstReceiver.processMessage(msg);
        }
    }
}
