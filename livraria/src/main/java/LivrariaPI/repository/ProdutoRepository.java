package LivrariaPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LivrariaPI.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	    public List <Produto> findAllByProdutoContainingIgnoreCase(String produto);

	    public List <Produto> findAllByTituloContainingIgnoreCase(String titulo);
	    
	    public List <Produto> findAllByAutorContainingIgnoreCase (String autor);
}
