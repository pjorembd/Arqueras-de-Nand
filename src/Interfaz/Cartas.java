package Interfaz;

import java.util.Scanner;
import javax.swing.JOptionPane;


public abstract class Cartas {

	protected String tipo;

	public Cartas(String tipo) {

		this.tipo = tipo;

	}

	public String getTipo() {
		
		return tipo;
		
	}
	
	abstract void funcionCarta();

	public String toString() {
		
		return tipo;
		
	}

}

class Bengala extends Cartas{

	public Bengala(String tipo) {
		super(tipo);
	}

	@Override
	void funcionCarta() {
				
		if(Main_Window.T1Carta) {
			
			String[] cartas = { "klifdalholm", "klifstenvik", "beknesvik", "bekdalsand", "bekstenholm","aenesholm","aestensand"};
			Object opcion = JOptionPane.showInputDialog(null,
					"¡Los habitantes han lanzado una bengala,estan en peligro!. Elige un territorio al que tirar flechas",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);
			
			switch (opcion.toString()) {
			case "klifdalholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.actualizarInfo();
				break;

			case "klifstenvik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.actualizarInfo();
				break;

			case "beknesvik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;

			case "bekdalsand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "bekstenholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "aenesholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aenesholm");
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;

			case "aestensand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aestensand");
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			}
			
			Partida.habilitarMCUC();
			
		}
		
		if(Main_Window.T2Carta) {
			
			String[] cartas = { "klifdalholm", "klifstenvik", "beknesvik", "bekdalsand", "bekstenholm","aenesholm","aestensand"};
			Object opcion = JOptionPane.showInputDialog(null,
					"¡Los habitantes han lanzado una bengala,estan en peligro!. Elige un territorio al que tirar flechas",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);
			
			switch (opcion.toString()) {
			case "klifdalholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.actualizarInfo();
				break;

			case "klifstenvik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.actualizarInfo();
				break;

			case "beknesvik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;

			case "bekdalsand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "bekstenholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "aenesholm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aenesholm");
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;

			case "aestensand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aestensand");
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			}
			
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
			
		}
	} 


class Count extends Cartas{

	public Count(String tipo) {
		super(tipo);
	}

	@Override
	void funcionCarta() {

		if (Main_Window.T1Carta) {
			String[] cartas = { "1", "2", "3" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige 1, 2 o 3. Se lanzan flechas a los terri-\r\n"
							+ "torios que tengan ese número de estandartes.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "1":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, aenesholm, bekdalsand.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "2":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, aestensand, beknesvik.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;

			case "3":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm.");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
			}

			Partida.habilitarMCUC();
		}
		
		if (Main_Window.T2Carta) {

			String[] cartas = { "1", "2", "3" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige 1, 2 o 3. Se lanzan flechas a los terri-\r\n"
							+ "torios que tengan ese número de estandartes.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "1":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, aenesholm, bekdalsand.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "2":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, aestensand, beknesvik.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "3":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm.");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
			}
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
	}
	
}

class Like extends Cartas{

	public Like(String tipo) {
		super(tipo);
		
	}

	@Override
	void funcionCarta() {
		
		if (Main_Window.T1Carta) {
			String[] cartas = { "Klif", "Bek", "Ae", "Sten", "Dal","Nes","Vik","Holm","Sand",};
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige una de estas palabras: Klif, Bek, Ae,\r\n"
							+ "Sten, Dal, Nes, Vik, Holm o Sand. Se lanzan flechas\r\n"
							+ "a los territorios que la contengan en su nombre.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Klif":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, klifdalholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.actualizarInfo();
				break;

			case "Bek":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekdalsand, bekstenholm.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "Ae":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Sten":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik, bekstenholm, aestensand.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Dal":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Nes":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik,aenesholm.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Vik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik,beknesvik.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Holm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekstenholm, aenesholm.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Sand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand,aestensand.");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}

			Partida.habilitarMCUC();
		}
		
		if (Main_Window.T2Carta) {

			String[] cartas = { "Klif", "Bek", "Ae", "Sten", "Dal","Nes","Vik","Holm","Sand",};
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige una de estas palabras: Klif, Bek, Ae,\r\n"
							+ "Sten, Dal, Nes, Vik, Holm o Sand. Se lanzan flechas\r\n"
							+ "a los territorios que la contengan en su nombre.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Klif":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, klifdalholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.actualizarInfo();
				break;

			case "Bek":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekdalsand, bekstenholm.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "Ae":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Sten":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik, bekstenholm, aestensand.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Dal":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Nes":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik,aenesholm.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Vik":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik,beknesvik.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Holm":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekstenholm, aenesholm.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Sand":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand,aestensand.");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}
			
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
	}
	
}

class NOT extends Cartas{

	public NOT(String tipo) {
		super(tipo);
	}

