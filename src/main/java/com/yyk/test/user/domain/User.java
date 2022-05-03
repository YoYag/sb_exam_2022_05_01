package com.yyk.test.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

 @Entity
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public LocalDateTime regDate;
    public LocalDateTime updateDate;
    public String email;
    public String password;
    public String name;
}
