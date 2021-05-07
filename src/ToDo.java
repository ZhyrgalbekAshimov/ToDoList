import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDo {

    private String description;
    private Date startDate;
    private Date endDate;
    private Enums status;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    ToDo(String description, String startDate, String endDate) throws ParseException {
        this.description = description;
        this.startDate = formatter.parse(startDate);
        this.endDate = formatter.parse(endDate);;
        this.status = Enums.OPEN;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getStartDateStr() {
        return formatter.format(startDate);
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    String getEndDateStr() {
        return formatter.format(endDate);
    }

    void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    Enums getStatus() {
        return status;
    }

    void setStatus(Enums status) {
        this.status = status;
    }

    Date getStartDate() {
        return startDate;
    }

    Date getEndDate() {
        return endDate;
    }

}
