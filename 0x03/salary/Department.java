public class Department {

    private double targetValue;
    private double achievedTargetValue;

    public double getTargetValue() {
        return targetValue;
    }

    public double getAchievedTargetValue() {
        return achievedTargetValue;
    }

    public Department(double targetValue, double achievedTargetValue) {
        this.targetValue = targetValue;
        this.achievedTargetValue = achievedTargetValue;
    }

    public boolean reachedTarget() {
        return targetValue <= achievedTargetValue;
    }

}
