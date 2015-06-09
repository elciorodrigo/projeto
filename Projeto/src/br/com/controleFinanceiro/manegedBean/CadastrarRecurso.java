package br.com.controleFinanceiro.manegedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.controleFinanceiro.controller.RecursoDAO;
import br.com.controleFinanceiro.entidade.Recurso;

@ManagedBean(name = "CadastrarRecurso")
@SessionScoped
public class CadastrarRecurso {

	private String Descricao;
	private Double valor;
	private int fixo;
	private int iduser;
	
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getFixo() {
		return fixo;
	}
	public void setFixo(int fixo) {
		this.fixo = fixo;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	
	//public String salvar(){
	public static void main(String[] args) {
		
	
		RecursoDAO rD = new RecursoDAO();
		Recurso r = new Recurso();
		r.setDescricao("teste");
		r.setFixo(1);
		r.setIduser(2);
		r.setValor(new Double(100));
		
		try{
		rD.persist(r);
	//	return "/CadastrarRecurso.xhtml?faces-redirect=true";
		}catch(Exception e){
		
		
	//	return "/CadastrarRecurso.xhtml?faces-redirect=true";  
		
	}
	
	}
}
