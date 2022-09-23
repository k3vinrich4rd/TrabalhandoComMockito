package com.example.aprendendoMockito.service;

import com.example.aprendendoMockito.model.UsuarioModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class UsuarioServiceTest {

    @Test
    @DisplayName("Deve retornar true, pois nenhum usuario foi cadastrado")
    void exibirTodosOsUsuariosTest() {
        UsuarioService mockUsuario = Mockito.mock(UsuarioService.class);
        List<UsuarioModel> todosUsuarios = mockUsuario.exibirTodosUsuarios();
        Assertions.assertTrue(todosUsuarios.isEmpty());
    }
}



