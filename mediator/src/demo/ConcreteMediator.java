package demo;

public class ConcreteMediator extends Mediator {
    private Friend1 friend1;

    private Friend2 friend2;

    private Boss boss;

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void send(Friend frd, String msg) {
        // In all cases, boss is notified
        if (frd == friend1) {
            friend2.notify(msg);
            boss.notify(friend1.name + " send message to " + friend2.name);
        }
        if (frd == friend2) {
            friend1.notify(msg);
            boss.notify(friend2.name + " send message to " + friend1.name);
        }
        // Boss is sending message to others
        if (frd == boss) {
            friend1.notify(msg);
            friend2.notify(msg);
        }
    }
}
