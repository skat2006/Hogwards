public class Slizerin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;

    public Slizerin(String name, int magicPower, int transgression, int cunning, int decisiveness, int ambition, int resourcefulness) {
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
        return getMagicPower() + getTransgression() + getAmbition() + getCunning() + getDecisiveness() + getResourcefulness();
    }

    public String compare(Object object) {
        if (object instanceof Slizerin) {
            if (this.countPoints() > ((Slizerin) object).countPoints()) {
                return this.getName() + " лучший Слизеринец, чем " + ((Slizerin) object).getName();
            } else if (this.countPoints() == ((Slizerin) object).countPoints()) {
                return "Ученики " + this.getName() + " и " + ((Slizerin) object).getName() + " равны по силе!";
            } else {
                return ((Slizerin) object).getName() + " лучший Слизеринец, чем " + this.getName();
            }
        } else {
            return "Ученики с разных факультетов!";
        }
    }
}
