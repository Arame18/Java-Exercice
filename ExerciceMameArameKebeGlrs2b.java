import java.util.Scanner;
class Anneebisextile{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);//saisir
        /*
        Exercice 1:
        Saisir une année qui est un entier positif puis 
        determiner si l'année est bisextile ou pas 
        une année est bissextile si elle est :
            -divisible par 4 et non par 100
            -ou divisible par 400
        */
System.out.print("entrer anne :\t");


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

           Exercice 2 :{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{
			SimpleDateFormat formater = null;
			Date aujourdhui = new Date();
			formater = new SimpleDateFormat("dd-MM-yy");
		    System.out.println(formater.format(aujourdhui));

		
	
	}
}}
	    import java.util.*;
import java.util.Scanner;
	    
	    
import java.util.Scanner;
public class Exercie 4{
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int a;
        System.out.println("Entrez un jour");
        a=clavier.nextInt();
        while(a>31 || (a==0)){
            System.out.println("error");
          break;
        }  
        Scanner clavier2=new Scanner(System.in);
        int annee ;
        System.out.println("Entrez une annee");
        annee=clavier2.nextInt();
        while(annee<1000){
            System.out.println("error");
            break;   
        } 
        
        int mois ;
        Scanner souris=new Scanner(System.in);
        System.out.println("Entrez un mois");
        mois=clavier.nextInt();

        switch (mois){
            case 1:
            System.out.println("le mois de janvier compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }

            case 2:
            if (a % 4 == 0 && (a % 100 != 0) ||(a%400==0)) {
                System.out.println(+a + "est une annee bissextile");
               System.out.println("le mois de Fevrier compte 29 jours");
            } else {
                System.out.println(+a + "n\'est pas une annee bissextile");
                System.out.println("le mois de Fevrier compte 28 jours");

    
           }
            break;
            case 3:
            System.out.println("le mois de Mars compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }

            break;
            case 4:
            System.out.println("le mois de Avril compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 5:
            System.out.println("le mois de Mai compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 6:
            System.out.println("le mois de juin compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 7:
            System.out.println("le mois de juillet compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
          
            break;
            case 8:
            System.out.println("le mois d\'Aout compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 9:
            System.out.println("le mois de Septembre compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 10:
            System.out.println("le mois d\'Octobre compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 11:
            System.out.println("le mois de Novembre compte 30jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 12:
            System.out.println("le mois de Decembre compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
        }  }

        
      } 

public classc Exercie 5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Combien de valeur voulez vous ajouter: ");
        int n= sc.nextInt();
        List<Integer> Liste= new LinkedList<Integer>();
        int i=0;
        int j;
        while (n>0){
            j= i+1;
            System.out.println("saisir valeur positive "+j+": ");
            int x= sc.nextInt();
            while (x<0){
                System.out.println("saisir valeur correcte "+j+": ");
                x = sc.nextInt();
            }
            Liste.add(x);
            i++;
            n--;
        }
        int S=0;
        int P=1;
        List<Integer> Premier= new LinkedList<Integer>();
        List<Integer> Parfait= new LinkedList<Integer>();
        for(int V: Liste){
            //Determinations des nombres premiers
            int c=0;
            int a=1;
            while(a<=V){
                if(V%a==0){
                    c++;
                }
                a++;
            }
            if(c==2){
                S+=V;
                Premier.add(V);
            }
            //Determination des nombres parfaits
            int S1=0;
            int a1=1;
            while (a1 < V){
                if (V % a1 == 0) {
                    S1+=a1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

         Exercice 3: {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	{
			SimpleDateFormat formater = null;
			Date aujourdhui = new Date();
			formater = new SimpleDateFormat("dd-MM-yyyy");
		    System.out.println(formater.format(aujourdhui));

		
	
	}
}}

