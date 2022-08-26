package dto;

import lombok.*;

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
    private AddressDto address;
    private String[] favoriteSubject;
}
