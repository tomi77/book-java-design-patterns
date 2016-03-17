package demo;

public class Director {
    IBuilder builder;

    // A series of steps—for the production
    public void construct(IBuilder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
    }
}
