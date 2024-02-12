import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int magicPower, int apparationRange, int hardworking, int loyal, int honest) {
        super(name, surname, magicPower, apparationRange);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; трудолюбие - " + hardworking + "; верность - "
                + loyal + "; честность - " + honest);
    }

    private int sumCharacteristics() {
        return hardworking + loyal + honest;
    }

    private String getInfo() {
        return "у " + getName() + " " + getSurname() + " трудолюбие = " + getHardworking() +
                " баллов, верность = " + getLoyal() + " баллов и честность = " + getHonest() + " баллов.";
    }

    private Hufflepuff[] getWeakAndStrongStudents(Hufflepuff student) {
        Hufflepuff strongStudent;
        Hufflepuff weakStudent;
        if (this.sumCharacteristics() > student.sumCharacteristics()) {
            strongStudent = this;
            weakStudent = student;
        } else {
            strongStudent = student;
            weakStudent = this;
        }
        return new Hufflepuff[]{strongStudent, weakStudent};
    }

    public void compare(Hufflepuff student) {
        Hufflepuff strongStudent = getWeakAndStrongStudents(student)[0];
        Hufflepuff weakStudent = getWeakAndStrongStudents(student)[1];
        System.out.println(strongStudent.getInfo());
        System.out.println(weakStudent.getInfo());
        System.out.println(strongStudent.getName() + " " + strongStudent.getSurname() + " лучший Пуффендуец, чем " +
                weakStudent.getName() + " " + weakStudent.getSurname());
    }
}
