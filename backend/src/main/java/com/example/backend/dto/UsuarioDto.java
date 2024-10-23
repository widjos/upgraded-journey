package com.example.backend.dto;

import java.sql.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; 
    private String username;
    private String email;
    private String password;
    private Date createdAt;


}
