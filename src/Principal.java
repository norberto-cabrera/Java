import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		//Atributos
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		
		//Atributos Metodo 1
		String word1 = "word1";
		String word2 = "word2";
		String compa = "Iguales";
		
		//Atributos Metodo 2
		int i=0;
		List<Integer> Numbers;
		Numbers = new ArrayList<>();
		int Number;
		
		//Atributos Metodo 3
		int j=0;
		List<String> Words;
		Words = new ArrayList<>();
		String Word = "Nada";
		
		//Atributos Metodo 4
		String Cadena = "Vacio";
		int Lenght=0;
		
		//Atributos Metodos2 - Metodo 1
		List<Integer> Numbers2;
		Numbers2 = new ArrayList<>();
			
		
		
		
        //Objetos creados
		Metodos1 comp = new Metodos1();
		Metodos1 biggest = new Metodos1();
		Metodos1 sort = new Metodos1();
		Metodos1 CountL = new Metodos1();
		Metodos2 smallest = new Metodos2();
		Metodos2 hashmap = new Metodos2();
		
	    //Metodo 1	
		System.out.println("Introduce la primer palabra: ");
		word1 = teclado.nextLine();

		System.out.println("Introduce la segunda palabra: ");
		word2 = teclado.nextLine();
		
		//Llamada al metodo 1
		compa = comp.Comparison(word1, word2);
		System.out.println("\nLas palabras: " + compa);

		
	    //Metodo 2
		try {
		do {
			System.out.println("\n\n\t Escribe 0 para salir");
			System.out.println("\nIntroduce un numero: ");
			Number = teclado.nextInt();
			if (Number == 0)
				break;
			Numbers.add(Number);
	        System.out.println("Lugar: " + i + "\nNumero: " +Numbers.get(i));
	        i++;
			}while (Number != 0);
		
		//Llamada al metodo 2
		biggest.Biggest(Numbers);
		}
		catch(Exception d){
			System.out.print("Ha ocurrido un error");
		}
		
		//Metodo 3
		do {
			System.out.println("\n\n\t Escribe \"salir\" para salir");
			System.out.println("Introduce una palabra: ");
			Word = teclado2.nextLine();
			if (Word.equals("salir"))
				break;
			Words.add(Word);
	        System.out.println("Lugar: " + j + "\nPalabra: " +Words.get(j));
	        j++;
			}while (!Word.equals("salir"));
		
		//Llamada al metodo 3
		sort.SortList(Words);
		
		
		//Metodo 4
		System.out.println("\n\n\t");
		System.out.println("Introduce una palabra: ");
		Cadena = teclado3.nextLine();

		//Llamada al metodo 4
		Lenght = CountL.CountLenght(Cadena);
		System.out.println("La cadena tiene: " + Lenght + " Caracteres");

		
		//Metodos2 - Metodo 1
		i = 0;
		Number = 0;
		try {
		do {
			System.out.println("\n\n\t Escribe 0 para salir");
			System.out.println("\nIntroduce un numero: ");
			Number = teclado.nextInt();
		
			if (Number == 0)
				break;
			Numbers2.add(Number);
	        System.out.println("Lugar: " + i + "\nNumero: " +Numbers2.get(i));
	        i++;
			}while (Number != 0);
		
		//Llamada al metodo 1
		smallest.Smallest(Numbers2);
		}
		catch(Exception e){
			System.out.print("\nHa ocurrido un error");
		}
		
		//Metodos2 - Metodo 2
		//Llamada al metodo 2
		hashmap.HashMap();
		
	}
}
