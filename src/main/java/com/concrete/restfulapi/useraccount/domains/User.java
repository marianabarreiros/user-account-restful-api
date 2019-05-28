package com.concrete.restfulapi.useraccount.domains;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String passaword;
    private List<PhoneNumber> phoneNumber;
}
