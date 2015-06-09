package br.com.controleFinanceiro.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

import org.hibernate.SQLQuery;
import org.hibernate.Session;




@Entity
@Table(name="user")
public class User {
	
	private int id;
	private String login;
	private String senha;
	private String nome;
	private String email;
	
	@Id	
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="login")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Column(name="senha")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column(name="nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
/*	
	public void logar(User user){
		String hql = "from user where login 	:login"; 
		Query query = session.createQuery(hql); 
		query.setDouble("preco",25.0); List results = query.list();

		
		
	}
	*/

}	
