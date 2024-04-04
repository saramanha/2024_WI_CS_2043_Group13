package gym.app.team13gymapp.repository;

import gym.app.team13gymapp.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
    List<Meal> findByPersonId(int personId);
}
