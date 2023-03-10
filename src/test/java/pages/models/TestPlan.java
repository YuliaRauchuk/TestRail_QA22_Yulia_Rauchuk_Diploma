package pages.models;


import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class TestPlan {
    public TestPlan(String name, String milestone, String description) {
        this.name = name;
        this.milestone = milestone;
        this.description = description;
    }

    private String name;
    private String milestone;
    private String description;

}