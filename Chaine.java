import java.util.Scanner;
public class Chaine
	{public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de noms que vous souhaitez saisir : ");
        int nb = scanner.nextInt();
        String ch[] = new String[nb];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez la liste des noms:");
        String x;
        for(int i=0; i < nb; i++)
        	{ch[i] = scanner1.nextLine();}
        	for (int i=0; i < nb; i++) 
        		{for (int j=i+1; j < nb; j++) 
            		{if (ch[i].compareTo(ch[j]) > 0) 
                		{x = ch[i];
                		ch[i] = ch[j];
                		ch[j] = x;}
        		}
        	}
        System.out.print("Liste de noms dans l'ordre trié est : ");
        for (int i=0; i < nb-1; i++) 
        {System.out.print(ch[i] + ",");}
        System.out.print(ch[nb - 1]);
    	}
}