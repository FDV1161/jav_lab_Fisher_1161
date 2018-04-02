public class Cow {

    public static void main(String[] args) {
        basic one = new basic();
        basic sec = new Dogs();
     one.method(sec);

        basic thr = new Lama();
     thr.name();

     Dog fo = new Dog();
    fo.getChild();
    }

    public void getName()
    {
        System.out.println("Я - корова");
    }

}
class Whale extends Cow {

    public void getName()
    {
        System.out.println("Я не корова, Я - кит");
    }
}


// task 2
class basic{
    public void method(basic obj)
    {
        if(obj instanceof Cats)
            System.out.println("Кошка");
        if(obj instanceof Dogs)
            System.out.println("Собака");
        if(obj instanceof bred)
            System.out.println("Птица");
        if(obj instanceof Lama)
            System.out.println("Лама");

    }

    public void name(){
        System.out.println("Просто лишний класс");
    }
}

class Cats extends basic{
    public void name(){
        System.out.println("Кошка");
    }

}
class Dogs extends basic{
    public void name(){
        System.out.println("Собака");
    }
}
class bred extends basic{
    public void name(){
        System.out.println("Птица");
    }
}
class Lama extends basic{
    public void name(){
        System.out.println("Лама");
    }
}


//task 3
class Cat{
    public void getChild(){
        System.out.println("котенок");
    }
}
class Dog extends Cat{
    public void getChild(){
        System.out.println("щеночек");
    }
}