package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Workout;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin

public class WorkoutController {

    @Resource
private WorkoutController workoutRepo;

}
