import java.util.*;
public class Calcul {

  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Integer a;
	Integer b;
	Integer Z;
	Integer M;
    Integer i;
	System.out.print("Donner le premier entier");
	a= sc.nextInt();
	System.out.print("Donner le second entier");
	b= sc.nextInt();
	Z=a+b;
    M=1;
	if (a>b) {
		for ( i = 1 ; i<=a ; i++) {
			M=M*i;
			} 
    }
	else {
			for ( i = 1 ; i<=b ; i++) {
				M=M*i;
			}
    }
System.out.printf ( "La somme des deux entiers est " );
System.out.print ( Z );
System.out.printf ( " , et la factorielle du nombre le plus grand est" );
System.out.print ( M );
}
}