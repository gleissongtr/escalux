package br.com.glsystem.escalux.domain;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="gasto")
public class Gasto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gasto")
	private Integer id;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="vl_valor")
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_data")
	private Date data;

	public Gasto() {
	}
	
	public Gasto(String descricao, BigDecimal valor, Date data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
