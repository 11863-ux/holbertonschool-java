import java.util.ArrayList;
import java.util.List;

import activity.Activity;

public class Workflow {
    List<Activity> activities=new ArrayList<>();

    public void registerActivity(Activity activity){
        activities.add(activity);
    }
}
