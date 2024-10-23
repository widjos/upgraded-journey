package com.example.backend.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.backend.entity.Usuario;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private final Usuario usuario;

    public CustomUserDetails(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return an empty collection if you don't want to use roles
        return java.util.Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return usuario.getPassword(); // Assuming there's a getPassword method
    }

    @Override
    public String getUsername() {
        return usuario.getUsername(); // Assuming there's a getUsername method
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Implement according to your business logic
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Implement according to your business logic
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Implement according to your business logic
    }

    @Override
    public boolean isEnabled() {
        return true; // Implement according to your business logic
    }

    public Usuario getUsuario() {
        return usuario; // Optional: expose the complete Usuario object
    }
}