package models.responseModels;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserChangedResponse {
    private String name;
    private String job;
    private String id;
    private Date createdAt;

    private Date updatedAt;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getJob() { return job; }
    public void setJob(String value) { this.job = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date value) { this.createdAt = value; }
    public Date getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(Date updatedAt) {this.updatedAt = updatedAt;}


}
