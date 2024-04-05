package gym.app.team13gymapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class represents a meal.
 * @author Khalid Hamid.
 */
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int txNumber;
    private String txName;
    private double price;
    private Long personId;

    public Transaction() {}

    public Transaction(String txName, double price, Long personId) {
        this.txName = txName;
        this.price = price;
        this.personId = personId;
    }

    public int getTxNumber() {
        return txNumber;
    }

    public Long getPersonId(){
        return personId;
    }

    public void setPersonId(Long personIdIn){
        personId = personIdIn;
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}