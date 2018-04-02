public class Fish{
    private String name;
    private boolean swim;
    private int speed;

    public Fish(String name){
        this.name = name;
        speed = 0;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public void setSpeed(int speed) {
        if(speed != 0 && swim)
            this.speed = speed;
        else this.speed = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getSwim() {
        return swim;
    }

}

class Animal extends Fish{
    private boolean go;

    public Animal(String name){
        super(name);
    }

    public void setGo(boolean go, int speed) {
        this.go = go;
        setSpeed(speed);
    }

    public boolean getGo(){
        return go;
    }
}

class Ape extends Animal{
    private String Takehands;

    public Ape(String name){
        super(name);
    }
    public void take(String any){
        Takehands = any;
    }
    public void drop(){
        Takehands = null;
    }
    public String getTakehands() {
        return Takehands;
    }
}

class Human extends Ape {
    private String say;
    private String think;

    public Human(String name){
        super(name);
    }

    public void setSay(String say) {
        this.say = say;
    }


}