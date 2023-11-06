package models.responseModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private long id;
    private String token;
    private String error;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }

    public String getError() { return error; }
    public void setError(String value) { this.error = value; }
}
