import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int apparationRange;

    public Hogwarts(String name, String surname, int magicPower, int apparationRange) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.apparationRange = apparationRange;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getApparationRange() {
        return apparationRange;
    }

    public void setApparationRange(int apparationRange) {
        this.apparationRange = apparationRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && apparationRange == hogwarts.apparationRange &&
                Objects.equals(name, hogwarts.name) && Objects.equals(surname, hogwarts.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, magicPower, apparationRange);
    }

    public void print() {
        System.out.print("Студент " + name + " " + surname + ": cила магии - "
                + magicPower + "; дальность трансгрессии - " + apparationRange);
    }

    private int sumCharacteristics() {
        return magicPower + apparationRange;
    }

    protected Hogwarts[] getWeakAndStrongStudents(Hogwarts student) {
        Hogwarts strongStudent;
        Hogwarts weakStudent;
        if (this.sumCharacteristics() > student.sumCharacteristics()) {
            strongStudent = this;
            weakStudent = student;
        } else {
            strongStudent = student;
            weakStudent = this;
        }
        return new Hogwarts[]{strongStudent, weakStudent};
    }

    public void compare(Hogwarts student) {
        Hogwarts strongStudent = getWeakAndStrongStudents(student)[0];
        Hogwarts weakStudent = getWeakAndStrongStudents(student)[0];
        System.out.println(strongStudent.name + " " + strongStudent.surname +
                "  большей мощностью магии и дальностью трансгрессии, чем " + weakStudent.getName() + " "
                + weakStudent.getSurname() + ".");
    }
}
