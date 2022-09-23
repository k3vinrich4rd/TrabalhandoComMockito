package com.example.aprendendoMockito.service;

import com.example.aprendendoMockito.model.UsuarioModel;
import com.example.aprendendoMockito.repository.IUsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
public class UsuarioServiceTest2 {
    @Mock //Simula o uso da classe e isola a suas depend�ncias
    UsuarioService usuarioService;

    @MockBean
    IUsuarioRepository iUsuarioRepository;

    private UsuarioModel usuarioModel;

    //@BeforeEach, vai ser executado antes de qualquer fun��o
    @BeforeEach
    private void inicializadora() {
        //this = se refer�ncia a pr�pria classe
        MockitoAnnotations.openMocks(this);
        usuarioModel = new UsuarioModel(1L, "Kevin", "12345");
    }

    //Sempre quando utilizarmos o @mock, usar o MockitoAnnotations
    @Test
    void testandoSeCadastroEstaFuncionando() {
        Mockito.when(iUsuarioRepository.existsById(Mockito.anyLong())).thenReturn(true);
        iUsuarioRepository.save(usuarioModel); // Cadastro
        Mockito.verify(iUsuarioRepository, Mockito.times(1)).save(usuarioModel); //Verifica��o
    }

    @Test
    void testeDeExibicaoDeUsuarios() {
        List<UsuarioModel> todosUsuarios = usuarioService.exibirTodosUsuarios();
        Assertions.assertTrue(todosUsuarios.isEmpty());
    }


}

