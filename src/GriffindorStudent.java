public class GriffindorStudent extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + "Благородство: " + nobility + ", Честь: " + honor + ", Храбрость: " + courage;
    }

    public int countPoints() {
        return super.countPoints() + getHonor() + getCourage() + getNobility();
    }

    public String compare(GriffindorStudent student) {
            if (this.countPoints() > student.countPoints()) {
                return this.getName() + " лучший Гриффиндорец, чем " + student.getName();
            } else if (this.countPoints() == student.countPoints()) {
                return "Ученики " + this.getName() + " и " + student.getName() + " равны по силе!";
            } else {
                return student.getName() + " лучший Гриффиндорец, чем " + this.getName();
            }
    }
}
