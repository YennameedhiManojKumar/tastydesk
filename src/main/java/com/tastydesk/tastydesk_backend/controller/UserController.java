import com.tastydesk.tastydesk_backend.model.User;

import com.tastydesk.model.User;
import com.tastydesk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "User already exists!";
        }

        userRepository.save(user);
        return "User registered successfully!";
    }
}
