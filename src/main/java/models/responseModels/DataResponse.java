package models.responseModels;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResponse {
    private long id;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String avatar;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getAvatar() { return avatar; }
    public void setAvatar(String value) { this.avatar = value; }
}
