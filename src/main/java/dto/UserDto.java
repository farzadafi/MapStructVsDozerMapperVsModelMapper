package dto;

import lombok.*;
import model.Address;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Address address;
    private String[] favoriteSubject;
}
