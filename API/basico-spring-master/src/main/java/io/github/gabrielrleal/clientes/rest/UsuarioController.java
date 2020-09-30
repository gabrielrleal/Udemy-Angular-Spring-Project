package io.github.gabrielrleal.clientes.rest;

import io.github.gabrielrleal.clientes.exception.UsuarioCadastradoException;
import io.github.gabrielrleal.clientes.model.entity.Usuario;
import io.github.gabrielrleal.clientes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import io.github.gabrielrleal.clientes.model.repository.UsuarioRepository;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        try{
            service.salvar(usuario);
        }catch (UsuarioCadastradoException e){
            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, e.getMessage() );
        }
    }
}