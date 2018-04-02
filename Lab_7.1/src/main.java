import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("task 1-2");
        Scanner in = new Scanner(System.in);
        int a = 20;
        print(a);

        Integer b = 20;
        print(b);

        String c = "String";
        print(c);

        System.out.println("task 3");
        char d = 'Q';
        print(d);

        double e = 18.75;
        print(e);

        Cat cat = new Cat();
        print(cat);

        Cow cow = new Cow();
        print(cow);

        Lama lama = new Lama();
        print(lama);


        System.out.println("task 4");
        System.out.println("Введите 1 и 2 число int");
        System.out.println("min  = " + min(inputInt(in),inputInt(in)));
        System.out.println("Введите 1 и 2 число int");
        System.out.println("max  = " + max(inputInt(in),inputInt(in)));

        System.out.println("Введите 1 и 2 число long");
        System.out.println("min  = " + min(inputLong(in),inputLong(in)));
        System.out.println("Введите 1 и 2 число long");
        System.out.println("max  = " + max(inputLong(in),inputLong(in)));

        System.out.println("Введите 1 и 2 число double");
        System.out.println("min  = " + min(inputDouble(in),inputDouble(in)));
        System.out.println("Введите 1 и 2 число double");
        System.out.println("max  = " + max(inputDouble(in),inputDouble(in)));



    }

    static public void print(int a){
        System.out.println("Метод print(int)");
        System.out.println(a);
    }

    static public void print(String a){
        System.out.println("Метод print(String)");
        System.out.println(a);
    }

    static public void print(Integer a){
        System.out.println("Метод print(Integer)");
        System.out.println(a);
    }

    // task 3
    static public void print(char a){
        System.out.println("Метод print(char)");
        System.out.println(a);
    }

    static public void print(double a){
        System.out.println("Метод print(double)");
        System.out.println(a);
    }

    static public void print(Cat a){
        System.out.println("Метод print(Cat)");
        a.getChild();
    }

    static public void print(Cow a){
        System.out.println("Метод print(Cow)");
        a.getName();
    }

    static public void print(Lama a){
        System.out.println("Метод print(Lama)");
        a.name();
    }

    //task 4
    public static int min(int a, int b){
        if(a < b) return a;
        return b;
    }

    public static long min(long a, long b){
        if(a < b) return a;
        return b;
    }

    public static double min(double a, double b){
        if(a < b) return a;
        return b;
    }

    //task 5
    public static int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static long max(long a, long b){
        if(a > b) return a;
        return b;
    }

    public static double max(double a, double b){
        if(a > b) return a;
        return b;
    }


    public static int inputInt(Scanner in){
        while(true) {
            if(!in.hasNextInt()){
                System.out.println("Введите сново: ");
                in.nextLine();
            }else
                return in.nextInt();
        }
    }
    public static double inputDouble(Scanner in){
        while(true) {
            if(!in.hasNextDouble()){
                System.out.println("Введите сново: ");
                in.nextLine();
            }else
                return in.nextDouble();
        }
    }
    public static long inputLong(Scanner in){
        while(true){
            if(!in.hasNextLong()){
                System.out.println("Введите сново: ");
                in.nextLine();
            }else
                return in.nextLong();
        }
    }

}
