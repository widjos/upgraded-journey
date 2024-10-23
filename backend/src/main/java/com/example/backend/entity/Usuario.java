package com.example.backend.entity;


import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.stream.Collectors;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//To use the @Data annotation you should add the Lombok dependency.
@Data
@Table(name = "usuario")
@Entity
public class Usuario implements Serializable {

    private static final  long serialVersionUID = 3493288337097925498L;    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="created_at")
    private Date  createdAt;

    //     @Override
    // public Collection<? extends GrantedAuthority> getAuthorities() {
    //     List<GrantedAuthority> authorities = role.getPermissions().stream().map(
    //             permissionEnum -> new SimpleGrantedAuthority(permissionEnum.name())
    //     ).collect(Collectors.toList());

    //     authorities.add(new SimpleGrantedAuthority("TEMP"));


    //     return authorities;
    // }

}

