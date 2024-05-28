package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Dificultad extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dificultad frame = new Dificultad();
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
	public Dificultad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 993, 448);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a Arqueras de Nand. \u00BFQu\u00E9 dificultad quieres elegir?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(186, 44, 621, 68);
		panel.add(lblNewLabel);
		
		JButton facil = new JButton("Facil");
		facil.setFont(new Font("Arial", Font.PLAIN, 20));
		facil.setBounds(10, 161, 238, 43);
		panel.add(facil);
		
		JButton normal = new JButton("Normal");
		normal.setFont(new Font("Arial", Font.PLAIN, 20));
		normal.setBounds(377, 161, 238, 43);
		panel.add(normal);
		
		JButton dificil = new JButton("Dificil");
		dificil.setFont(new Font("Arial", Font.PLAIN, 20));
		dificil.setBounds(745, 161, 238, 43);
		panel.add(dificil);
		
		JButton salir = new JButton("Salir");
		salir.setFont(new Font("Arial", Font.PLAIN, 20));
		salir.setBounds(377, 323, 238, 43);
		panel.add(salir);
		
		//own
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		facil.addActionListener(this);
		normal.addActionListener(this);
		dificil.addActionListener(this);
		salir.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String action = e.getActionCommand();
		Main_Window mw;
		switch (action) {
		case "Facil":

			mw = new Main_Window(1);
			mw.setVisible(true);
			this.setVisible(false);

			break;

		case "Normal":

			mw = new Main_Window(2);
			mw.setVisible(true);
			this.setVisible(false);
			
			break;
		case "Dificil":
			
			mw = new Main_Window(3);
			mw.setVisible(true);
			this.setVisible(false);
			
			break;
		case "Salir":

			System.exit(0);
			
			break;

		default:
			JOptionPane.showMessageDialog(null, "operacion inválida");
			break;
		}

	}
}
