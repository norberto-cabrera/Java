import java.util.Collections;
import java.util.List;


public class Metodos1 {
	//Atributos
    String compa;
	int i=0;
	int lenght=0;
	
	//Metodos
	//Metodo 1 - Return type: String - Body: Comparison between 2 words - Parameters : 2 strings.
	public String Comparison (String word1, String word2) {
		if (word1.contentEquals(word2)) 
			compa = "Son Iguales";
		else 
			compa = "No son Iguales";
		return compa;
			
	}
	
	//Metodo 2 - Return type: Bool - Body: Verify the biggest number in a list - Parameters: List/Array of integers. 
	public void Biggest (List<Integer> Numbers) {
		System.out.println("El Numero mas grande es: " + Numbers.stream().mapToInt(i -> i).max().getAsInt());
		
	}
	
	//Metodo 3 - Return type: void - Body: Sort a list by asc and desc order - Parameters: List/Array of strings.
	public void SortList (List<String> Words) {
		Collections.sort(Words);
		System.out.println("\nOrden Ascendente");
		 for(String item:Words) {
        System.out.println("\nPalabra: " + item);
		} 
		 System.out.println("\nOrden Descendente");
		 Collections.sort(Words, Collections.reverseOrder());
		 for(String item:Words) {
        System.out.println("\nPalabra: " + item);
		} 
	}
	
	//Metodo 4 - Return type: int - body: Count the length of a string - Parameters: String.
	public int CountLenght (String Word1) {
		lenght = Word1.length();
		
		return lenght;
	}
}
