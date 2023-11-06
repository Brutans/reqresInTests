package models.responseModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private DataResponse data;
    private SupportResponse support;

    public DataResponse getData() { return data; }
    public void setData(DataResponse value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
