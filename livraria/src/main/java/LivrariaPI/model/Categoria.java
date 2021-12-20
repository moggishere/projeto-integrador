package LivrariaPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // create table
@Table(name = "tb_categoria") // tabela categoria
public class Categoria{

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@NotBlank(message = "Por favor selecione uma categoria")
	@Size(min = 5, max = 30, message = "O atributo titulo deve ter no minimo 5 e no maximo 30 caractéres")
	private String produtoCategoria;

	@NotBlank(message = "Por favor adicionar descrição da categora de produtos")
	@Size(min = 10, max = 400, message = "Deve ter entre o mínimo de 10 caractéres e o máximo de 400")
	private String descricaoCategoria;

	private boolean impulso; // mostra na frontpage

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoCategoria() {
		return this.descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public boolean isImpulso() {
		return this.impulso;
	}

	public boolean getImpulso() {
		return this.impulso;
	}

	public void setImpulso(boolean impulso) {
		this.impulso = impulso;
	}


	public String getProdutoCategoria() {
		return this.produtoCategoria;
	}

	public void setProdutoCategoria(String produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}


}