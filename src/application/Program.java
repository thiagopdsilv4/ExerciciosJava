package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");	
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there any initial deposit (y/n)? ");
		char response = sc.next().charAt(0);//para ler o caractere
		
		if(response == 'y'){
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}






/*
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.println("Enter account number: ");
//int account = sc.nextInt();
System.out.print("Enter account holder: ");		
String name = sc.nextLine();		
System.out.print("Is there any initial deposit (y/n)? ");
double price = sc.nextDouble();
Product product = new Product(name, price);

System.out.println();
System.out.println("Product data: " + product);
System.out.println();

System.out.print("Enter the number of products to be added in stock: ");
int quantity = sc.nextInt();

product.addProducts(quantity);
System.out.println();
System.out.println("Updated data: " + product);

System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");
quantity = sc.nextInt();
product.removeProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);
sc.close();
*/

//EXERCÍCIO MODO ESTÁTICO
/*
 * public static final double PI = 3.14159;
 * 
 * public static void main(String[] args) {
 * 
 * //final double PI = 3.14159;//padrão de nomes para constante é tudo maiusculo
 * 
 * Locale.setDefault(Locale.US);
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Digite o valor do raio: "); double radius =
 * sc.nextDouble();
 * 
 * double c = circumference(radius); // responsável por calcular circunferencia
 * e devolver o valor dela
 * 
 * double v = volume(radius);
 * 
 * System.out.printf("Circumferece: %.2f%n", c);
 * System.out.printf("Volume: %.2f%n", v); System.out.printf("PI Value: %.2f%n",
 * PI);
 * 
 * sc.close();
 * 
 * }
 * 
 * public static double circumference(double radius) { return 2.0 * PI * radius;
 * }
 * 
 * public static double volume(double radius) { return 4.0 * PI * radius *
 * radius * radius / 3.0; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * //EXERCÍCIO ESTUDANTE /* Student student = new Student();
 * 
 * System.out.print("Entre com o nome: "); student.name = sc.next();
 * 
 * System.out.print("Entre a primeira nota: "); student.grade1 =
 * sc.nextDouble();
 * 
 * System.out.print("Entre a segunda nota: "); student.grade2 = sc.nextDouble();
 * 
 * System.out.print("Entre a terceira nota: "); student.grade3 =
 * sc.nextDouble();
 * 
 * System.out.printf("NOTA FINAL: %.2f%n", student.finalGrade());
 * 
 * if(student.finalGrade() < 60.0) { System.out.println("REPROVOU");
 * System.out.printf("Pontos que faltam: %.2f%n", student.missingPoints()); }
 * else { System.out.println("PASSOU"); }
 * 
 * 
 * 
 * //EXERCÍCIO SOBRE SALARIO Employee employee = new Employee();
 * 
 * System.out.println("DADOS: "); System.out.print("Nome: "); employee.name =
 * sc.nextLine(); System.out.print("Salario bruto: "); employee.grossSalary =
 * sc.nextDouble(); System.out.print("Impostos: "); employee.tax = sc.nextInt();
 * 
 * System.out.println(); System.out.println("Empregado: " + employee);
 * 
 * System.out.println();
 * System.out.println("Qual porcentagem aumentar o salário: "); double
 * percentage = sc.nextDouble(); employee.increaseSalary(percentage);
 * 
 * System.out.println(); System.out.println("Dados após aumento: " + employee);
 */
