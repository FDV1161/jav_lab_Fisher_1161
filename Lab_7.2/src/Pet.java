public abstract class Pet  {
    private String name;
    private int age;
    private boolean hungry;

    public abstract void voice();
}

class Snake extends Pet{

    public void voice(){
        System.out.println("ШШШШШ");
    };
}

class Dog extends Pet{

    public void voice(){
        System.out.println("Гав Гав");
    };
}

class PatrolDog extends Pet{

    public void voice(){
        System.out.println("РРРРРРР");
    };
}

class Cat extends Pet{

    public void voice(){
        System.out.println("Мяу Мяу");
    };
}

class Fish extends Pet{

    public void voice(){
        System.out.println("....");
    };
}

