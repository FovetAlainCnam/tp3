package question1;

public class Broker implements Observer {
    private boolean changeDetected;

    public boolean isChangeDetected() {
        return changeDetected;
    }

    public void setChangeDetected(boolean changeDetected) {
        this.changeDetected = changeDetected;
    }

    @Override
    public void update() {
        this.changeDetected = true;
    }
}
