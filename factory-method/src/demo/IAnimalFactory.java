package demo;

public abstract class IAnimalFactory {
    /* If we cannot instantiate in later stage, we'll throw exception */
    public abstract IAnimal getAnimalType(String type) throws Exception;
}
