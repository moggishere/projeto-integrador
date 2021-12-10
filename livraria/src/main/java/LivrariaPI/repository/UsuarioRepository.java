package LivrariaPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import LivrariaPI.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public List<Usuario> findAllByUsrContainingIgnoreCase(String usr);
}
