package demo;

public class FactoryPatternEx {
    public static void main(String[] args) {
        System.out.println("***Factory Pattern Demo***\n");

        IAnimalFactory animalFactory = new ConcreteFactory();

        try {
            IAnimal duck = animalFactory.getAnimalType("Duck");
            duck.speak();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            IAnimal tiger = animalFactory.getAnimalType("Tiger");
            tiger.speak();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // There is no Lion type. So, an exception will be thrown
        try {
            IAnimal lion = animalFactory.getAnimalType("Lion");
            lion.speak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
