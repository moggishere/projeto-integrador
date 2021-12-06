package LivrariaPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity // create table
@Table(name = "tb_categoria") // tabela categoria
public class Categoria{

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@NotBlank(message = "Por favor selecione uma categoria")
	@Size(min = 5, max = 30, message = "O atributo titulo deve ter no minimo 5 e no maximo 30 caracters")
	private String categoria;

	private boolean promo;
	
	private boolean fisico;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isPromo() {
		return promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}

	public boolean isFisico() {
		return fisico;
	}

	public void setFisico(boolean fisico) {
		this.fisico = fisico;
	}
	
}

	