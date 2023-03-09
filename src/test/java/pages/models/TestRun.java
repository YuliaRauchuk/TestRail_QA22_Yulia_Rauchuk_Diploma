package pages.models;

import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@Data
@Builder

public class TestRun {
    public TestRun (String name, String references, String milestones, String assignTo, String description) {
        super();
        this.name = name;
        this.references = references;
        this.milestones = milestones;
        this.assignTo = assignTo;
        this.description = description;
    }
    private final String name;
    private final String references;
    private final String milestones;
    private final String assignTo;
    private final String description;

    public TestRun (TestRunBuilder testRunBuilder) {

        this.name = testRunBuilder.name;
        this.references = testRunBuilder.references;
        this.milestones = testRunBuilder.milestones;
        this.assignTo = testRunBuilder.assignTo;
        this.description = testRunBuilder.description;

    }
    @Override
    public String toString() {
        return "TestRun{" +
                ", name='" + name + '\'' +
                ", references='" + references + '\'' +
                ", milestones='" + milestones + '\'' +
                ", assignTo='" + assignTo + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, references,milestones, assignTo, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestRun testRun = (TestRun) o;
        return Objects.equals(name, testRun.name)
                && Objects.equals(references, testRun.references)
                && Objects.equals(milestones, testRun.milestones)
                && Objects.equals(assignTo, testRun.assignTo)
                && Objects.equals(description, testRun.description);
    }
}