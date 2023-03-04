package pages.models;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder

public class Milestones {
    private String name;
    private String references;
    private String parent;
    private String description;
    private String startDate;
    private String endDate;


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
}