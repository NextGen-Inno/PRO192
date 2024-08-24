
import java.util.ArrayList;

public class TaskList extends ArrayList<String> implements ITask {

    public void addTask(String task) {
        this.add(task);
    }

    @Override
    public double getWorkingHours(String place) {
        double totalWorkingHours = 0.0;
        for (String task : this) {
            String[] taskInfo = task.split("@");
            if (taskInfo[1].equalsIgnoreCase(place)) {
                if (taskInfo[1].equalsIgnoreCase("hcm")) {
                    totalWorkingHours += 5.0;
                } else {
                    totalWorkingHours += 2.0;
                }
            }
        }
        return totalWorkingHours;
    }

    @Override
    public String getTaskName(String place) {
        StringBuilder taskNames = new StringBuilder();
        for (String task : this) {
            String[] taskInfo = task.split("@");
            if (taskInfo[1].equalsIgnoreCase(place)) {
                taskNames.append(taskInfo[0]).append(";");
            }
        }
        return taskNames.toString();
    }
}
