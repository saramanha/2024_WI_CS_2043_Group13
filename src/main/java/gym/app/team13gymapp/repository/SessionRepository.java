package gym.app.team13gymapp.repository;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<Session, Long> {
}
