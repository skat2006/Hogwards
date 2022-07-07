public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, int magicPower, int transgression, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public int countPoints() {
        return getMagicPower() + getTransgression() + getHardworking() + getHonest() + getLoyal();
    }

    public String compare(Object object) {
        if(object instanceof Puffenduy) {
            if (this.countPoints() > ((Puffenduy) object).countPoints()) {
                return this.getName() + " лучший Пуффендуец, чем " + ((Puffenduy) object).getName();
            } else if (this.countPoints() == ((Puffenduy) object).countPoints()) {
                return "Ученики " + this.getName() + " и " + ((Puffenduy) object).getName() + " равны по силе!";
            } else {
                return ((Puffenduy) object).getName() + " лучший Пуффендуец, чем " + this.getName();
            }
        } else {
            return "Ученики с разных факультетов!";
        }
    }
}
