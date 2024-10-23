package com.example.backend.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.backend.repository.UsuarioRepository;
import com.example.backend.ws.UsuarioServicioInt;
import com.example.backend.common.ConversionDto;
import com.example.backend.dto.UsuarioDto;
import com.example.backend.entity.Usuario;

@Component
public class UsuarioServicio implements UsuarioServicioInt{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
	ConversionDto conversionDto;

    @Override
    public List<Usuario> buscar(){
        return usuarioRepository.findAll();
    }

    @Override
    public ResponseEntity<Usuario> crear(UsuarioDto usuarioDto) {
       	
        try{
        Usuario usuario = conversionDto.convertirUsuarioToUsuarioDto(usuarioDto);
			return new ResponseEntity<>(usuarioRepository.save(usuario),null, HttpStatus.ACCEPTED);
			
		}catch(Exception exp) {
			return new ResponseEntity<>(null,null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

    @Override
    public Optional<Usuario> findByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
    }

  

  

}
