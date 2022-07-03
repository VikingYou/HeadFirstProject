package example.builder.components;

/**
 * Created by ycd20 on 2022/07/03
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b,Barker Street,London to Scotland Yard, 8-10 Broadway,London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
