import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


//        Bez parametr
        Student student1 = new Student();
        student1.name = "Beknazar";
        student1.dateOfBirth = LocalDate.of(2007,06,05);
        student1.phoneNumber = "708665544";
        student1.nationality = "kyrgyz";
//        Bez parametr
        Student student2 = new Student();
        student2.name ="Sabina";
       student2.dateOfBirth = LocalDate.of(2004,06,05);
       student2.phoneNumber = "706554433";
       student2.nationality = "kyrgyz";

//       S parametr
        Student student3 =  new Student("Nurkyz",LocalDate.of(2004,05,05),"70665544","kyrgyz");
        Student student4 =  new Student("Kudaiberdi",LocalDate.of(2004,05,05),"70665544","kyrgyz");
        Student student5 =  new Student("Yzaat",LocalDate.of(2004,05,05),"70665544","kyrgyz");

        Student [] students = {student1,student2,student3,student4,student5};
        for (Student student:students) {
            System.out.println(student);
            System.out.println(student.getAge());
        }
    }
}