package com.example.backend.authentication;

import com.example.backend.common.ConversionDto;
import com.example.backend.dto.UsuarioDto;
import com.example.backend.entity.Usuario;
import com.example.backend.repository.UsuarioRepository;
import com.example.backend.config.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenticationService {

   @Autowired
   private AuthenticationManager authenticationManager;

   @Autowired
   private UsuarioRepository usuarioRepository;

   @Autowired
   private ConversionDto conversionDto;

   @Autowired
   private JwtService jwtService;


   private final PasswordEncoder passwordEncoder;

    public AuthenticationService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    public AuthenticationResponse register(UsuarioDto usuarioDto){
  

        Usuario usuario = conversionDto.convertirUsuarioToUsuarioDto(usuarioDto);
     
        Usuario temporal = new Usuario();
        temporal.setPassword(passwordEncoder.encode(usuario.getPassword()));

        usuario.setPassword(temporal.getPassword());
		Object temp =  new ResponseEntity<>(usuarioRepository.save(usuario),null, HttpStatus.ACCEPTED);
			
		
        String token = jwtService.generateToken(usuario, generateExtraClaims(usuario));
        return  new AuthenticationResponse(token);
    }




    public AuthenticationResponse login(AuthenticationRequest authenticationRequest){
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                authenticationRequest.getUsername(), authenticationRequest.getPassword()
        );
        authenticationManager.authenticate(authToken);
        Usuario usuario = usuarioRepository.findByUsername(authenticationRequest.getUsername()).get();
        String jwt = jwtService.generateToken(usuario, generateExtraClaims(usuario));
        return new AuthenticationResponse(jwt);
    }




    private Map<String, Object> generateExtraClaims(Usuario user) {
        Map<String, Object> extraClaims = new HashMap<>();
        extraClaims.put("name", user.getUsername());
        return extraClaims;
    }
}
