import java.util.List;
import java.util.HashMap;

public class Metodos2 {
    //Atributos
	HashMap<String , Integer> h = new HashMap<String, Integer>();
	
	
	//Metodos2
	//Metodo1 - Return type: void - Body: Iterate trough an Array and print the smallest number - Parameters: Array of integers.
	public void Smallest (List<Integer> Numbers) {
		System.out.println("El Numero mas pequeño es: " + Numbers.stream().mapToInt(i -> i).min().getAsInt());
	}
	
	
	//Metodo2 - Return type: void - Body: Iterate trough a HashMap and print the value based on the Key - Parameters: None.
	public void HashMap () {
		h.put("a" , 10);
		h.put("b" , 20);
		h.put("c" , 30);
		
		System.out.println("\nEl Contenido del HashMap: " + h);

		
	}
	
	
}
