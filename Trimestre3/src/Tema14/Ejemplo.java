package Tema14;

import java.util.ArrayList;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> alfabeto = new ArrayList<>();
		
		//CREAR LISTA CON LETRAS DEL ALFABETO
		char[] letras= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (char letra:letras) 
		{
			alfabeto.add(letra);
		}
		
		//MOSTRAR LISTA
		System.out.println("Alfabeto: "+alfabeto);
		
		//BUSCAR Y MOSTRAR POSICIÓN DE E, H, O
		System.out.println("Posición de E: "+alfabeto.indexOf('E'));
		System.out.println("Posición de H: "+alfabeto.indexOf('H'));
		System.out.println("Posición de O: "+alfabeto.indexOf('O'));
		
		//ELIMINAR ELEMENTO EN LA POSICIÓN 1 Y U
		alfabeto.remove(1);
		alfabeto.remove((Character) 'U');
		
		//MOSTRAR LISTA NUEVA ACTUALIZADA
		System.out.println("Lista del alfabeto después de eliminar:"+ alfabeto);
		

		
		
		

	}

}
