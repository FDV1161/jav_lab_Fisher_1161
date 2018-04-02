public interface PassangersAuto{
    void transportPeople();
}

interface CargoAuto{
    void transportCargo();
}

class Truck implements CargoAuto{
    public void transportCargo(){
        System.out.println("Перевозка Грузов");
    }
}

class Sedan implements PassangersAuto{
    public void transportPeople(){
        System.out.println("Перевозка людей");
    }
}

class Pickup implements CargoAuto, PassangersAuto{
    public void transportPeople(){
        System.out.println("Перевозка людей");
    }
    public void transportCargo(){
        System.out.println("Перевозка Грузов");
    }

}