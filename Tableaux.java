import java.util.*;
public class Tableaux{
public static void main(String[] args) {

//Saisie du tableau 1
 Scanner sc = new Scanner(System.in);
 System.out.println("donner la taille du premier tableau : ");
 int taille1 = sc.nextInt();
 int tab1[] = new int[taille1];

 System.out.println("donner les elements du 1er tableau : ");
 for(int i=0;i<taille1;i++){
   tab1[i] = sc.nextInt();
 }

 //Saisie du tableau 2
 System.out.println("donner la taille du second tableau : ");
 int taille2 = sc.nextInt();
 int tab2[] = new int[taille2];
 
 System.out.println("donner les elements du 2eme tableau : ");
 for(int i=0;i<taille2;i++){
   tab2[i] = sc.nextInt();
 }

 //Saisie d'entier x
 System.out.println("donner l'entier x : ");
 int x = sc.nextInt();

 //Determination des valeurs min et max des deux tableaux
 int max1 =0,max2 =0,min1 =0,min2 =0;
 for(int i=1;i<taille1;i++){  
   if(tab1[i] > tab1[max1]){
   max1=i;}
   if(tab1[i] < tab1[min1]){
   min1=i;}
 }  
 for(int i=1;i<taille2;i++){  
   if(tab2[i] >tab2[max2]){
   max2=i;}
   if(tab2[i] < tab2[min2]){
   min2=i;}
 }
 
 //Affichage des valeurs les plus grandes et les plus petites des deux tableaux
 System.out.println("le maximum du premier tableau est : "+tab1[max1]);
 System.out.println("le maximum du deuxieme tableau est : "+tab2[max2]);
 System.out.println("le minimum du premier tableau est : "+tab1[min1]);
 System.out.println("le minimum du deuxieme tableau est : "+tab2[min2]);
 
 //Test d'existance d'entier x dans les tableaux
 boolean test1 = false, test2 = false;
 System.out.println("le resultat de l'existence de x dans le tableau1 est : ");
 for(int i=0; i<taille1;i++){
  if(tab1[i] ==x){
     test1 = true;
  }
 }
 System.out.println(test1);
 System.out.println("le resultat de l'existence de x dans le tableau2 est : ");
 for(int i=0; i<taille2;i++){
  if(tab2[i] ==x){
     test2 = true;
   }
 }
 System.out.println(test2);
 }
}