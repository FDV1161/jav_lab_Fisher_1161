
import java.util.*;

public class main {
    public static void main(String[] args) {
        HashSet<String> one = new HashSet<String>();
        one.add("арбуз");
        one.add("банан");
        one.add("вишня");
        one.add("груша");
        one.add("дыня");
        one.add("ежевика");
        one.add("жень-шень");
        one.add("земляника");
        one.add("ирис");
        one.add("картофель");

        Iterator<String> iter = one.iterator();

        while(iter.hasNext())
            System.out.println(iter.next());




        System.out.println("\n");
        HashMap<String, String> two = new HashMap<String, String>();
        two.put("арбуз", "ягода");
        two.put("банан", "тарава");
        two.put("вишня", "ягода");
        two.put("груша", "фрукт");
        two.put("дыня", "овощ");
        two.put("ежевика", "куст");
        two.put("жень-шень", "корень");
        two.put("земляника", "ягода");
        two.put("ирис", "цветок");
        two.put("картофель", "клубень");

        Iterator<HashMap.Entry<String, String>> iter2 = two.entrySet().iterator();

        while(iter2.hasNext())
        {
            HashMap.Entry<String, String> obj = iter2.next();
            String key = obj.getKey();
            String value = obj.getValue();
            System.out.println(key + "-" + value );

        }



        System.out.println("\n");
        Cat cats[] = new Cat[10];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Симба");
        cats[2] = new Cat("Кузя");
        cats[3] = new Cat("Том");
        cats[4] = new Cat("Маркиз");
        cats[5] = new Cat("Кекс");
        cats[6] = new Cat("Мурзик");
        cats[7] = new Cat("Саймон");
        cats[8] = new Cat("Гарфилд");
        cats[9] = new Cat("Каспер");

        HashMap<String, Cat> catMap = new HashMap<String, Cat>();
        for(int i = 0; i < 10; i++){
            catMap.put(cats[i].getName(), cats[i]);
        }

        //Iterator<HashMap.Entry<String, Cat>> iter3 = catMap.entrySet().iterator();

        for(HashMap.Entry<String, Cat> o : catMap.entrySet()){
            System.out.println(o.getKey() + " = " + o.getValue().getName());
        }



        System.out.println("\n");
        HashMap<String,String> three = new HashMap<String,String>();
        three.put("1", "one");
        three.put("2", "two");
        three.put("3", "three");
        three.put("4", "four");
        three.put("5", "five");
        three.put("6", "six");
        three.put("7", "seven");
        three.put("8", "eight");
        three.put("9", "nine");
        three.put("10", "ten");

        for(HashMap.Entry<String, String> o : three.entrySet())
            System.out.println(o.getKey());

        System.out.println("\n");

        for(HashMap.Entry<String, String> o : three.entrySet())
            System.out.println(o.getValue());



        System.out.println("\n");
        HashMap<String, Object> four = new HashMap<String, Object>();
        Integer i = 5;
        Double d = 8.5;
        String s = "word";
        char c = '#';
        Snake snake = new Snake("Анаконда");
        Dog dog = new Dog("Акита-ину");
        Whale whale = new Whale("Белый");
        Fish fish = new Fish("карп");
        Parrot parrot = new Parrot("Генадий");
        four.put("Integer", i);
        four.put("Double", d);
        four.put("String", s);
        four.put("char", c);
        four.put("Кот", cats[5].getName());
        four.put("Змея",snake.getName());
        four.put("Собака", dog.getName());
        four.put("Кит", whale.getName());
        four.put("рыба", fish.getName());
        four.put("Попугай", parrot.getName());

        for(HashMap.Entry<String, Object> o : four.entrySet())
            System.out.println(o.getKey() + " - " + o.getValue());


    }
}
