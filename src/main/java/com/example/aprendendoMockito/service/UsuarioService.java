package com.example.aprendendoMockito.service;

import com.example.aprendendoMockito.model.UsuarioModel;
import com.example.aprendendoMockito.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel) {
        return iUsuarioRepository.save(usuarioModel);
    }
    public List<UsuarioModel> exibirTodosUsuarios(){
        return iUsuarioRepository.findAll();
    }
}
