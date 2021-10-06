package recipes.users.businesslayer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String encodedPassword;

    public User(UserDTO userDTO, PasswordEncoder passwordEncoder) {
        this.email = userDTO.getEmail();
        this.encodedPassword = passwordEncoder.encode(userDTO.getPassword());
    }

    public User(UserDetails userDetails) {
        this.email = userDetails.getUsername();
        this.encodedPassword = userDetails.getPassword();
    }
}
