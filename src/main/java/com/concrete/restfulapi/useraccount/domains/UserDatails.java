package com.concrete.restfulapi.useraccount.domains;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class UserDatails {

    private User user;
    private Date created;
    private Date modified;
    private Date lastLogin;
    //private token;

}
