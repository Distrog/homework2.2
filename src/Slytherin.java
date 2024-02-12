import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int magicPower, int apparationRange, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magicPower, apparationRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
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

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; хитрость - " + cunning + "; решительность - "
                + determination + "; амбициозность - " + ambition + "; находчивость - " + resourcefulness +
                "; жажда власти - " + thirstForPower);
    }

    private int sumCharacteristics() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    private String getInfo() {
        return "у " + getName() + " " + getSurname() + " хитрость = " + getCunning() +
                " баллов, решительность = " + getDetermination() + " баллов, амбициозность = " +
                getAmbition() + " баллов, находчивость = " + getResourcefulness() +
                " баллов и жажда власти - " + getThirstForPower() + " баллов.";
    }

    private Slytherin[] getWeakAndStrongStudents(Slytherin student) {
        Slytherin strongStudent;
        Slytherin weakStudent;
        if (this.sumCharacteristics() > student.sumCharacteristics()) {
            strongStudent = this;
            weakStudent = student;
        } else {
            strongStudent = student;
            weakStudent = this;
        }
        return new Slytherin[]{strongStudent, weakStudent};
    }

    public void compare(Slytherin student) {
        Slytherin strongStudent = getWeakAndStrongStudents(student)[0];
        Slytherin weakStudent = getWeakAndStrongStudents(student)[1];
        System.out.println(strongStudent.getInfo());
        System.out.println(weakStudent.getInfo());
        System.out.println(strongStudent.getName() + " " + strongStudent.getSurname() + " лучший Слизеринец, чем " +
                weakStudent.getName() + " " + weakStudent.getSurname());
    }
}
