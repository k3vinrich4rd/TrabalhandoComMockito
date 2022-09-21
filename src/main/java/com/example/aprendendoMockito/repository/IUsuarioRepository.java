package com.example.aprendendoMockito.repository;

import com.example.aprendendoMockito.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
