package com.concrete.restfulapi.useraccount.domains;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class PhoneNumber {

    private Long number;
    private int ddd;
}
