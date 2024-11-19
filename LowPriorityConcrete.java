
import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = "Ignore";
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void setStatus(String status) {
        this.status = "Done";
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
