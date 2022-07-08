public class SlizerinStudent extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;

    public SlizerinStudent(String name, int magicPower, int transgression, int cunning, int decisiveness, int ambition, int resourcefulness) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int countPoints() {
        return super.countPoints() + getAmbition() + getCunning() + getDecisiveness() + getResourcefulness();
    }

    public String compare(SlizerinStudent student) {
            if (this.countPoints() > student.countPoints()) {
                return this.getName() + " лучший Слизеринец, чем " + student.getName();
            } else if (this.countPoints() == student.countPoints()) {
                return "Ученики " + this.getName() + " и " + student.getName() + " равны по силе!";
            } else {
                return student.getName() + " лучший Слизеринец, чем " + this.getName();
            }
    }
}
