package LivrariaPI.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String titulo;
	
	@NotBlank
	private String autor;
	
	@NotBlank
	private String sinopse;
	
	private String editora;
	
	private String diretorio;
	
	@NotBlank
	private BigDecimal preco; 
	
	@NotBlank
	private String categoriaProduto; // mudado o termo
	
	@NotBlank
	private String foto;
	
	@NotBlank
	private Boolean fisico;
	
	@NotBlank
	private Boolean promocao;

	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("produto")
    private List<Categoria> categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public java.math.BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(java.math.BigDecimal preco) {
		this.preco = preco;
	}

	// public String getCategoria() {
	// 	return categoria;
	// }

	// public void setCategoria(String categoria) {
	// 	this.categoria = categoria;
	// }

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Boolean getFisico() {
		return fisico;
	}

	public void setFisico(Boolean fisico) {
		this.fisico = fisico;
	}

	public Boolean getPromocao() {
		return promocao;
	}

	public void setPromocao(Boolean promocao) {
		this.promocao = promocao;
	}
	  

	public String getCategoriaProduto() {
		return this.categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public Boolean isFisico() {
		return this.fisico;
	}

	public Boolean isPromocao() {
		return this.promocao;
	}

	public List<Categoria> getCategoria() {
		return this.categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}


	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
