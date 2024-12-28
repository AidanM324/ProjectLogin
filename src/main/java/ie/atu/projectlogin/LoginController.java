package ie.atu.projectlogin;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {


    @PostMapping("/create")
    public ResponseEntity<String> create(@Valid @RequestBody Account account) {
        //personService.savePerson(person);
        //String details = paymentClient.makePayment(person);
        System.out.println("Details from other service / " + details);
        return new ResponseEntity<>("Person created successfully ", HttpStatus.OK);
    }

}
