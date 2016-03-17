package demo;

public class ComedyMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
