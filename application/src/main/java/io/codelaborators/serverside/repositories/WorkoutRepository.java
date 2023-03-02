package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout,Long> {

}
