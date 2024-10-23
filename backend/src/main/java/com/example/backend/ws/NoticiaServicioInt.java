package com.example.backend.ws;

import com.example.backend.pojo.Post;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/noticia")
public interface NoticiaServicioInt {

    @PostMapping(path="/buscar")
    public List<Post> buscar( String noticia);

}
