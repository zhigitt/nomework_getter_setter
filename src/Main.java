import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Objekts
        University univer = new University();
        University univer1 = new University();
        University univer2 = new University();

        School school = new School();
        School school1 = new School();
        School school2 = new School();

        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

        //University
        univer.setNameUniver("KNU");
        univer.setCity("Bishkek");
        univer.setYearFounder(LocalDate.of(2000, 2, 2));
        univer.setWebSite("knu.kg");

        univer1.setNameUniver("AUCA");
        univer1.setCity("Bishkek");
        univer1.setYearFounder(LocalDate.of(2000, 2, 2));
        univer1.setWebSite("auca.kg");

        univer2.setNameUniver("BGU");
        univer2.setCity("Bishkek");
        univer2.setYearFounder(LocalDate.of(2002, 2, 12));
        univer2.setWebSite("bgu.kg");


        //School
        school.setNumberSchool(21);
        school.setDirector("Moldaliev Adil");
        school.setNumberOfStudents(500);
        school.setWebSiteSchool("merktep1.com");

        school1.setNumberSchool(21);
        school1.setDirector("Myrzaiym Keldibekova");
        school1.setNumberOfStudents(4323);
        school1.setWebSiteSchool("merktep12312.com");

        school2.setNumberSchool(44);
        school2.setDirector("Dinara Abasova");
        school2.setNumberOfStudents(2222);
        school2.setWebSiteSchool("merktep323.com");


        //Car
        car.setMarka("Mers");
        car.setYearOfIssue(LocalDate.of(2022, 02, 22));
        car.setCountry("Germany");
        car.setColor("red");
        car.setPrice(22.000);
        car.setVolume(5.5);

        car1.setMarka("Audi");
        car1.setYearOfIssue(LocalDate.of(2022, 02, 22));
        car1.setCountry("Germany");
        car1.setColor("black");
        car1.setPrice(10.000);
        car1.setVolume(2.5);

        car2.setMarka("Porshe");
        car2.setYearOfIssue(LocalDate.of(2022, 02, 22));
        car2.setCountry("Germany");
        car2.setColor("white");
        car2.setPrice(25.000);
        car2.setVolume(4.5);


        //Person
        person.setName("Zhigit");
        person.setLastName("Turumbekov");
        person.setYearOfBrith(LocalDate.of(2003,01,15));

        person1.setName("Aliaskar ");
        person1.setLastName("Temirbekov");
        person1.setYearOfBrith(LocalDate.of(2003,06,14));

        person2.setName("Myrzaiym");
        person2.setLastName("Keldibekova");
        person2.setYearOfBrith(LocalDate.of(2003,03,17));


        //Arrays
        University[] massUniver = {univer, univer1, univer2};
        School[] massSchool = {school, school1, school2};
        Car[] massCar = {car, car1, car2};
        Person[] massPerson = {person, person1, person2};



        //Console
        System.out.println("========== UNIVERSITIES ==========");
        for (University unik : massUniver) {
            System.out.println(STR."""
               Name uniuver: \{unik.getNameUniver()}
               City: \{unik.getCity()}
               Year founder: \{unik.getYearfounder()}
               Website: \{unik.getWebSite()}
                """);
        }


        System.out.println("========== SCHOOLS ==========");
        for (School sch : massSchool) {
            System.out.println(STR."""
               Number school: \{sch.getNumberSchool()}
               Director: \{sch.getDirector()}
               Number of students: \{sch.getNumberOfStudents()}
               Website: \{sch.getWebSiteSchool()}
                """);
        }


        System.out.println("========== CARS ==========");
        for (Car bumBum : massCar) {
            System.out.println(STR."""
               Marka: \{bumBum.getMarka()}
               Year of issue: \{bumBum.getYearOfIssue()}
               Country: \{bumBum.getCountry()}
               Color: \{bumBum.getColor()}
               Price: \{bumBum.getPrice()}
               Volume: \{bumBum.getVolume()}
                """);
        }


        System.out.println("========== PERSONS ==========");
        for (Person per: massPerson) {
            System.out.println(STR."""
               Name: \{per.getName()}
               Last name: \{per.getLastName()}
               Year of brith: \{per.getYearOfBrith()}
                """);
        }

    }
}