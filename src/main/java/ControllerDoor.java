import java.util.concurrent.locks.Lock;

public class ControllerDoor {

    private DomainLock doorLock;

    public ControllerDoor(DomainLock doorLock) {
        this.doorLock = doorLock;
    }

    public void addLock() {
        System.out.println("Lock has been added to door");
    }
}
