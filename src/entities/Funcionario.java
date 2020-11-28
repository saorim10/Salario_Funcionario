package entities;

public class Funcionario {

	
	// Variaveis ==============================================================
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	// Construtores ===========================================================
	public Funcionario() {
	}
	
	public Funcionario(String nome, double salario, double imposto) {
		this.nome=nome;
		this.salarioBruto=salario;
		this.imposto=imposto;
	}

	// Getters & Setters ======================================================
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	// Metodos ================================================================
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoDeSalario(double percentual) {
		this.salarioBruto *= (percentual/100)+1;
	}
	
	@Override
	public String toString(){
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
