package io.codelaborators.serverside.models;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Arms extends Workout {

    private String imageUrl;

    public String getImageUrl() {

        return imageUrl;
    }

    public Arms(String workoutName, String bodyPart, int sets, int reps, String weight, int restTime, String fitnessGoal, List<String> steps, String imageUrl) {
        super(workoutName, bodyPart, sets, reps, weight, restTime, fitnessGoal, steps);
        this.imageUrl = imageUrl;
    }

   public Arms(){};
}