	@Override
	void funcionCarta() {
		
		if (Main_Window.T1Carta) {
			
			String[] cartas = { "verde", "rojo", "azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige un color. Se lanzan flechas a los territo-\r\n"
					+ "rios que no tengan el color elegido.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik, beknesvik, aenesholm.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;

			case "rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm,klifstenvik,bekdalsand.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;
			}

			Partida.habilitarMCUC();
		}
		
		if (Main_Window.T2Carta) {

			String[] cartas = { "verde", "rojo", "azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige un color. Se lanzan flechas a los territo-\r\n"
					+ "rios que no tengan el color elegido.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifstenvik, beknesvik, aenesholm.");
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.actualizarInfo();
				break;

			case "rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekdalsand, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm,klifstenvik,bekdalsand.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;
			}
			
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
	}
	
	
	
}

class OR extends Cartas{

	public OR(String tipo) {
		super(tipo);
	}

	@Override
	void funcionCarta() {
		
		if (Main_Window.T1Carta) {
			String[] cartas = { "Verde OR Rojo", "Verde OR azul", "Rojo OR Azul", "Verde OR Verde", "Rojo OR Rojo",
			"Azul OR Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los territo-\r\n"
							+ "rios que tengan alguno de los colores elegidos.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde OR Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, klifdalholm, beknesvik, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde OR azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, beknesvik, bekdalsand, bekstenholm, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
	
			case "Rojo OR Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Verde OR Verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Rojo OR Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Azul OR Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekstenholm, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}

			Partida.habilitarMCUC();
		}
		
		if (Main_Window.T2Carta) {

			String[] cartas = { "Verde OR Rojo", "Verde OR azul", "Rojo OR Azul", "Verde OR Verde", "Rojo OR Rojo",
			"Azul OR Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los territo-\r\n"
							+ "rios que tengan alguno de los colores elegidos.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde OR Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a Klifsentivik, klifdalholm, beknesvik, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde OR azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, beknesvik, bekdalsand, bekstenholm, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
	
			case "Rojo OR Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Verde OR Verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Rojo OR Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Azul OR Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekstenholm, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}
			
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
	}
	
}

class AND extends Cartas{

	public AND(String tipo) {
		super(tipo);
	}

	@Override
	void funcionCarta() {
		
		if (Main_Window.T1Carta) {
			
			String[] cartas = { "Verde AND Rojo", "Verde AND azul", "Rojo AND Azul", "Verde AND Verde", "Rojo AND Rojo",
			"Azul AND Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los terri-\r\n"
							+ "torios que tengan todos los colores elegidos.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde AND Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekstenholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde AND azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
	
			case "Rojo AND Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm, beknesvik");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Verde AND Verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Rojo AND Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Azul AND Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekstenholm, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}

			Partida.habilitarMCUC();
		}
		
		if (Main_Window.T2Carta) {

			String[] cartas = { "Verde AND Rojo", "Verde AND azul", "Rojo AND Azul", "Verde AND Verde", "Rojo AND Rojo",
			"Azul AND Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los terri-\r\n"
							+ "torios que tengan todos los colores elegidos.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde AND Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekstenholm");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde AND azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
	
			case "Rojo AND Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a bekstenholm, beknesvik");
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Verde AND Verde":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, bekdalsand, bekstenholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Rojo AND Rojo":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a klifdalholm, klifstenvik, beknesvik, bekstenholm.");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.actualizarInfo();
				break;
				
			case "Azul AND Azul":
				JOptionPane.showInternalMessageDialog(null, "Se lanzan flechas a beknesvik, bekstenholm, aenesholm, aestensand.");
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(4);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;
			}
			
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}
		
	}
}

class XOR extends Cartas{

	public XOR(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void funcionCarta() {

		if (Main_Window.T1Carta) {

			String[] cartas = { "Verde XOR Rojo", "Verde XOR azul", "Rojo XOR Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los\r\n"
							+ "territorios que tengan alguno de los colores\r\n" + "elegidos pero no los dos a la vez.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde XOR Rojo":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifstenvik, beknesvik, bekdalsand, aestensand");
				
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde XOR azul":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifdalholm, beknesvik, aenesholm, bekdalsand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "Rojo XOR Azul":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifdalholm, klifstenvik, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			}

			Partida.habilitarMCUC();
		}

		if (Main_Window.T2Carta) {

			String[] cartas = { "Verde XOR Rojo", "Verde XOR azul", "Rojo XOR Azul" };
			Object opcion = JOptionPane.showInputDialog(null,
					"Elige dos colores. Se lanzan flechas a los\r\n"
							+ "territorios que tengan alguno de los colores\r\n" + "elegidos pero no los dos a la vez.",
							"Elegir", JOptionPane.QUESTION_MESSAGE, null, cartas, cartas[0]);

			switch (opcion.toString()) {
			case "Verde XOR Rojo":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifstenvik, beknesvik, bekdalsand, aestensand");
				
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			case "Verde XOR azul":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifdalholm, beknesvik, aenesholm, bekdalsand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(2);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(3);
				Main_Window.partida.actualizarInfo();
				break;

			case "Rojo XOR Azul":
				JOptionPane.showInternalMessageDialog(null,
						"Se lanzan flechas a klifdalholm, klifstenvik, aenesholm, aestensand");
				Main_Window.partida.reglasFlechas(0);
				Main_Window.partida.reglasFlechas(1);
				Main_Window.partida.reglasFlechas(5);
				Main_Window.partida.reglasFlechas(6);
				Main_Window.partida.actualizarInfo();
				break;

			}
			Main_Window.partida.Batalla();
			Main_Window.T2Carta = false;
		}

	}

	
}

