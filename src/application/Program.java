package application;

import java.util.Locale;
import java.util.Scanner;

//import entities.Employee;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();	
		
		System.out.print("Entre com o nome: ");
		student.name = sc.next();		
		
		System.out.print("Entre a primeira nota: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Entre a segunda nota: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Entre a terceira nota: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("REPROVOU");
			System.out.printf("Pontos que faltam: %.2f%", student.missingPoints());
		}
		else {
			System.out.println("PASSOU");
		}
		
		
		sc.close();		
		
	}
}











//EXERCÍCIO SOBRE SALARIO 
/*Employee employee = new Employee();

System.out.println("DADOS: ");
System.out.print("Nome: ");
employee.name = sc.nextLine();
System.out.print("Salario bruto: ");
employee.grossSalary = sc.nextDouble();
System.out.print("Impostos: ");
employee.tax = sc.nextInt();	

System.out.println();
System.out.println("Empregado: " + employee);

System.out.println();
System.out.println("Qual porcentagem aumentar o salário: ");
double percentage = sc.nextDouble();
employee.increaseSalary(percentage);

System.out.println();
System.out.println("Dados após aumento: " + employee);
*/
