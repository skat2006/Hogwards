public class PuffenduyStudent extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public PuffenduyStudent(String name, int magicPower, int transgression, int hardworking, int loyal, int honest) {
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
        return super.countPoints() + getHardworking() + getHonest() + getLoyal();
    }

    public String compare(PuffenduyStudent student) {
            if (this.countPoints() > student.countPoints()) {
                return this.getName() + " лучший Пуффендуец, чем " + student.getName();
            } else if (this.countPoints() == student.countPoints()) {
                return "Ученики " + this.getName() + " и " + student.getName() + " равны по силе!";
            } else {
                return student.getName() + " лучший Пуффендуец, чем " + this.getName();
            }
    }
}
