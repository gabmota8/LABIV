package br.gov.service.fatec.springbootlab4;

import java.util.List;

import br.gov.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
    
}
