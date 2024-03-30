package gym.app.team13gymapp.repository;

import gym.app.team13gymapp.model.TrainingSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<TrainingSession, Long> {
}
