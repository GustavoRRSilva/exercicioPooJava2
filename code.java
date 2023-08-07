/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite seu salário:");
	    double salario = scan.nextDouble();
	    double desconto = calculaDesconto(salario);
	    String tipoDesconto = verificaDesconto(salario);
	    System.out.println(desconto);
	    System.out.printf("O seu salario liquido é:%.2f\n",(salario - desconto));
	    System.out.println("O seu tipo de desconto é:" + tipoDesconto);
	}
	 static double calculaDesconto(double salario){
	    double desconto = 0;
	    if(salario <= 2000){
	       desconto =  0;
	    }
	    else if(salario > 2000 && salario <= 4000){
	        desconto =  salario * (2.0/100);
	    }
	    else{
	        desconto =  salario * (4.0/100);
	        if(desconto > 400){
	            desconto = 400;
	        }
	    }
	    
	    return desconto;
	}
	 static String verificaDesconto(double salario){
	     if(salario <= 2000){
	      return "isento";
	     }
	    else if(salario > 2000 && salario <= 4000){
	       return "minimo";
	    }
	    else if(salario > 4000 && salario < 10000){
	       return "medio";
	    }
	    else{
	        return "maximo";
	    }
	}
}
