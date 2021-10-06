package recipes.users.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.users.persistence.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
