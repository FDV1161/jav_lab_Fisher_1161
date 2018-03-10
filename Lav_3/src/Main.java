import java.sql.SQLOutput;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Task 1:");
        int mas[] = new int[10];
        for(int i=0, j=2; i < 10; i++, j+=2){
            System.out.print(" " + (mas[i] = j));
        }
        System.out.println();
        for(int x : mas){
            System.out.println(x);
        }
        System.out.println("Введите любой символ чтобы продолжить:");
        scan.nextLine();


        System.out.println("Task 2:");
        mas = null;
        mas = new int [50];
        for(int i=0, j=1; i < 50; i++, j+=2){
            System.out.print((mas[i] = j) + " ");
        }
        System.out.println();
        for(int i = 49; i > -1; i--){
            System.out.print(mas[i] + " ");
        }
        System.out.println("\nВведите любой символ чтобы продолжить:");
        scan.nextLine();


        System.out.println("\nTask 3:");
        mas = null;
        mas = new int [15];
        int count;
        do {
            count = 0;

            for(int i = 0; i < 15; i++){
                mas[i] = (int)(Math.random()*9);
                System.out.print(mas[i] + " ");
                if(mas[i] != 0 && mas[i] % 2 == 0) count++;
            }
            System.out.println("\nКоличество чётных элементов: " + count + "\n");
            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().trim().equalsIgnoreCase("+"));


        System.out.println("Task 4:");
        mas = null;
        int mas2[][] = new int[8][5];
        do {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print((mas2[i][j] = (int)(Math.random() * 90 + 10)) + " ");
                }
                System.out.println();
            }
            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().trim().equalsIgnoreCase("+"));


        System.out.println("Task 5:");
        mas2 = null;
        mas2 = new int [7][4];
        int line = 0;
        do {
            count = 0;
            for (int i = 0, sec_count = 1; i < 7; i++, sec_count = 1) {

                for (int j = 0 ; j < 4; j++) {
                    System.out.printf("%4d", (mas2[i][j] = (int) (Math.random() * 11) - 5));
                    sec_count *= mas2[i][j];

                }
                System.out.println();
                if(count < Math.abs(sec_count)) {
                    count = Math.abs(sec_count);
                    line = i+1;
                }
            }
            System.out.println("индекс строки с наибольшим по модулю произведением элементов: " + line);


            System.out.println("Повторить? \"+\" - да");
        }while(scan.nextLine().trim().equalsIgnoreCase("+"));

        scan.close();
    }



}
