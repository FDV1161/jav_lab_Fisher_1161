public class Pet {
    private int weight;
    private int age;
    private char floor;

    public Pet(int weight, int age, char floor){
        if(age > 0)
            this.age = age;
        floor = Character.toLowerCase(floor);
        if(floor == 'м' || floor == 'ж')
            this.floor = floor;
        if(weight > 0)
            this.weight = weight;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }
    public void setFloor(char floor) {
        floor = Character.toLowerCase(floor);
        if(floor == 'м' || floor == 'ж')
            this.floor = floor;
    }
    public void setWeight(int weight) {
        if(weight > 0)
            this.weight = weight;
    }
    public char getFloor() {
        return floor;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
}

class Cat extends Pet{
    private String name;

    public Cat(String name, int weight, int age, char floor){
        super(weight, age, floor);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void info(){
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + getFloor());
        System.out.println("Возраст: " + getAge());
        System.out.println("Вес: " + getWeight());
    }
}

class Dog extends Pet{
    private String name;

    public Dog(String name, int weight, int age, char floor){
        super(weight, age, floor);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + getFloor());
        System.out.println("Возраст: " + getAge());
        System.out.println("Вес: " + getWeight());
    }
}
