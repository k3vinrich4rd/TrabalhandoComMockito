package com.example.aprendendoMockito.controller;

import com.example.aprendendoMockito.model.UsuarioModel;
import com.example.aprendendoMockito.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarNovoUsuario(@RequestBody UsuarioModel usuarioModel) {
        UsuarioModel usuario = usuarioService.cadastrarUsuario(usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> exibirUsuariosCadastrados() {
        return ResponseEntity.ok(usuarioService.exibirTodosUsuarios());
    }
}
