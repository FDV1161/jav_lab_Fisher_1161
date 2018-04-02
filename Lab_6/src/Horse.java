public class Horse {
    private String nameHorse;

    public Horse(String name){
        nameHorse = name;
    }
    public String getName() {
        return nameHorse;
    }
}

class Pegas extends Horse{
    private boolean flight;

    public Pegas(String name){
        super(name);
    }

    public void setFlight(boolean flight) {
        this.flight = flight;
    }
    public boolean getFlight() {
        return flight;
    }

}

