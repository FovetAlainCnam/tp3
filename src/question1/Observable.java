package question1;


import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observerList;

    Observable() {
        this.observerList = new ArrayList<>();
    }

    public void add(Observer o) {
        this.observerList.add(o);
    }

    public void remove(Observer o) {
        this.observerList.remove(o);
    }

    public int getObserverCount() {
        return this.observerList.size();
    }

    public void notifyObs() {
        for (Observer o: this.observerList) {
            o.update();
        }
    }

}
