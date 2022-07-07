public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
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
        return getMagicPower() + getTransgression() + getHonor() + getCourage() + getNobility();
    }

    public String compare(Object object) {
        if(object instanceof Griffindor) {
            if (this.countPoints() > ((Griffindor) object).countPoints()) {
                return this.getName() + " лучший Гриффиндорец, чем " + ((Griffindor) object).getName();
            } else if (this.countPoints() == ((Griffindor) object).countPoints()) {
                return "Ученики " + this.getName() + " и " + ((Griffindor) object).getName() + " равны по силе!";
            } else {
                return ((Griffindor) object).getName() + " лучший Гриффиндорец, чем " + this.getName();
            }
        } else {
            return "Ученики с разных факультетов!";
        }
    }
}
