package br.gov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
