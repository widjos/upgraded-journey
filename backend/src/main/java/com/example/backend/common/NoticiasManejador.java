package com.example.backend.common;

import com.example.backend.pojo.Post;
import com.example.backend.pojo.Root;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NoticiasManejador {

    final static String WEBIP_NEWS = "https://api.webz.io/newsApiLite?";
	final static String MY_TOKEN = "token=579e5d80-c8ff-4910-b2de-36a935c0948d";
    RestTemplate template;

    public NoticiasManejador(){
        template = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		template.setMessageConverters(messageConverters);
    }


    public List<Post> getNoticias(String noticia){
        Root response  = this.template.getForObject(WEBIP_NEWS+MY_TOKEN+"&q="+noticia, Root.class);

        List<Post>  tempPosts = new ArrayList<Post>();
        response.posts.forEach( temp -> {
            tempPosts.add(temp);
        });
        return tempPosts;

    }
}
