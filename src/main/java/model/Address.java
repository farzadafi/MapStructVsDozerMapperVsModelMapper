package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String county;
    private String province;
    private String city;
}
