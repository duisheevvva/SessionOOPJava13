import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Nurmuhammed", "Akimbekov", LocalDate.of(1999, 8, 28));
        Person person2 = new Person("Nurkyz", "Zikirdinova", LocalDate.of(2004, 7, 4));
        Person person3 = new Person("Sultan", "Isaev", LocalDate.of(2002, 7, 20));
        Person person4 = new Person("Bektur", "Temirbekov", LocalDate.of(1991, 8, 12));
        Person[] peopleJava = {person1, person2};
        Person[] peopleJs = {person3, person4};

        Mentor mentor1 = new Mentor("Aizat", LocalDate.of(2003, 3, 13), "Java mentor");
        Mentor mentor2 = new Mentor("Ulan", LocalDate.of(1995, 4, 3), "Java mentor");
        Mentor mentor3 = new Mentor("Elizar", LocalDate.of(1995, 4, 3), "JS mentor");
        Mentor mentor4 = new Mentor();
        mentor4.setName("");
        Mentor[] mentorsJava= {mentor1, mentor2};
        Mentor[] mentorsJs = {mentor3, mentor4};

        Group group1 = new Group("Java", LocalDate.of(2024, 1, 8), mentorsJava,peopleJava);
        Group group2 = new Group("Js", LocalDate.of(2024, 1, 8), mentorsJs,peopleJs);

        Group [] groups = {group1,group2};

        Company company = new Company("Peaksoft","Kyrgyzstan",LocalDate.of(2019,11,16),"Esen Niyazov",groups);

        System.out.println(company);
    }
}