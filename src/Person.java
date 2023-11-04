import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private LocalDate yearOfBrith;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBrith(LocalDate yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getYearOfBrith() {
        return yearOfBrith;
    }
}
