package com.example.backend.common;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.backend.entity.Usuario;
import com.example.backend.dto.UsuarioDto;

@Component
public class ConversionDto {

    private static final ModelMapper MP  = new ModelMapper();

    public Usuario convertirUsuarioToUsuarioDto(UsuarioDto usuarioDto){
        return MP.map(usuarioDto, Usuario.class);
    }

}
