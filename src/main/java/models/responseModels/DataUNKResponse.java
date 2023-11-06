package models.responseModels;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataUNKResponse {
    private long id;
    private String name;
    private long year;
    private String color;
    @JsonProperty("pantone_value")
    private String pantoneValue;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getYear() { return year; }
    public void setYear(long value) { this.year = value; }

    public String getColor() { return color; }
    public void setColor(String value) { this.color = value; }

    public String getPantoneValue() { return pantoneValue; }
    public void setPantoneValue(String value) { this.pantoneValue = value; }
}
