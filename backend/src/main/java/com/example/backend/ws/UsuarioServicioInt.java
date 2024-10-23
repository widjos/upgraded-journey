package com.example.backend.ws;

import java.util.List;
import java.util.Optional;

import com.example.backend.dto.UsuarioDto;
import com.example.backend.entity.Usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuario")
@CrossOrigin
public interface  UsuarioServicioInt {

    @GetMapping(path="/buscar")
    public List<Usuario> buscar();

    @PostMapping(path="/crear")
    public ResponseEntity<Usuario> crear(@RequestBody UsuarioDto usuarioDto);

    @GetMapping(path="/buscar/usuario")
	public Optional<Usuario> findByUsername(String username);

    
}
