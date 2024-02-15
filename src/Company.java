import java.time.LocalDate;
import java.util.Arrays;

public class Company {
   private String name;
   private String country;
   private LocalDate yearOfFoundation;
    private String founder;
   private Group [] groups;


    public Company() {
    }

    public Company(String name, String country, LocalDate yearOfFoundation, String founder, Group[] groups) {
        this.name = name;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(LocalDate yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }




    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ",\n country='" + country + '\'' +
                ",\n yearOfFoundation=" + yearOfFoundation +
                ", \nfounder='" + founder + '\'' +
                ", \ngroups=" + Arrays.toString(groups) +
                '}';
    }
}
