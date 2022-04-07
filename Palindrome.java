import java.util.*;
class Palindrome {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]) {
    
    //Saisir le mot � v�rifier
	System.out.print("Entrez le mot � tester : ");
	String m = scanner.nextLine();


    //Convertir le mot en minuscules pour �viter les probl�mes de casse
	String t = m.toLowerCase();

    // On teste si mot est un palindr�me
    int i = 0;
    int j = t.length() - 1;
    boolean palindrome=true;
    while (( i < j) && palindrome) {
    	if (t.charAt(i) != t.charAt(j)) {
        	palindrome=false;
            }
            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("C'est un mot palindr�me !");
        } else {
            System.out.println("Non, ce mot n'est pas un palindr�me.");
        }
    }
}