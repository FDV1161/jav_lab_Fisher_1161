import java.util.Scanner;

public class Circle  {
    private double lenght;
    private int radius;
    private int Xo = 0; //координаты центра круга
    private int Yo = 0;

    public Circle(Scanner scan){
        System.out.println("Введите радиус: ");
        radius  = inputRad(scan);
        Xo = inputCenter(scan, "Введите Xo: ");
        Yo = inputCenter(scan, "Введите Yo: ");
        lenght();
    }
    public double GetLenght(){
        return lenght;
    }
    public void ShowCenter(){
        System.out.println("Xo равно: " + Xo);
        System.out.println("Yo равно: " + Yo);
    }
    public void SetRadius(int Rad){
        if (Rad > 0)
            radius = Rad;
    }

    public void lenght(){
        lenght = 2*radius * Math.PI;
    }

    public void moveCenter(){
        Xo = (int)(Math.random() * 199) - 99;
        Yo = (int)(Math.random() * 199) - 99;
    }

    public int distance(Circle obj){
        int a = Xo - obj.Xo;
        int b = Yo - obj.Yo;
        return (int)Math.round(Math.sqrt(a*a + b*b));
    }
    public boolean touch(Circle obj){
        int dist = distance(obj);
        if (radius + obj.radius == dist)
            return true;
        if(Math.abs(radius - obj.radius) == dist)
            return true;
        return false;
    }


    private int inputRad(Scanner in){
        while(true){
            if (!in.hasNextInt()) {
                System.out.println("Ошибка");
                in.nextLine();
            }
            else{
                int a;
                a = in.nextInt();
                in.nextLine();
                if (a < 1) {
                    System.out.println("Радиус должен быть больше 0");
                    continue;
                }
                return a;
            }
        }
    }
    private int inputCenter(Scanner in, String str){
        while(true){
            System.out.println(str);
            if (!in.hasNextInt()) {
                System.out.println("Ошибка");
                in.nextLine();
            }
            else{
                int a;
                a = in.nextInt();
                in.nextLine();
                if (a < -99 || a > 99) {
                    System.out.println("Точка должна быть в пределах [-99;99]");
                    continue;
                }
                return a;
            }
        }
    }


}