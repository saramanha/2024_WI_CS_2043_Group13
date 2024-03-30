package gym.app.team13gymapp.repository;

import gym.app.team13gymapp.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
}
