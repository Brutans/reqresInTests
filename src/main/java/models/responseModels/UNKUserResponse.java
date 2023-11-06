package models.responseModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UNKUserResponse {
    private DataUNKResponse data;
    private SupportResponse support;

    public DataUNKResponse getData() { return data; }
    public void setData(DataUNKResponse value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
