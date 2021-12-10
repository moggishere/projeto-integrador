package LivrariaPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LivrariaPI.model.Produto;
import LivrariaPI.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity <List<Produto>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Produto> getById(@PathVariable Long id){
		return produtoRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
    
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <List<Produto>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(produtoRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@GetMapping("/autor/{autor}")
	public ResponseEntity <List<Produto>> getByAutor(@PathVariable String autor){
		return ResponseEntity.ok(produtoRepository.findAllByAutorContainingIgnoreCase(autor));
	}
	
	@PostMapping
	 public ResponseEntity <Produto> postProduto(@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@PutMapping
	 public ResponseEntity <Produto> putProduto(@Valid @RequestBody Produto produto){
		 return produtoRepository.findById(produto.getId())
				 .map(resposta -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto)))
				 .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	 }
		 
	 @DeleteMapping(path ={"/{id}"})
			public ResponseEntity<?> delete(@PathVariable long id) {
			   return produtoRepository.findById(id)
			           .map(record -> {
			               produtoRepository.deleteById(id);
			               return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			               })
			           .orElse(ResponseEntity.notFound().build());
	 }
	
}
