package models.requestModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String email;
    private String password;

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getPassword() { return password; }
    public void setPassword(String value) { this.password = value; }
}
