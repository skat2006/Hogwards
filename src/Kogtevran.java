public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name, int magicPower, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int countPoints() {
        return getMagicPower() + getTransgression() + getSmart() + getWise() + getCreativity() + getWitty();
    }

    public String compare(Object object) {
        if(object instanceof Kogtevran) {
            if (this.countPoints() > ((Kogtevran) object).countPoints()) {
                return this.getName() + " лучший Когтевранец, чем " + ((Kogtevran) object).getName();
            } else if (this.countPoints() == ((Kogtevran) object).countPoints()) {
                return "Ученики " + this.getName() + " и " + ((Kogtevran) object).getName() + " равны по силе!";
            } else {
                return ((Kogtevran) object).getName() + " лучший Когтевранец, чем " + this.getName();
            }
        } else {
            return "Ученики с разных факультетов!";
        }
    }
}
