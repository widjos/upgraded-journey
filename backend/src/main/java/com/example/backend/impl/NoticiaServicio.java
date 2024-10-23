package com.example.backend.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.backend.common.NoticiasManejador;
import com.example.backend.pojo.Post;
import com.example.backend.ws.NoticiaServicioInt;

@Component
public class NoticiaServicio implements NoticiaServicioInt{

    NoticiasManejador manejador = new NoticiasManejador();

    @Override
    public List<Post> buscar(String noticia) {
        return manejador.getNoticias(noticia);
    }

}
