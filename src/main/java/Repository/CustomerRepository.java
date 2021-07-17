package Repository;


import Entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    List<Customer> findAll();
    List<Customer> findByName(String name);

}
