package br.com.luiz.conta.application;

import java.util.Locale;

import br.com.luiz.conta.entities.ContaEspecial;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		ContaEspecial ce = new ContaEspecial();
		
		System.out.println("=== Conta Especial ===");
		
		ce.setNomeCliente("Luiz Gomes");
		ce.setNumConta("07666-8");
		ce.setSaldo(100);
		ce.setLimite(100);
		
		ce.sacar(101);
		
		System.out.println(ce);
		
	}

}
