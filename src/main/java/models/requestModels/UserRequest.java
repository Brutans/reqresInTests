package models.requestModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String name;
    private String job;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getJob() { return job; }
    public void setJob(String value) { this.job = value; }
}
