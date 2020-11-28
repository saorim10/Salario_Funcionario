package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
   seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
   salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
   afetado pela porcentagem) e mostrar novamente os dados do funcionário. */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.setNome(sc.nextLine());
		System.out.print("Salario Bruto: ");
		func.setSalarioBruto(sc.nextDouble());
		System.out.print("Imposto: ");
		func.setImposto(sc.nextDouble());
		
		System.out.print("Funcionario: ");
		System.out.println(func);
		
		System.out.println();
		System.out.print("Qual o percentual de aumento do salario? ");
		func.aumentoDeSalario(sc.nextDouble());
		System.out.println();
		System.out.print("Dados atualizados: ");
		System.out.println(func);
		sc.close();
	}

}
