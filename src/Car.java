import java.time.LocalDate;

public class Car {
    private String marka;
    private LocalDate yearOfIssue;
    private String country;
    private String color;
    private double price;
    private double volume;

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMarka() {
        return marka;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }
}
