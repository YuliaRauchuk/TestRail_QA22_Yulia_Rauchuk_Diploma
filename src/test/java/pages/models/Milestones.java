package pages.models;

import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import java.util.Objects;

@Data
@Builder

public class Milestones {
    public Milestones(String name, String references, String parent, String description, String startDate, String endDate) {
        super();
        this.name = name;
        this.references = references;
        this.parent = parent;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private final String name;
    private final String references;
    private final String parent;
    private final String description;
    private final String startDate;
    private final String endDate;


    public Milestones (MilestonesBuilder milestonesBuilder) {

        this.name = milestonesBuilder.name;
        this.references = milestonesBuilder.references;
        this.parent = milestonesBuilder.parent;
        this.description = milestonesBuilder.description;
        this.startDate = milestonesBuilder.startDate;
        this.endDate = milestonesBuilder.endDate;

    }
    @Override
    public String toString() {
        return "Milestones{" +
                ", name='" + name + '\'' +
                ", references='" + references + '\'' +
                ", parent'" + parent + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate=" + endDate +
                '}';
    }
        @Override
        public int hashCode() {
            return Objects.hash(name, references, parent, description, startDate, endDate);
            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Milestones milestones = (Milestones) o;
            return Objects.equals(name, milestones.name)
                    && Objects.equals(references, milestones.references)
                    && Objects.equals(parent, milestones.parent)
                    && Objects.equals(description, milestones.description)
                    && Objects.equals(startDate, milestones.startDate)
                    && Objects.equals(endDate, milestones.endDate);
    }

    @DataProvider(name="Milestones")
    public static Object[][] milestoneTestData() {
        return new Milestones[][]{
                {Milestones.builder()
                        .name("")
                        .references("")
                        .parent("")
                        .description("")
                        .startDate("")
                        .endDate("").build()
                }
        };
    }
}
