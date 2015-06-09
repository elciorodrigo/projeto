package br.com.controleFinanceiro.manegedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.controleFinanceiro.controller.UserDAO;
import br.com.controleFinanceiro.entidade.User;

@ManagedBean(name = "CadastrarBean")
@SessionScoped
public class CadastrarBean {
	private String nome;
	private String email;
	private String user;
	private String pass;
	private boolean ok;
	
	
		
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void cadastrar(){
		UserDAO inserir = new UserDAO();
		User usuario = new User();
		usuario.setEmail(email);
		usuario.setLogin(user);
		usuario.setSenha(pass);
		usuario.setNome(nome);
		
		inserir.persist(usuario);
	}
	
	public String logar(){    
	       return "/principal.xhtml?faces-redirect=true";    
	} 
	

	

	
	
		
}
