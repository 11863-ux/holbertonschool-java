import food.Food;
import mood.Angry;
import mood.Happy;
import mood.Mood;
import mood.Sad;
import mood.VeryHappy;

public class Character {
    int happinessPoints;


    public Mood getCurrentMood(){
        if(happinessPoints < -5){
            return new Angry();
        }else if(happinessPoints >-5 && happinessPoints < 0){
            return new Sad();
        }else if(happinessPoints >1 && happinessPoints < 15){
            return new Happy();
        }else{
            return new VeryHappy();
        }
    }

    public void eat(Food[] foods){
        int happinessPoint = 0;
        for (Food food : foods){
            happinessPoint+=food.getHappinessPoints();
        }
        setHappinessPoints(happinessPoint);
    }

    public void setHappinessPoints(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }

    @Override
    public String toString() {
        if(getCurrentMood().getClass().getSimpleName().equals("VeryHappy")){
            return String.format("%d - Very Happy",happinessPoints);
        }else{
            return String.format("%d - %s",happinessPoints,getCurrentMood().getClass().getSimpleName());
        }
    }
}
