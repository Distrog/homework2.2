import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int magicPower, int apparationRange, int nobility, int honor, int courage) {
        super(name, surname, magicPower, apparationRange);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; благородство - " + nobility + "; честь - "
                + honor + "; храбрость - " + courage);
    }

    private int sumCharacteristics() {
        return nobility + honor + courage;
    }

    private String getInfo() {
        return "у " + getName() + " " + getSurname() + " благородство = " + getNobility() +
                " баллов, честь = " + getHonor() + " баллов и храбрость = " + getCourage() + " баллов.";
    }

    private Gryffindor[] getWeakAndStrongStudents(Gryffindor student) {
        Gryffindor strongStudent;
        Gryffindor weakStudent;
        if (this.sumCharacteristics() > student.sumCharacteristics()) {
            strongStudent = this;
            weakStudent = student;
        } else {
            strongStudent = student;
            weakStudent = this;
        }
        return new Gryffindor[]{strongStudent, weakStudent};
    }

    public void compare(Gryffindor student) {
        Gryffindor strongStudent = getWeakAndStrongStudents(student)[0];
        Gryffindor weakStudent = getWeakAndStrongStudents(student)[0];
        System.out.println(strongStudent.getInfo());
        System.out.println(weakStudent.getInfo());
        System.out.println(strongStudent.getName() + " " + strongStudent.getSurname() + " лучший Гриффиндорец, чем " +
                weakStudent.getName() + " " + weakStudent.getSurname());
    }
}