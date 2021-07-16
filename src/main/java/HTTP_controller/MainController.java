package HTTP_controller;

import Entity.Customer;
import Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path= "/demo")

public class MainController {

    @Autowired

    private CustomerRepository customerRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewCustomer (@RequestParam String last_name,
                                                @RequestParam String first_name,
                                                @RequestParam double balance,
                                                @RequestParam boolean mortgage_holder) {
        Customer newCustomer = new Customer();
        newCustomer.setLast_name(last_name);
        newCustomer.setFirst_name(first_name);
        newCustomer.setBalance(balance);
        newCustomer.setMortgage_holder(mortgage_holder);
        customerRepository.save(newCustomer);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
}

