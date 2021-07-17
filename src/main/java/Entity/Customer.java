package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String last_name;
    private String first_name;
    private int balance;
    private boolean mortgage_holder;

    /*public Customer(String last_name, String first_name, double balance, boolean mortgage_holder) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.balance = balance;
        this.mortgage_holder = mortgage_holder;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public boolean isMortgage_holder() {
        return mortgage_holder;
    }

    public void setMortgage_holder(boolean mortgage_holder) {
        this.mortgage_holder = mortgage_holder;
    }
}
