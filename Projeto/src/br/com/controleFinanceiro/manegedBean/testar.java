package br.com.controleFinanceiro.manegedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.controleFinanceiro.controller.ContasDAO;



@ManagedBean(name="teste")
@RequestScoped 
public class testar {

		
		
		//a = r.getById(2);
		
		//System.out.println(a.getValor());
	public String pegarValor(){
		ContasDAO a = new ContasDAO();
			return  a.getById(2).getDescricao();
	}
		

}
