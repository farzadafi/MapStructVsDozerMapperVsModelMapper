package model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Address address;
    private List<String> favoriteSubject;
}
