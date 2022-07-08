public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Ученик: " + name + ", Сила магии: " + magicPower + ", Трансгрессия: " + transgression + ", ";
    }

    public void getStudentInfo() {
        System.out.println(this);
    }

    public int countPoints() {
        return getMagicPower() + getTransgression();
    }

    public String compare(Hogwarts student) {
        if (this.countPoints() > student.countPoints()) {
            return this.getName() + " круче, чем " + student.getName();
        } else if (this.countPoints() == student.countPoints()) {
            return "Ученики " + this.getName() + " и " + student.getName() + " равны по силе!";
        } else {
            return student.getName() + " круче, чем " + this.getName();
        }
    }
}
