package com.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="ID")
    private String userId;

    @Column(name="NAME")
    private String name;

    @Column(name="E-MAIL")
    private String email;

    @Transient    //not to store in DB
    private List<Rating> ratings=new ArrayList<>();

}
