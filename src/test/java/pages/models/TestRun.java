package pages.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class TestRun {
    public TestRun(String name, String references, String milestones, String assignTo, String description) {
        this.name = name;
        this.references = references;
        this.milestones = milestones;
        this.assignTo = assignTo;
        this.description = description;
    }
    private String name;
    private String references;
    private String milestones;
    private String assignTo;
    private String description;

}


