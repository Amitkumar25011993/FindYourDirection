package Design;

import java.util.List;

/**
 * Created by AmitKumar on 4/25/2017.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
