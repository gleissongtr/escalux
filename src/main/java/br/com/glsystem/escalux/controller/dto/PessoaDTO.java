package br.com.glsystem.escalux.controller.dto;

import br.com.glsystem.escalux.domain.Pessoa;

public class PessoaDTO {
	
	private Long id;
	private String nome;
	private String telefone;
	
	public PessoaDTO() {
	}
	
	public PessoaDTO(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.telefone = pessoa.getTelefone();
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
