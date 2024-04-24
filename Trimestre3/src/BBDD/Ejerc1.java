package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexionMySQL Conect=new ConexionMySQL("root","test","Prueba");
		Scanner sc=new Scanner(System.in);
		
		try {
			/*Conect.conectar();
			System.out.println("Introduzca un nombre:");
			String nuevoNombre=sc.next();
			System.out.println("Introduzca una edad:");
			String nuevaEdad=sc.next();
			
			
			String sentencia="INSERT INTO Personas(Nombre,Edad) VALUES('"+nuevoNombre+"','"+nuevaEdad+"')";
			Conect.ejecutarInsertDeleteUpdate(sentencia);*/
			
			String sentencia="SELECT * FROM Personas";
			ResultSet datos;
			datos=Conect.ejecutarSelect(sentencia);
			
			while(datos.next())
			{
				String Nombre=datos.getString("Nombre");
				int Edad=datos.getInt("Edad");
				
				System.out.println(Nombre+" "+Edad);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				Conect.desconectar();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
