package pages.models;

import enums.AutomationType;
import enums.Priority;
import enums.Type;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;


@Data
@Builder

    public class TestCase {

    private final String title;
    private final String section;
    private final Type type;
    private final Priority priority;
    private final String estimate;
    private final String references;
    private final AutomationType automationType;
    private final String preconditions;
    private final String steps;
    private final String expectedResult;


    public TestCase (TestCaseBuilder testCaseBuilder) {

        this.title = testCaseBuilder.title;
        this.section = testCaseBuilder.section;
        this.type = testCaseBuilder.type;
        this.priority = testCaseBuilder.priority;
        this.estimate = testCaseBuilder.estimate;
        this.references = testCaseBuilder.references;
        this.automationType = testCaseBuilder.automationType;
        this.preconditions = testCaseBuilder.preconditions;
        this.steps= testCaseBuilder.steps;
        this.expectedResult = testCaseBuilder.expectedResult;


    }
    @Override
    public String toString() {
        return "TestCase{" +
                ", title='" + title + '\'' +
                ", section='" + section + '\'' +
                ", type='" + type + '\'' +
                ", priority='" + priority + '\'' +
                ", estimate='" + estimate + '\'' +
                ", references='" + references + '\'' +
                ", automationType'" + automationType + '\'' +
                ", preconditions='" + preconditions + '\'' +
                ", steps='" + steps + '\'' +
                ", expectedResult=" + expectedResult +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, section, type, priority, estimate, references, automationType, preconditions, steps, expectedResult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestCase testCase = (TestCase) o;
        return Objects.equals(title, testCase.title)
                && Objects.equals(section, testCase.section)
                && Objects.equals(type, testCase.type)
                && Objects.equals(priority, testCase.priority)
                && Objects.equals(estimate, testCase.estimate)
                && Objects.equals(references, testCase.references)
                && Objects.equals(automationType, testCase.automationType)
                && Objects.equals(preconditions, testCase.preconditions)
                && Objects.equals(steps, testCase.steps)
                && Objects.equals(expectedResult, testCase.expectedResult);
    }
}