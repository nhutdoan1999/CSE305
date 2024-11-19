
import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administrator will contact you immediately!");
    }
}
