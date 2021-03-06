package br.com.luiz.conta.entities;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaBancaria [Cliente= " + getNomeCliente() + ", Conta= " + getNumConta() + ", Saldo= " + getSaldo() + "]";
	}

	@Override
	public boolean sacar(double valor) {
		double saldoComLimite = this.getLimite() + this.getSaldo();
		if (valor <= saldoComLimite) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			System.out.println("(Valor insuficiente)");
			return false;
		}
	}
	
	

//	@Override
//	public boolean sacar(double valor) {
//		
//		double limite = limite + getSaldo();
//		if (valor > limite) {
//			return false;
//		}
//		saldo -= valor;
//		return true;
//	}	
	
	
}
