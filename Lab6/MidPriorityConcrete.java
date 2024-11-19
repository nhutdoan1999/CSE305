
import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = "Medium";
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDay = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + this.expireDay);
    }
}
