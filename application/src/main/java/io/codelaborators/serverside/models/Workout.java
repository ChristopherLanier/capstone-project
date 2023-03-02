package io.codelaborators.serverside.models;


import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.List;

@Entity
public class Workout {

    @GeneratedValue
    @Id
    private Long id;

    private String workoutName;
    private String bodyPart;
    private int sets;
    private int reps;
    private String weight;
    private int restTime;
    private String fitnessGoal;
    @ElementCollection
    @Lob
    private List<String> steps;


    public Long getId() {

        return id;
    }

    public String getWorkoutName() {

        return workoutName;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public int getSets() {

        return sets;
    }

    public int getReps() {

        return reps;
    }

    public String getWeight() {

        return weight;
    }

    public int getRestTime() {

        return restTime;
    }

    public String getFitnessGoal() {

        return fitnessGoal;
    }

    public List<String> getSteps() {

        return steps;
    }


    public Workout(String workoutName, String bodyPart, int sets, int reps, String weight, int restTime, String fitnessGoal, List<String> steps) {
        this.workoutName = workoutName;
        this.bodyPart = bodyPart;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.restTime = restTime;
        this.fitnessGoal = fitnessGoal;
        this.steps = steps;
    }

    public Workout(){};

    public static interface WorkoutRepository extends CrudRepository<Workout, Long> {


    }
}
