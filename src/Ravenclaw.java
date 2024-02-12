import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int сreativity;

    public Ravenclaw(String name, String surname, int magicPower, int apparationRange, int smart, int wise, int witty, int сreativity) {
        super(name, surname, magicPower, apparationRange);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.сreativity = сreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getСreativity() {
        return сreativity;
    }

    public void setСreativity(int сreativity) {
        this.сreativity = сreativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return smart == ravenclaw.smart && wise == ravenclaw.wise && witty == ravenclaw.witty && сreativity == ravenclaw.сreativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty, сreativity);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; ум - " + smart + "; мудрость - "
                + wise + "; остроумие - " + witty + ": творчество - " + сreativity);
    }

    private int sumCharacteristics() {
        return smart + wise + witty + сreativity;
    }

    private String getInfo() {
        return "у " + getName() + " " + getSurname() + " ум = " + getSmart() + " баллов, мудрость = " +
                getWise() + " баллов. остроумие = " + getWitty() + " баллов и творчество = " +
                getСreativity() + "баллов.";
    }

    private Ravenclaw[] getWeakAndStrongStudents(Ravenclaw student) {
        Ravenclaw strongStudent;
        Ravenclaw weakStudent;
        if (this.sumCharacteristics() > student.sumCharacteristics()) {
            strongStudent = this;
            weakStudent = student;
        } else {
            strongStudent = student;
            weakStudent = this;
        }
        return new Ravenclaw[]{strongStudent, weakStudent};
    }

    public void compare(Ravenclaw student) {
        Ravenclaw strongStudent = getWeakAndStrongStudents(student)[0];
        Ravenclaw weakStudent = getWeakAndStrongStudents(student)[1];
        System.out.println(strongStudent.getInfo());
        System.out.println(weakStudent.getInfo());
        System.out.println(strongStudent.getName() + " " + strongStudent.getSurname() + " лучший Когтевранец, чем " +
                weakStudent.getName() + " " + weakStudent.getSurname());
    }
}
