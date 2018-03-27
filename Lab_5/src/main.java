import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Task 1: ");
        Circle obj = new Circle(scan);
        System.out.println("Длина равна: " + obj.GetLenght());

        System.out.println("Task 2: ");
        System.out.println("Координаты центра изменены на: ");
        obj.moveCenter();
        obj.ShowCenter();

        System.out.println("Task 4: ");
        System.out.println("Создание 2 объекта");
        Circle obj2 = new Circle(scan);
        System.out.println("Расстояние между центрами окружностей равно: ");
        System.out.println(obj.distance(obj2));

        System.out.println("Task 5: ");
        if(obj.touch(obj2))
            System.out.println("окружности касаются");
        else
            System.out.println("окружности не касаются");

        scan.close();
    }
}
