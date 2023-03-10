package pages.models;

import enums.AutomationType;
import enums.Priority;
import enums.Type;
import lombok.Builder;
import lombok.Data;


@Data
@Builder

    public class TestCase {
    private String title;
    private String section;
    private Type type;
    private Priority priority;
    private String estimate;
    private String references;
    private AutomationType automationType;
    private String preconditions;
    private String steps;
    private String expectedResult;


    public TestCase(String title, String section, Type type, Priority priority, String estimate, String references, AutomationType automationType, String preconditions, String steps, String expectedResult) {
        this.title = title;
        this.section = section;
        this.type = type;
        this.priority = priority;
        this.estimate = estimate;
        this.references = references;
        this.automationType = automationType;
        this.preconditions = preconditions;
        this.steps = steps;
        this.expectedResult = expectedResult;
    }
}