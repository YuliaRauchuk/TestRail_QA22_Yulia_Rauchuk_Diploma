package pages.models;

import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

@Data
@Builder

public class Milestones {
    public Milestones(String name, String references, String parent, String description, String startDate, String endDate) {
        this.name = name;
        this.references = references;
        this.parent = parent;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private String name;
    private String references;
    private String parent;
    private String description;
    private String startDate;
    private String endDate;

}


