package br.com.luiz.conta.entities;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [Cliente= " + nomeCliente + ", Conta= " + numConta + ", Saldo= " + saldo + "]";
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		} else {
			System.out.println("(Valor insuficiente)");
			return false;
		}
	}	
	
	
}
