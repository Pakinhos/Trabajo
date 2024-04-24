package Proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.ConexionMySQL;
import PruebaInterfaz.Secundaria;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ConexionMySQL Conect=new ConexionMySQL("root","test","Proyecto");
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			Conect.conectar();
			//String sentencia="INSERT INTO Socios (Nombre, Apellidos, Email, Direccion, Localidad, DNI, Telefono, Usuario, Contraseña, Equipo) \r\n"
			// Conect.ejecutarInsertDeleteUpdate(sentencia);
		}
		catch (SQLException e) 
		{
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Portal de Socios");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario1\\Pictures\\16857928754906-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Portal de Socios\r\n");
		lblNewLabel.setBounds(254, 24, 186, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(182, 184, 76, 36);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(301, 196, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(182, 244, 107, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MensajeInicio();
			}
		});
		btnNewButton.setBounds(279, 300, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro venta2=new Registro();
                venta2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(279, 346, 113, 23);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(301, 250, 170, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario1\\Pictures\\16857928754906-removebg-preview.png"));
		lblNewLabel_3.setBounds(206, 60, 258, 96);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MensajeSalida();
			}
		});
		btnNewButton_2.setBounds(278, 393, 114, 23);
		contentPane.add(btnNewButton_2);
		
		
	}
	public void MensajeInicio()
	{
		String mensaje = "Mensaje de información";
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
	public void MensajeSalida()
	{
		Object[] opciones = {"Si", "No"};
		int respuesta = JOptionPane.showOptionDialog(this,
		"¿Está seguro de que desea salir?",
		"Salir",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		opciones,
		opciones[0]);
		if (respuesta == 0) {
		    // Cerrar la ventana
		    this.dispose(); // Esto cierra la ventana actual
		}
		System.out.println("Has respondido" + respuesta);
		
		
	}
	
	}
