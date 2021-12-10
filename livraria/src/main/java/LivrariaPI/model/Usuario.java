package LivrariaPI.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    // private String login;

    @NotBlank
    @Email
    private String usr;

    @NotBlank
    private String senha;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    @DateTimeFormat
    private LocalDate nascimento;

    @NotBlank
    private String genero;

    @NotBlank
    private Integer privilegio;

    @NotBlank
    @UpdateTimestamp // grava data e horario de todo update || @CreateTimestamp faz apenas na sua
                     // criacao
    private LocalDate cadastro;

    private String foto;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsr() {
        return this.usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getPrivilegio() {
        return this.privilegio;
    }

    public void setPrivilegio(Integer privilegio) {
        this.privilegio = privilegio;
    }

    public LocalDate getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(LocalDate cadastro) {
        this.cadastro = cadastro;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
