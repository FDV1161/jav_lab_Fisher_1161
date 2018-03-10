import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Task 1: Четные числа");
        System.out.println("Введите любой символ чтобы продолжить:");
        scan.nextLine();
        System.out.println("Чётные числа от 1 до 100: ");
        for(int i = 2; i <= 100; i+=2){
            System.out.print(i + " ");
        }



        do{
            System.out.println("\n\nTask 2: Прямоугольник");
            byte m, n;
            System.out.println("Введите число m:");
            m = inputNumber(scan);
            System.out.println("Введите число n:");
            n = inputNumber(scan);
            System.out.println("Вы ввели m = " + m + " и n = " + n);
            System.out.println("Ваш прямоугольник: ");
            for(int i = 0; i < (int)m; i++)
            {
                for(int j = 0; j < (int)n; j++){
                    System.out.print("8");
                }
                System.out.print('\n');
            }

            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().equalsIgnoreCase("+"));



        System.out.println("\n\nTask 3: Треугольник");
        System.out.println("Введите любой символ чтобы продолжить:");
        scan.nextLine();
        System.out.println("Ваш прямоугольный треугольник: ");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("8");
            System.out.print('\n');
        }



        do {
            System.out.println("\n\nTask 4: Минимум 2 чисел");
            System.out.println("минимальное число: " + min(inputNumberInt(scan,"Введите первое число:"), inputNumberInt(scan,"Введите втрое число:")));
            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().equals("+"));



        do {
            System.out.println("\n\nTask 1: Сравнение строк");
            System.out.println("Введите первое имя: ");
            String a = scan.nextLine().trim();
            System.out.println("Введите второе имя: ");
            String b = scan.nextLine().trim();
            if (a.equalsIgnoreCase(b)) System.out.println("Строки идентичны");
            else {
                if (a.length() == b.length()) System.out.println("Длины имен равны");
                else System.out.println("Строки не идентичны и их длины не равны");
            }
            System.out.println("Повторить? \"+\" - да");

        }while(scan.nextLine().equals("+"));



        do {
            System.out.println("\n\nTask 2: Минимум 4 чисел");
            System.out.println("минимальное из 4 чисел: " + min(min(inputNumberInt(scan, "Введите первое число: "),
                    inputNumberInt(scan, "Введите второе число: ")),min(inputNumberInt(scan, "Введите третье число: "),
                    inputNumberInt(scan, "Введите четвертое число: "))));
            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().equals("+"));


        do {
            System.out.println("\n\nTask 3: Координатные четверти");
            int a = inputNumberInt(scan, "Введите координату OX: ");
            int b = inputNumberInt(scan, "Введите координату OY: ");
            if(a == 0 || b == 0){
                System.out.println("Одна из координат равна 0 !!!!");
                break;
            }
            if(a > 0 )
            {
                if(b > 0)
                    System.out.println("номер четверти: 1");
                else
                    System.out.println("номер четверти: 4");
            }else if(b > 0)
                    System.out.println("номер четверти: 2");
                  else
                    System.out.println("номер четверти: 3");
            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().equals("+"));


        scan.close();
    }

    private static byte inputNumber(Scanner in){
        while(true){
            if (!in.hasNextByte()) {
                System.out.println("Вы ввели не целое число или больше 127");
                in.nextLine();
            }
            else{
                byte a;
                a = in.nextByte();
                in.nextLine();
                if (a < 1) {
                    System.out.println("Число должно быть больше 0");
                    continue;
                }
                return a;
            }
        }
    }
    private static int inputNumberInt(Scanner in, String str ){
        while(true){
            System.out.println(str);
            if (!in.hasNextInt()) {
                System.out.println("Вы ввели не целое число или больше диапазона Int");
                in.nextLine();
            }
            else{
                int a;
                a = in.nextInt();
                in.nextLine();
                return a;
            }
        }
    }
    private static int min (int a, int b){
        if(a < b) return a;
            else return b;
    }


}
