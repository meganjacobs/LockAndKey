public class FactoryLock extends DomainLock {

    private Integer keyValue;
    private boolean locked;

    public FactoryLock(Integer keyValue) {
        this.keyValue = keyValue;
        locked = true;
    }

    public boolean unlock(Integer keyValue) {
        if (this.keyValue.equals(keyValue)) {
            locked = false;
            return true;
        }
        locked = true;
        return false;
    }

    public void lock() {
        locked = true;
    }

    public boolean isLocked() {
        return locked;
    }
}
