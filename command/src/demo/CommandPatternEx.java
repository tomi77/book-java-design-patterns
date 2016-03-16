package demo;

public class CommandPatternEx {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");

        Receiver intendedReceiver = new Receiver();
        /* Client holds Invoker and Command Objects */
        Invoke inv = new Invoke();

        MyUndoCommand unCmd = new MyUndoCommand(intendedReceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedReceiver);

        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
