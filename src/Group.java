import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.time.LocalDate;
import java.util.Arrays;

public class Group{
   private String name;
   private LocalDate startDate;
    private Mentor [] mentors;
    private Person[] person;

    public Group() {
    }

    public Group(String name, LocalDate startDate, Mentor[] mentors, Person[] person) {
        this.name = name;
        this.startDate = startDate;
        this.mentors = mentors;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Group{" +
                "\name='" + name + '\'' +
                ",\n startDate=" + startDate +
                ", \nmentors=" + Arrays.toString(mentors) +
                ", \nperson=" + Arrays.toString(person) +
                '}';
    }
}

