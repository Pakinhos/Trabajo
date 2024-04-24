package Tema14;

import java.util.Scanner;

public class MainHanoi {

	public static void main(String[] args) {
		
		Hanoi hanoi= new Hanoi (2);
		Scanner sc=new Scanner(System.in);
		boolean Juega=true;
		System.out.println("Estado Inicial.");
		hanoi.imprime();
		
		while(Juega)
		{
			System.out.println("Ingrese su movimiento, Origen Destino. Por ejemplo: AB (Desde Torrea A hasta Torre B");
			String movimiento=sc.nextLine().toUpperCase();
			
			if (movimiento.length() !=2)
			{
				System.out.println("Movimiento inválido. Introduzca de nuevo un movimiento.");
				continue;
			}
			
			char Origen=movimiento.charAt(0);
			char Destino=movimiento.charAt(1);
			
			if (Origen != 'A' && Origen != 'B' && Origen != 'C' || Destino != 'A' && Destino != 'B' && Destino != 'C')
			{
				System.out.println("Torre inválida. Intentelo de nuevo.");
				continue;
			}
			
			hanoi.Mueve(Origen, Destino);
			hanoi.imprime();
			
			
			if (hanoi.fin())
			{
				System.out.println("¡Enhorabuena!");
				Juega=false;
			}
		}
		
	}

}
