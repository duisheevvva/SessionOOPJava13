import java.time.LocalDate;

public class Mentor {
   private String name;
   private   LocalDate dateOfBirth;
   private String position;

    public Mentor() {
    }

    public Mentor(String name, LocalDate dateOfBirth, String position) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "\nname='" + name + '\'' +
                ",\n dateOfBirth=" + dateOfBirth +
                ",\n position='" + position + '\'' +
                '}';
    }
}
