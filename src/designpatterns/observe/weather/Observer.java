package designpatterns.observe.weather;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 21:30
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
