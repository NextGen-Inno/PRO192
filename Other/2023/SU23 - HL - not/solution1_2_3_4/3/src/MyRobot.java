import java.util.List;

public class MyRobot implements IRobot {
    @Override
    public int f1(List<Robot> t) {
        int totalSteps = 0;
        for (Robot robot : t) {
            String label = robot.getLabel();
            if (!label.contains("A") && !label.contains("B")) {
                totalSteps += robot.getStep();
            }
        }
        return totalSteps;
    }

    @Override
    public void f2(List<Robot> t) {
        int minStep = Integer.MAX_VALUE;
        Robot minStepRobot = null;
        for (Robot robot : t) {
            int step = robot.getStep();
            if (step < minStep || (step % 2 != 0 && step == minStep)) {
                minStep = step;
                minStepRobot = robot;
            }
        }
        if (minStepRobot != null) {
            t.remove(minStepRobot);
        }
    }

    @Override
    public void f3(List<Robot> t) {
        if (t.size() >= 6) {
            List<Robot> subList = t.subList(1, 5);
            subList.sort((r1, r2) -> {
                int stepComparison = Integer.compare(r1.getStep(), r2.getStep());
                if (stepComparison == 0) {
                    return r2.getLabel().compareTo(r1.getLabel());
                } else {
                    return stepComparison;
                }
            });
        }
    }
}