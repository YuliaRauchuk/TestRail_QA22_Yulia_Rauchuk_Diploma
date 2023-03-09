package pages.models;


import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@Data
@Builder

public class TestPlan {
    public TestPlan (String name, String milestone, String description) {
        super();
        this.name = name;
        this.milestone = milestone;
        this.description = description;
    }
    private final String name;
    private final String milestone;
    private final String description;

    public TestPlan (TestPlanBuilder testPlanBuilder) {

        this.name = testPlanBuilder.name;
        this.milestone = testPlanBuilder.milestone;
        this.description = testPlanBuilder.description;

    }
    @Override
    public String toString() {
        return "TestPlan{" +
                ", name='" + name + '\'' +
                ", milestone='" + milestone + '\'' +
                ", description='" + description + '\'' +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, milestone, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPlan testPlan = (TestPlan) o;
        return Objects.equals(name, testPlan.name)
                && Objects.equals(milestone, testPlan.milestone)
                && Objects.equals(description, testPlan.description);
    }
}