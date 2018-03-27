import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        int mas[];

        System.out.println("Task 1:");
        a = inputNumberInt(scan, "Введите a: ");
        b = inputNumberInt(scan, "Введите b: ");
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }
        mas = new int [20];
        for(int i = 0; i < 20; i++){
            mas[i] = RandAB(a, b);
            System.out.print(mas[i] + " ");
        }
        mas = null;



        System.out.println("\n\nTask 2:");
        mas = new int[10];
        int[] mas2 = new int[10], mas3 = new int[10], mas4 = new int[10], mas5 = new int[10];
        for(int i = 0; i < 5; i++ ){
            for(int j=0; j < 10; j++){
                mas[j] = RandAB(a,b);
                mas2[j] = RandAB(a,b);
                mas3[j] = RandAB(a,b);
                mas4[j] = RandAB(a,b);
                mas5[j] = RandAB(a,b);
            }
        }
        OutMas(mas);
        System.out.println();
        OutMas(mas2);
        System.out.println();
        OutMas(mas3);
        System.out.println();
        OutMas(mas4);
        System.out.println();
        OutMas(mas5);



        System.out.println("\n\nTask 3:");
        System.out.println("какой массив сортировать?: \n1-1\n2-2\n3-3\n4-4\n5-5");

        switch(scan.nextInt()){
            case 1:
                SortMas(mas);
                OutMas(mas);
                break;
            case 2:
                SortMas(mas2);
                OutMas(mas2);
                break;
            case 3:
                SortMas(mas3);
                OutMas(mas3);
                break;
            case 4:
                SortMas(mas4);
                OutMas(mas4);
                break;
            case 5:
                SortMas(mas5);
                OutMas(mas5);
                break;
            default:
                break;
        };
        System.out.println("\nTask 1: последовательность Фибоначи");
        System.out.println("Начиная с 50 элемента вычисление последовательности\n" +
                "фибоначи с использованием рекурсии занимет более 1 минуты по времени");
        //System.out.println(sequenceFi(50));



        scan.close();
    }

    static long sequenceFi(long n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return (sequenceFi(n-1) + sequenceFi(n-2));
    }

    static int RandAB (int a, int b){
        int m = (int)(Math.random()*(b - a + 1));
        return m += a;
    }

    static void OutMas(int mas[]){
        for(int i : mas){
            System.out.print(i + " ");
        }
    }
    static void SortMas(int mas[]){
        for(int i = 0; i < mas.length; i++){
            for(int j=0; j < mas.length - 1; j++)
            {
                if(mas[j] > mas[j+1]){
                    int c = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = c;
                }

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

}
