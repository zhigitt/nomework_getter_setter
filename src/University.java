import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class University {
    private String nameUniver;
    private String city;
    private LocalDate yearFounder;
    private String webSite;


    public void setNameUniver(String nameUniver) {
        this.nameUniver = nameUniver;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setYearFounder(LocalDate yearFounder) {
        this.yearFounder = yearFounder;
    }
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getNameUniver() {
        return nameUniver;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getYearfounder() {
        return yearFounder;
    }

    public String getWebSite() {
        return webSite;
    }

}
