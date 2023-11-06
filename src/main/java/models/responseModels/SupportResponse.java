package models.responseModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupportResponse {
    private String url;
    private String text;

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }
}
