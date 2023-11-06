package models.responseModels;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserListResponse {
    private long page;
    @JsonProperty("per_page")
    private long perPage;
    private long total;
    @JsonProperty("total_pages")
    private long totalPages;
    private DataResponse[] data;
    private SupportResponse support;

    public long getPage() { return page; }
    public void setPage(long value) { this.page = value; }

    public long getPerPage() { return perPage; }
    public void setPerPage(long value) { this.perPage = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }

    public long getTotalPages() { return totalPages; }
    public void setTotalPages(long value) { this.totalPages = value; }

    public DataResponse[] getData() { return data; }
    public void setData(DataResponse[] value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
