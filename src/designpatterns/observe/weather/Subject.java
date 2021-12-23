package designpatterns.observe.weather;


/**
 * @author ycd20
 * @date 2021/12/23
 * @time 21:29
 */
public interface Subject {
    public void registerObserve(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
