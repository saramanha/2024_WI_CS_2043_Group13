package gym.app.team13gymapp.repository;

import gym.app.team13gymapp.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    List<Transaction> findByPersonId(long personId);
}
