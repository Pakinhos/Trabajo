package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexionMySQL Conect=new ConexionMySQL("root","test","Escuela");
		Scanner sc=new Scanner(System.in);
		
		try {
			Conect.conectar();
			System.out.println("Introduzca un nombre:");
			String nuevoNombre=sc.next();
			System.out.println("Introduzca una edad:");
			String nuevaEdad=sc.next();
			System.out.println("Introduzca DNI:");
			String nuevoDNI=sc.next();
			
			
			String sentencia="INSERT INTO Escuela(Nombre,Edad,DNI) VALUES('"+nuevoNombre+"','"+nuevaEdad+"','"+nuevoDNI+"')";
			Conect.ejecutarInsertDeleteUpdate(sentencia);
			
			sentencia="SELECT * FROM Escuela";
			ResultSet datos;
			datos=Conect.ejecutarSelect(sentencia);
			
			while(datos.next())
			{
				String Nombre=datos.getString("Nombre");
				int Edad=datos.getInt("Edad");
				String DNI=datos.getString("DNI");
				
				System.out.println(Nombre+" "+Edad+" "+DNI);
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
