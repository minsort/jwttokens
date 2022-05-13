package com.sms.jwttokens.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_role")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role(String name) {
        this.name = name;
    }
}
