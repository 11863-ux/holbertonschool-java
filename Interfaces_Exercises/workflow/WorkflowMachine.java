public class WorkflowMachine {

    public void execute(Workflow workflow){
        for (Activity activity: workflow.activities){
            activity.execute();
        }
    }
}
