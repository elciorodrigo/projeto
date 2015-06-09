package br.com.controleFinanceiro.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;


@Entity
@Table(name="recurso")
public class Recurso  {

	
	private int id;
	private String Descricao;
	private Double valor;
	private int fixo;
	private int iduser;
	
	@Id	
	@Column(name="id")
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="descricao")
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	@Column(name="valor")
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Column(name="fixo")
	public int getFixo() {
		return fixo;
	}
	public void setFixo(int fixo) {
		this.fixo = fixo;
	}
	@Column(name="iduser")
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	

	
	
}
