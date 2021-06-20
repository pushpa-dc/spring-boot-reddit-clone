package com.pushpa.reddit.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Instant createdDate;
}
