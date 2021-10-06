package recipes.users.presentation;

import recipes.users.businesslayer.User;
import recipes.users.businesslayer.UserService;
import recipes.users.businesslayer.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UsersController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<Void> addUser(@Valid @RequestBody UserDTO userDTO) {
        try {
            Optional<User> foundUser = userService.findUserByEmail(userDTO.getEmail());
            if (foundUser.isPresent()) {
                return ResponseEntity.badRequest().build();
            }
            User newUser = new User(userDTO, passwordEncoder);
            userService.addUser(newUser);
            return ResponseEntity.ok().build();
        } catch (ConstraintViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
