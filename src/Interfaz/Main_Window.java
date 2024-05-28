package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Interfaz.*;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Main_Window extends JFrame implements ActionListener {
	
	//dificultad, hordas, etc
	String mensaje_bienvenida;
	//aprovecho su instancia para variables locales
	static Partida partida;
	static JButton klifdalholm,klifstenvik,bekstenholm,beknesvik,bekdalsand,
	aenesholm,aestensand,UsarCartas,MoverCaballero,carta_1,carta_2,carta_3,carta_4,
	Descartar1,Descartar2,Descartar3,Descartar4;
	private JPanel contentPane;
	int indiceCartaT1;
	static JTextArea textHordas,textRonda,textFlechas;
	static ActionEvent e;
	static boolean T1Carta,T2Carta,carta1_eliminada_decartar,carta2_eliminada_decartar,carta3_eliminada_decartar,carta4_eliminada_decartar;
	static int indiceDescartar;
	private JLabel orco_estandar;
	
	static JTextArea txt_caballeros_Klifdalholm;
	static JTextArea txt_caballeros_Klifstenvik;
	static JTextArea txt_caballeros_beknesvik;
	static JTextArea txt_caballeros_bekdalsand;
	static JTextArea txt_caballeros_bekstenholm;
	static JTextArea txt_caballeros_aenesholm;
	static JTextArea txt_caballeros_aestensand;
	
	static JTextArea txt_orcos_klifdalholm;
	static JTextArea txt_orcos_Klifstenvik;
	static JTextArea txt_orcos_beknesvik;
	static JTextArea txt_orcos_bekdalsand;
	static JTextArea txt_orcos_bekstenholm;
	static JTextArea txt_orcos_aenesholm;
	static JTextArea txt_orcos_aestensand;
	
	private JTextArea colorCaballeros;
	private JTextArea colorOrcos;
	private JLabel lblCaballeros;
	private JLabel lblOrcos;
	
	public Main_Window(int dificultad) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Imagenes\\tapete.jpg"));
		setTitle("Arqueras de Nand Pablo Cabello");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HordasOrcos = new JLabel("Hordas de orcos");
		HordasOrcos.setForeground(Color.WHITE);
		HordasOrcos.setBounds(968, 241, 205, 22);
		contentPane.add(HordasOrcos);
		HordasOrcos.setFont(new Font("Arial", Font.PLAIN, 27));
		
		klifstenvik = new JButton("klifstenvik");
		klifstenvik.setBounds(552, 160, 85, 21);
		contentPane.add(klifstenvik);
		
		klifdalholm = new JButton("klifdalholm");
		klifdalholm.setBounds(446, 160, 85, 21);
		contentPane.add(klifdalholm);
		
		bekdalsand = new JButton("bekdalsand");
		bekdalsand.setBounds(446, 280, 85, 21);
		contentPane.add(bekdalsand);
		
		bekstenholm = new JButton("bekstenholm");
		bekstenholm.setBounds(551, 280, 85, 21);
		contentPane.add(bekstenholm);
		
		aestensand = new JButton("aestensand");
		aestensand.setBounds(551, 400, 85, 21);
		contentPane.add(aestensand);
		
		aenesholm = new JButton("aenesholm");
		aenesholm.setBounds(659, 280, 85, 21);
		contentPane.add(aenesholm);
		
		beknesvik = new JButton("beknesvik");
		beknesvik.setBounds(655, 160, 85, 21);
		contentPane.add(beknesvik);
		
		MoverCaballero = new JButton("Mover Caballero");
		MoverCaballero.setBounds(962, 336, 107, 21);
		contentPane.add(MoverCaballero);
		
		UsarCartas = new JButton("Usar Cartas");
		UsarCartas.setBounds(969, 384, 87, 21);
		contentPane.add(UsarCartas);
		
		textHordas = new JTextArea();
		textHordas.setText("12\r\n");
		textHordas.setFont(new Font("Arial", Font.PLAIN, 27));
		textHordas.setBounds(1055, 273, 42, 34);
		contentPane.add(textHordas);
		textHordas.setEditable(false);
		
		textFlechas = new JTextArea();
		textFlechas.setText("50");
		textFlechas.setFont(new Font("Arial", Font.PLAIN, 27));
		textFlechas.setBounds(278, 260, 42, 41);
		contentPane.add(textFlechas);
		textFlechas.setEditable(false);
		
		JLabel Ronda = new JLabel("Ronda");
		Ronda.setHorizontalAlignment(SwingConstants.CENTER);
		Ronda.setBounds(969, 24, 91, 21);
		contentPane.add(Ronda);
		Ronda.setFont(new Font("Arial", Font.PLAIN, 26));
		
		textRonda = new JTextArea();
		textRonda.setEditable(false);
		textRonda.setBackground(Color.BLACK);
		textRonda.setForeground(Color.RED);
		textRonda.setFont(new Font("Arial", Font.PLAIN, 27));
		textRonda.setBounds(1062, 16, 57, 41);
		contentPane.add(textRonda);
		
		carta_1 = new JButton("carta 1");
		carta_1.setBounds(268, 505, 118, 174);
		contentPane.add(carta_1);
		
		Descartar1 = new JButton("Descartar");
		Descartar1.setBounds(266, 686, 120, 21);
		contentPane.add(Descartar1);
		
		carta_2 = new JButton("carta 2");
		carta_2.setBounds(398, 505, 118, 174);
		contentPane.add(carta_2);
		
		Descartar2 = new JButton("Descartar");
		Descartar2.setBounds(393, 686, 120, 21);
		contentPane.add(Descartar2);
		
		carta_3 = new JButton("carta 3");
		carta_3.setBounds(532, 505, 118, 174);
		contentPane.add(carta_3);
		
		Descartar3 = new JButton("Descartar");
		Descartar3.setBounds(532, 686, 120, 21);
		contentPane.add(Descartar3);
		
		carta_4 = new JButton("carta 4");
		carta_4.setBounds(670, 505, 118, 174);
		contentPane.add(carta_4);
		
		Descartar4 = new JButton("Descartar");
		Descartar4.setBounds(668, 686, 120, 21);
		contentPane.add(Descartar4);
		
		orco_estandar = new JLabel("New label");
		orco_estandar.setIcon(new ImageIcon("Imagenes\\orco_estandar.png"));
		orco_estandar.setBounds(1008, 104, 125, 168);
		contentPane.add(orco_estandar);
		
		JLabel orco_estandar_1 = new JLabel("New label");
		orco_estandar_1.setIcon(new ImageIcon("Imagenes\\flecha estandar.png"));
		orco_estandar_1.setBounds(798, 521, 125, 168);
		contentPane.add(orco_estandar_1);
		
		JLabel Flechas = new JLabel("Flechas");
		Flechas.setForeground(Color.WHITE);
		Flechas.setBounds(168, 267, 115, 22);
		contentPane.add(Flechas);
		Flechas.setFont(new Font("Arial", Font.PLAIN, 27));
		
		txt_caballeros_Klifstenvik = new JTextArea();
		txt_caballeros_Klifstenvik.setForeground(Color.WHITE);
		txt_caballeros_Klifstenvik.setBackground(Color.BLACK);
		txt_caballeros_Klifstenvik.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_Klifstenvik.setEditable(false);
		txt_caballeros_Klifstenvik.setBounds(552, 116, 35, 34);
		contentPane.add(txt_caballeros_Klifstenvik);
		
		txt_orcos_Klifstenvik = new JTextArea();
		txt_orcos_Klifstenvik.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_Klifstenvik.setEditable(false);
		txt_orcos_Klifstenvik.setBounds(597, 116, 35, 34);
		contentPane.add(txt_orcos_Klifstenvik);
		
		txt_caballeros_Klifdalholm = new JTextArea();
		txt_caballeros_Klifdalholm.setForeground(Color.WHITE);
		txt_caballeros_Klifdalholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_Klifdalholm.setEditable(false);
		txt_caballeros_Klifdalholm.setBackground(Color.BLACK);
		txt_caballeros_Klifdalholm.setBounds(446, 206, 35, 34);
		contentPane.add(txt_caballeros_Klifdalholm);
		
		txt_caballeros_bekdalsand = new JTextArea();
		txt_caballeros_bekdalsand.setForeground(Color.WHITE);
		txt_caballeros_bekdalsand.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_bekdalsand.setEditable(false);
		txt_caballeros_bekdalsand.setBackground(Color.BLACK);
		txt_caballeros_bekdalsand.setBounds(446, 334, 35, 34);
		contentPane.add(txt_caballeros_bekdalsand);
		
		txt_caballeros_aestensand = new JTextArea();
		txt_caballeros_aestensand.setForeground(Color.WHITE);
		txt_caballeros_aestensand.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_aestensand.setEditable(false);
		txt_caballeros_aestensand.setBackground(Color.BLACK);
		txt_caballeros_aestensand.setBounds(552, 352, 35, 34);
		contentPane.add(txt_caballeros_aestensand);
		
		txt_caballeros_aenesholm = new JTextArea();
		txt_caballeros_aenesholm.setForeground(Color.WHITE);
		txt_caballeros_aenesholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_aenesholm.setEditable(false);
		txt_caballeros_aenesholm.setBackground(Color.BLACK);
		txt_caballeros_aenesholm.setBounds(649, 334, 35, 34);
		contentPane.add(txt_caballeros_aenesholm);
		
		txt_caballeros_bekstenholm = new JTextArea();
		txt_caballeros_bekstenholm.setForeground(Color.WHITE);
		txt_caballeros_bekstenholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_bekstenholm.setEditable(false);
		txt_caballeros_bekstenholm.setBackground(Color.BLACK);
		txt_caballeros_bekstenholm.setBounds(552, 232, 35, 34);
		contentPane.add(txt_caballeros_bekstenholm);
		
		txt_caballeros_beknesvik = new JTextArea();
		txt_caballeros_beknesvik.setForeground(Color.WHITE);
		txt_caballeros_beknesvik.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_caballeros_beknesvik.setEditable(false);
		txt_caballeros_beknesvik.setBackground(Color.BLACK);
		txt_caballeros_beknesvik.setBounds(649, 206, 35, 34);
		contentPane.add(txt_caballeros_beknesvik);
		
		txt_orcos_beknesvik = new JTextArea();
		txt_orcos_beknesvik.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_beknesvik.setEditable(false);
		txt_orcos_beknesvik.setBounds(694, 206, 35, 34);
		contentPane.add(txt_orcos_beknesvik);
		
		txt_orcos_aenesholm = new JTextArea();
		txt_orcos_aenesholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_aenesholm.setEditable(false);
		txt_orcos_aenesholm.setBounds(694, 336, 35, 34);
		contentPane.add(txt_orcos_aenesholm);
		
		txt_orcos_aestensand = new JTextArea();
		txt_orcos_aestensand.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_aestensand.setEditable(false);
		txt_orcos_aestensand.setBounds(597, 352, 35, 34);
		contentPane.add(txt_orcos_aestensand);
		
		txt_orcos_bekstenholm = new JTextArea();
		txt_orcos_bekstenholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_bekstenholm.setEditable(false);
		txt_orcos_bekstenholm.setBounds(602, 232, 35, 34);
		contentPane.add(txt_orcos_bekstenholm);
		
		txt_orcos_bekdalsand = new JTextArea();
		txt_orcos_bekdalsand.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_bekdalsand.setEditable(false);
		txt_orcos_bekdalsand.setBounds(491, 336, 35, 34);
		contentPane.add(txt_orcos_bekdalsand);
		
		txt_orcos_klifdalholm = new JTextArea();
		txt_orcos_klifdalholm.setFont(new Font("Arial", Font.PLAIN, 27));
		txt_orcos_klifdalholm.setEditable(false);
		txt_orcos_klifdalholm.setBounds(496, 206, 35, 34);
		contentPane.add(txt_orcos_klifdalholm);
		
		colorCaballeros = new JTextArea();
		colorCaballeros.setForeground(Color.WHITE);
		colorCaballeros.setFont(new Font("Arial", Font.PLAIN, 27));
		colorCaballeros.setEditable(false);
		colorCaballeros.setBackground(Color.BLACK);
		colorCaballeros.setBounds(10, 27, 35, 34);
		contentPane.add(colorCaballeros);
		
		colorOrcos = new JTextArea();
		colorOrcos.setFont(new Font("Arial", Font.PLAIN, 27));
		colorOrcos.setEditable(false);
		colorOrcos.setBounds(10, 70, 35, 34);
		contentPane.add(colorOrcos);
		
		lblCaballeros = new JLabel("Caballeros");
		lblCaballeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaballeros.setFont(new Font("Arial", Font.PLAIN, 26));
		lblCaballeros.setBounds(42, 36, 172, 21);
		contentPane.add(lblCaballeros);
		
		lblOrcos = new JLabel("Orcos");
		lblOrcos.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrcos.setFont(new Font("Arial", Font.PLAIN, 26));
		lblOrcos.setBounds(42, 78, 91, 21);
		contentPane.add(lblOrcos);
		
		JLabel Tapete = new JLabel("New label");
		Tapete.setBackground(Color.BLACK);
		Tapete.setForeground(Color.BLACK);
		Tapete.setIcon(new ImageIcon("Imagenes\\tapete.jpg"));
		Tapete.setBounds(-7, 2, 1197, 724);
		contentPane.add(Tapete);
		Descartar4.addActionListener(this);
		carta_4.addActionListener(this);
		Descartar3.addActionListener(this);
		carta_3.addActionListener(this);
		Descartar2.addActionListener(this);
		carta_2.addActionListener(this);
		Descartar1.addActionListener(this);
		carta_1.addActionListener(this);
		UsarCartas.addActionListener(this);
		MoverCaballero.addActionListener(this);
		beknesvik.addActionListener(this);
		aenesholm.addActionListener(this);
		aestensand.addActionListener(this);
		bekstenholm.addActionListener(this);
		bekdalsand.addActionListener(this);
		klifdalholm.addActionListener(this);
		klifstenvik.addActionListener(this);
		
		//own
		this.setLocationRelativeTo(null);
		T1Carta = false;
		T2Carta = false;
		
		partida = new Partida(dificultad);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.e=e;
		String territorio = this.e.getActionCommand();
		
		
		switch (territorio) {
		/*
		 * --------------- manoColocarGuerreros -------------
		 */
		case "MCG_klifdalholm":

			partida.territorios[0].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;

		case "MCG_klifstenvik":

			partida.territorios[1].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;

		case "MCG_beknesvik":
			
			partida.territorios[2].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();

			partida.actualizarInfo();
			
			break;

		case "MCG_bekdalsand":

			partida.territorios[3].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;

		case "MCG_bekstenholm":

			partida.territorios[4].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;

		case "MCG_aenesholm":

			partida.territorios[5].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;

		case "MCG_aestensand":

			partida.territorios[6].insertarCaballero();

			// hago el paso de colocar Orcos
			partida.colocarOrcos();

			// deshabilito todos los botones porque ya ha hecho la mano
			partida.deshabilitarBotones();
			
			partida.actualizarInfo();

			break;
			
		/*
		* --------------- mover caballero o usar carta -------------
		*/
		case "MCabT1":
			
			MoverCaballero.setEnabled(false);
			UsarCartas.setEnabled(false);
			
			setActionCommandTerritorioDesdeElQueMover();
						
			JOptionPane.showMessageDialog(null, "A continuacion apareceran disponibles aquellos territorios que contengan al menos un caballero(t1)");
			
			setActionCommandT2();
			
			//activa los territorios con 1 caballero o mas
			partida.elegirTerritorioDesdeElQueMover();
			
			break;
			
		case "MCabT2":
						
			MoverCaballero.setEnabled(false);
			UsarCartas.setEnabled(false);
			
			setActionCommandTerritorioDesdeElQueMover();
			
			JOptionPane.showMessageDialog(null, "A continuacion apareceran disponibles aquellos territorios que contengan al menos un caballero(t2)");
			
			partida.elegirTerritorioDesdeElQueMover();
			
			//indico que se puede hacer batalla
			partida.guerra = true;
			
			break;
			
		case "MCarT1":
			MoverCaballero.setEnabled(false);
			UsarCartas.setEnabled(false);
						
			partida.habilitarCartas();
			
			setActionCommandT2();
			
			//setActionCommandBengalaT1();
			
			T1Carta = true;
			break;
			
		case "MCarT2":
					
			carta1_eliminada_decartar = false;
			carta2_eliminada_decartar = false;
			carta3_eliminada_decartar = false;
			carta4_eliminada_decartar = false;
			
			T1Carta = false;
			T2Carta = true;
						
			partida.habilitarCartas();
			
			deshabilitarCartaT1(indiceCartaT1);
			
			partida.deshabilitarMCUC();
			
			//setActionCommandBengalaT2();
			
			//indico que se puede hacer batalla
			partida.guerra = true;
			
			break;
			
		/*
		* --------------- territorio desde el que mover -------------
		*/
			
		case "TerritorioDesdeElQueMover_klifdalholm":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(0);
			partida.actualizarInfo();
			klifdalholm.setEnabled(false);
			break;
		
		case "TerritorioDesdeElQueMover_klifstenvik":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(1);
			partida.actualizarInfo();
			klifstenvik.setEnabled(false);
			break;
			
		case "TerritorioDesdeElQueMover_beknesvik":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(2);
			partida.actualizarInfo();
			beknesvik.setEnabled(false);
			break;
			
		case "TerritorioDesdeElQueMover_bekdalsand":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(3);
			partida.actualizarInfo();
			bekdalsand.setEnabled(false);
			break;
			
		case "TerritorioDesdeElQueMover_bekstenholm":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(4);
			partida.actualizarInfo();
			bekstenholm.setEnabled(false);
			break;
			
		case "TerritorioDesdeElQueMover_aenesholm":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(5);
			partida.actualizarInfo();
			aenesholm.setEnabled(false);
			break;
			
		case "TerritorioDesdeElQueMover_aestensand":
			//resto un caballero en este territorio, y ademas activo los adyacentes
			partida.restarCaballero(6);
			partida.actualizarInfo();
			aestensand.setEnabled(false);
			break;
			
		/*
		 * --------------- territorio al que mover -------------
		 */

		case "TerritorioAlQueMover_klifdalholm":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[0].insertarCaballero();
			partida.deshabilitarBotones();
			
			//sirve para que una carta que haya sido usada no pueda volver a usarse, ni se puede descartar
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);
			
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
			
		case "TerritorioAlQueMover_klifstenvik":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[1].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
			
		case "TerritorioAlQueMover_beknesvik":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[2].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
		
			break;
			
		case "TerritorioAlQueMover_bekdalsand":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[3].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
			
		case "TerritorioAlQueMover_bekstenholm":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[4].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
			
		case "TerritorioAlQueMover_aenesholm":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[5].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
			
		case "TerritorioAlQueMover_aestensand":
			
			reiniciardeshabilitarDescartarCartaUsada();
			
			partida.territorios[6].insertarCaballero();
			partida.deshabilitarBotones();
			indiceCartaT1 = 0;
			partida.habilitarDescartar(indiceDescartar);	
			setActionCommandDescartar();
			deshabilitarDescartarCartaUsada();
			
			partida.actualizarInfo();
			
			break;
		/*
		 * --------------- Cartas -------------
		 */
		case "carta 1":
			partida.mazoCartas.get(partida.carta1).funcionCarta();
			partida.deshabilitarCartas();
			partida.mazoCartas.remove(partida.carta1);
			indiceCartaT1 = 1;
			partida.barajarCartas(true, false, false, false);
			carta1_eliminada_decartar = true;
			setActionCommandCartas();
			break;
			
		case "carta 2":
						
			partida.mazoCartas.get(partida.carta2).funcionCarta();
			partida.deshabilitarCartas();
			partida.mazoCartas.remove(partida.carta2);
			indiceCartaT1 = 2;
			partida.barajarCartas(false, true, false, false);
			carta2_eliminada_decartar = true;
			setActionCommandCartas();
			
			break;
			
		case "carta 3":
			partida.mazoCartas.get(partida.carta3).funcionCarta();
			partida.deshabilitarCartas();
			partida.mazoCartas.remove(partida.carta3);
			indiceCartaT1 = 3;
			partida.barajarCartas(false, false, true, false);
			carta3_eliminada_decartar = true;
			setActionCommandCartas();
			
			break;
			
		case "carta 4":
			partida.mazoCartas.get(partida.carta4).funcionCarta();
			partida.deshabilitarCartas();
			partida.mazoCartas.remove(partida.carta4);
			indiceCartaT1 = 4;
			partida.barajarCartas(false, false, false, true);
			carta4_eliminada_decartar = true;
			setActionCommandCartas();
			
			break;
			
			/*
			 * --------------- Descartar cartas -------------
			 */	
			
		case "Descartar carta 1":
			
			partida.deshabilitarDescartar();
			partida.habilitarMCUC();
			
			partida.mazoCartas.remove(partida.carta1);
			partida.carta1_eliminada = true;
			partida.barajarCartas(true, false, false, false);
			
			indiceDescartar = 1;
		
			
			//doy la orden de la batalla cuando pulse el boton y termine de mover
			if(partida.guerra){
			
				partida.Batalla();
				
			}
			
			
			break;
			
		case "Descartar carta 2":
			
			partida.deshabilitarDescartar();
			partida.habilitarMCUC();
			
			partida.mazoCartas.remove(partida.carta2);
			partida.carta2_eliminada = true;
			partida.barajarCartas(false, true, false, false);
			
			indiceDescartar = 2;
			
			//doy la orden de la batalla cuando pulse el boton y termine de mover
			if(partida.guerra){
			
				partida.Batalla();
				
			}
			break;
			
		case "Descartar carta 3":
			partida.deshabilitarDescartar();
			partida.habilitarMCUC();
			
			partida.mazoCartas.remove(partida.carta3);
			partida.carta3_eliminada = true;
			partida.barajarCartas(false, false, true, false);
			
			indiceDescartar = 3;
			
			//doy la orden de la batalla cuando pulse el boton y termine de mover
			if(partida.guerra){
			
				partida.Batalla();
				
			}
			break;
			
		case "Descartar carta 4":
			partida.deshabilitarDescartar();
			partida.habilitarMCUC();
			
			partida.mazoCartas.remove(partida.carta4);
			partida.carta4_eliminada = true;
			partida.barajarCartas(false, false, false, true);
			
			indiceDescartar = 4;
			
			//doy la orden de la batalla cuando pulse el boton y termine de mover
			if(partida.guerra){
			
				partida.Batalla();
				
			}
			break;

		}
		

	}

	public static void setActionCommandT1() {

		UsarCartas.setActionCommand("MCarT1");
		MoverCaballero.setActionCommand("MCabT1");

	}
	
	public  void setActionCommandT2() {
		
		UsarCartas.setActionCommand("MCarT2");
		MoverCaballero.setActionCommand("MCabT2");

	}
	
	public void setActionCommandTerritorioDesdeElQueMover() {
		
		klifdalholm.setActionCommand("TerritorioDesdeElQueMover_klifdalholm");
		klifstenvik.setActionCommand("TerritorioDesdeElQueMover_klifstenvik");
		beknesvik.setActionCommand("TerritorioDesdeElQueMover_beknesvik");
		bekdalsand.setActionCommand("TerritorioDesdeElQueMover_bekdalsand");
		bekstenholm.setActionCommand("TerritorioDesdeElQueMover_bekstenholm");
		aenesholm.setActionCommand("TerritorioDesdeElQueMover_aenesholm");
		aestensand.setActionCommand("TerritorioDesdeElQueMover_aestensand");
		
	}
	
	public static void setActionCommandTerritorioAlQueMover() {
		
		klifdalholm.setActionCommand("TerritorioAlQueMover_klifdalholm");
		klifstenvik.setActionCommand("TerritorioAlQueMover_klifstenvik");
		beknesvik.setActionCommand("TerritorioAlQueMover_beknesvik");
		bekdalsand.setActionCommand("TerritorioAlQueMover_bekdalsand");
		bekstenholm.setActionCommand("TerritorioAlQueMover_bekstenholm");
		aenesholm.setActionCommand("TerritorioAlQueMover_aenesholm");
		aestensand.setActionCommand("TerritorioAlQueMover_aestensand");
		
	}
	
	public static void setActionCommandCartas() {
		
		//Actualiza el nombre del botón con la carta con el indice correspondiente
		
		Main_Window.carta_1.setText(Partida.mazoCartas.get(Partida.carta1).toString());
		Main_Window.carta_1.setActionCommand("carta 1");
		
		
		Main_Window.carta_2.setText(Partida.mazoCartas.get(Partida.carta2).toString());
		Main_Window.carta_2.setActionCommand("carta 2");
		
		Main_Window.carta_3.setText(Partida.mazoCartas.get(Partida.carta3).toString());
		Main_Window.carta_3.setActionCommand("carta 3");
		
		Main_Window.carta_4.setText(Partida.mazoCartas.get(Partida.carta4).toString());
		Main_Window.carta_4.setActionCommand("carta 4");
		
	}

	public void setActionCommandDescartar() {
		
		Descartar1.setActionCommand("Descartar carta 1");
		Descartar2.setActionCommand("Descartar carta 2");
		Descartar3.setActionCommand("Descartar carta 3");
		Descartar4.setActionCommand("Descartar carta 4");
		
		
	}
	
	void deshabilitarCartaT1(int indice) {
				
		switch (indice) {
		case 1:
			carta_1.setEnabled(false);
			break;
			
		case 2:
			carta_2.setEnabled(false);
			break;
			
		case 3:
			carta_3.setEnabled(false);
			break;
			
		case 4:
			carta_4.setEnabled(false);
			break;

		}
	}
	
	 void deshabilitarDescartarCartaUsada() {
			
		if(carta1_eliminada_decartar) {
			Descartar1.setEnabled(false);
		}else if(carta1_eliminada_decartar == false) {
			Descartar1.setEnabled(true);
		}
		
		if(carta2_eliminada_decartar) {
			Descartar2.setEnabled(false);
		}else if(carta2_eliminada_decartar == false) {
			Descartar2.setEnabled(true);
		}
		
		if(carta3_eliminada_decartar) {
			Descartar3.setEnabled(false);
		}else if(carta3_eliminada_decartar == false) {
			Descartar3.setEnabled(true);
		}
		
		if(carta4_eliminada_decartar) {
			Descartar4.setEnabled(false);
		}else if(carta4_eliminada_decartar == false) {
			Descartar4.setEnabled(true);
		}

	}
	 
	 void reiniciardeshabilitarDescartarCartaUsada() {

		 Main_Window.carta1_eliminada_decartar = false;
		 Main_Window.carta2_eliminada_decartar = false;
		 Main_Window.carta3_eliminada_decartar = false;
		 Main_Window.carta4_eliminada_decartar = false;

	 }
}
