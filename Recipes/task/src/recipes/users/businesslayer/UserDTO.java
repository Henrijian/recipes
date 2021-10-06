package recipes.users.businesslayer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank(message = "email cannot be blank")
    @Email(message = "email format is not valid")
    private String email;

    @NotBlank(message = "password cannot be blank")
    @Size(min = 8, message = "the minimum length of password is {min}")
    private String password;
}
