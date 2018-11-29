package br.com.glsystem.escalux.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.glsystem.escalux.controller.dto.PessoaDTO;

@Entity
@Table(name="PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_PESSOA")
	private Long id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "TELEFONE", nullable = false)
	private String telefone;
	
	public Pessoa() {
	}

	public Pessoa(PessoaDTO pessoaDTO) {
		this.id = pessoaDTO.getId();
		this.nome = pessoaDTO.getNome();
		this.telefone = pessoaDTO.getTelefone();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
