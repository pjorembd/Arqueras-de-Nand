package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.sun.tools.javac.launcher.Main;


public class Partida {

	private int dificultad, coste_huida,mazo_hordas,ronda,territoriosDestruidos;
	private String dificultadT;
	public Territorio[] territorios = new Territorio[7];
	private int monedaVerde, monedaAzul, monedaRoja, randomMoneda;	
	private ArrayList <Integer> hordaDeOrcos;
	private boolean arquerasHuyen;
	public static boolean guerra;
	public static int flechas,carta1,carta2,carta3,carta4,random;
	public static boolean carta1_eliminada,carta2_eliminada,carta3_eliminada,carta4_eliminada;
	public static Cartas carta;
	public static ArrayList <Cartas> mazoCartas = new ArrayList<Cartas>();
	
	public Partida(int dificultad){
	
	this.dificultad = dificultad;	
	
	territoriosDestruidos = 0;
	
	ronda = 0;
	
	Main_Window.textRonda.setText(Integer.toString(ronda));
	
	deshabilitarMCUC();
	
	setPropiedades();
	
	//propieades partida	
	JOptionPane.showMessageDialog(null, getTextoDificultad());
		
	//creo todo lo necesario para jugar
	crearTerritorios();
	crearCartas();
	barajarCartas(true,true,true,true);
	deshabilitarCartas();
	deshabilitarDescartar();
	Main_Window.setActionCommandCartas();
	arquerasHuyen = false;
	carta1_eliminada = false;
	carta2_eliminada = false;
	carta3_eliminada = false;
	carta4_eliminada = false;
	Main_Window.textFlechas.setText(Integer.toString(flechas));
	Main_Window.textHordas.setText(Integer.toString(mazo_hordas));
	
	//inicio la ronda
	manoColocarGuerreros();
	
	}
		
	private void setPropiedades() {
		
	//ajusto numeros segun dificultad	
		
		switch (dificultad) {
		case 1:
			flechas = 50;
			coste_huida = -1;
			hordaDeOrcos = new ArrayList<Integer>(Arrays.asList(3,3,3,3,3,4,4,4,4,4));
			mazo_hordas = hordaDeOrcos.size();
			dificultadT = "facil";
			break;
		case 2:
			flechas = 48;
			coste_huida = -2;
			hordaDeOrcos = new ArrayList<Integer>(Arrays.asList(3,3,3,3,4,4,4,4,5,5,5,5));
			mazo_hordas = hordaDeOrcos.size();
			dificultadT = "normal";
			break;
		case 3:
			flechas = 45;
			coste_huida = -3;
			hordaDeOrcos = new ArrayList<Integer>(Arrays.asList(3,3,3,3,3,4,4,4,4,4,5,5,5,5,5));
			mazo_hordas = hordaDeOrcos.size();
			dificultadT = "dificil";
			break;

		default:
			JOptionPane.showMessageDialog(null, "operacion inválida");
			break;
		}

}
	
	private String getTextoDificultad() {

		return "La dificultad elegida es " + dificultadT + ", tienes " + flechas + " flechas, " + " hay " + mazo_hordas
				+ " hordas de orcos,y la huida te cuesta " + coste_huida;

	}

	private void crearTerritorios() {

		territorios[0] = new Territorio("klifdalholm", 1, 1, 0);

		territorios[1] = new Territorio("klifstenvik", 0, 1, 0);

		territorios[2] = new Territorio("beknesvik", 0, 1, 1);

		territorios[3] = new Territorio("bekdalsand", 1, 0, 0);

		territorios[4] = new Territorio("bekstenholm", 1, 1, 1);

		territorios[5] = new Territorio("aenesholm", 0, 0, 1);

		territorios[6] = new Territorio("aestensand", 1, 0, 1);

	}
	
	private void crearCartas() {

		for (int i = 0; i < 3; i++) {

			carta = new Bengala("Bengala");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new Count("Count");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new Like("Like");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new NOT("Not");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new OR("OR");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new AND("AND");
			mazoCartas.add(carta);

		}

		for (int i = 0; i < 5; i++) {

			carta = new XOR("XOR");
			mazoCartas.add(carta);

		}

	}
	
	void barajarCartas(boolean c1, boolean c2, boolean c3,boolean c4) {
				
		if (c1 == true) {
			
			random = (int) (Math.random() * mazoCartas.size()) - 1;
			
			if (random >= mazoCartas.size() || random < 0) {
				
				do {
					random = (int) (Math.random() * mazoCartas.size()) - 1;
				} while (random >= mazoCartas.size() && random > 0);
				carta1 = (int) (Math.random() * mazoCartas.size()) - 1;
			}else {
				
				carta1 = random;
				
			}
		}
		
		if (c2 == true) {

			random = (int) (Math.random() * mazoCartas.size()) - 1;

			if (random >= mazoCartas.size() || random < 0) {

				do {
					random = (int) (Math.random() * mazoCartas.size()) - 1;
				} while (random >= mazoCartas.size() && random > 0);
				carta2 = (int) (Math.random() * mazoCartas.size()) - 1;
			}else {
				
				carta2 = random;
				
			}
		}

		if (c3 == true) {

			random = (int) (Math.random() * mazoCartas.size()) - 1;

			if (random >= mazoCartas.size() || random < 0) {

				do {
					random = (int) (Math.random() * mazoCartas.size()) - 1;
				} while (random >= mazoCartas.size() && random > 0);
				carta3 = (int) (Math.random() * mazoCartas.size()) - 1;
			}else {
				
				carta3 = random;
				
			}
		}

		if (c4 == true) {

			random = (int) (Math.random() * mazoCartas.size()) - 1;

			if (random >= mazoCartas.size() || random < 0) {

				do {
					random = (int) (Math.random() * mazoCartas.size()) - 1;
				} while (random >= mazoCartas.size() && random > 0);
				carta4 = (int) (Math.random() * mazoCartas.size()) - 1;
			}else {
				
				carta4 = random;
				
			}
		}
	}
	
	private void manoColocarGuerreros() {
		
		Main_Window.setActionCommandCartas();
						
		Main_Window.indiceDescartar = 0;
		
		habilitarBotones();
		
		//es la primera accion que hace el boton, mete un caballero donde elijas
		Main_Window.klifdalholm.setActionCommand("MCG_klifdalholm");
		Main_Window.klifstenvik.setActionCommand("MCG_klifstenvik");
		Main_Window.beknesvik.setActionCommand("MCG_beknesvik");
		Main_Window.bekdalsand.setActionCommand("MCG_bekdalsand");
		Main_Window.bekstenholm.setActionCommand("MCG_bekstenholm");
		Main_Window.aenesholm.setActionCommand("MCG_aenesholm");
		Main_Window.aestensand.setActionCommand("MCG_aestensand");
		
		carta1_eliminada = false;
		carta2_eliminada = false;
		carta3_eliminada = false;
		carta4_eliminada = false;
		
		
		Main_Window.carta1_eliminada_decartar = false;
		Main_Window.carta2_eliminada_decartar = false;
		Main_Window.carta3_eliminada_decartar = false;
		Main_Window.carta4_eliminada_decartar = false;
		
	}
	
	void colocarOrcos() {
		
		//llama a un metodo que hace todo lo necesario para meter orcos en territorios
		sacarCartaOrcos();

		//activa mover caballero o usar carta, y cambia la accion de los botones para prepararse para el turno 1
		habilitarMCUC();
		Main_Window.setActionCommandT1();
		printInfo();
		
	}
	
	void Batalla() {
	
	//comprueba si es el turno 2, para hacer la batalla
	if(guerra) {
	
		JOptionPane.showMessageDialog(null, "Voy a comprobar si hay orcos y caballeros suficientes como para hacer batalla");
		
		for (int i = 0; i < territorios.length; i++) {

			if (territorios[i].getCaballeros() > 0 && territorios[i].getOrcos() > 0) {

				JOptionPane.showInternalMessageDialog(null, "Se han encontrado orcos y caballeros suficientes en "
						+ territorios[i].getNombre() + " como para combatir, que empiece la lucha");

				int caballeros = territorios[i].getCaballeros();
				int orcos = territorios[i].getOrcos();
				int caballeros_principio = caballeros;

				caballeros = caballeros - (orcos * 2);
				orcos = orcos - (caballeros_principio / 2);

				if (caballeros < 0) {

					caballeros = 0;

				} else if (orcos < 0) {

					orcos = 0;

				}

				territorios[i].setCaballerosBatalla(caballeros);
				territorios[i].setOrcosBatalla(orcos);

				JOptionPane.showInternalMessageDialog(null,
						"El resultado de la batalla ha sido: " + territorios[i].getNombre() + " Orcos: "
								+ territorios[i].getOrcos() + " Caballeros: "
								+ territorios[i].getCaballeros());

			}

		}
		
		guerra = false;
		
		printInfo();
		
		deshabilitarMCUC();
		
		ronda ++;
		Main_Window.textRonda.setText(Integer.toString(ronda));
		
		if(territoriosDestruidos>=4) {
			JOptionPane.showInternalMessageDialog(null, "Has perdido porque los orcos han destruido 4 o mas territorios");
			Dificultad dificultad = new Dificultad();
			dificultad.setVisible(true);
		}else if(hordaDeOrcos.size() == 0) {
			JOptionPane.showInternalMessageDialog(null, "Has ganado porque los orcos ya no tienen mas hordas");
			Dificultad dificultad = new Dificultad();
			dificultad.setVisible(true);
		}
		
		actualizarInfo();
		
		//flujo
		manoColocarGuerreros();

	}

}

	void moverCaballero(int territorio) {
		
		elegirTerritorioDesdeElQueMover();
		
		
	}
	
	void elegirTerritorioDesdeElQueMover() {
		
		//si el territorio tiene caballeros para mover se activa
		if(territorios[0].getCaballeros() > 0) {
			Main_Window.klifdalholm.setEnabled(true);
		}
		
		if(territorios[1].getCaballeros() > 0) {
			Main_Window.klifstenvik.setEnabled(true);
		}
		
		if(territorios[2].getCaballeros() > 0) {
			Main_Window.beknesvik.setEnabled(true);
		}
		
		if(territorios[3].getCaballeros() > 0) {
			Main_Window.bekdalsand.setEnabled(true);
		}
		
		if(territorios[4].getCaballeros() > 0) {
			Main_Window.bekstenholm.setEnabled(true);
		}
		
		if(territorios[5].getCaballeros() > 0) {
			Main_Window.aenesholm.setEnabled(true);
		}
		
		if(territorios[6].getCaballeros() > 0) {
			Main_Window.aestensand.setEnabled(true);
		}
		
		
	}
	
	void restarCaballero(int territorio) {
	
		territorios[territorio].restarCaballero();
		printInfo();
		
		elegirTerritorioAlQueMover(territorio);
		
	}
	
	void elegirTerritorioAlQueMover(int territorio) {
		
		habilitarBotonesAdyacentes(territorio);
		
	}
	
	private void insertarOrcosEnTerritorio() {
		
		/*compruebo los colores de cada territorio, para insertar orcos
		en los que tengan los mismos colores que los que han salido en la moneda*/
		
		for (int i = 0; i < 7; i++) {

			if (territorios[i].getVerde() == monedaVerde && 
					territorios[i].getRojo() == monedaRoja &&
					 territorios[i].getAzul() == monedaAzul) {

				//si el territorio tiene mas de 4 orcos, hay que agnadirle uno mas
				
				if(territorios[i].getOrcos() > 4) {

					territorios[i].setOrcos(1 + 1);
					JOptionPane.showMessageDialog(null,"Se ha agnadido un orco mas a " + territorios[i].getNombre() + " porque habia mas de 4 orcos");
					
				}else {		
					
					territorios[i].setOrcos(1);
				}
				
			}
			
		}
		
		//controlo la huida de arqueras
		if(monedaAzul == 0 && monedaVerde == 0 && monedaRoja == 0) {
			
			JOptionPane.showMessageDialog(null, "Las arqueras huyen");
			
			if(arquerasHuyen) {
				
				JOptionPane.showMessageDialog(null, "Las arqueras vuelven a huir, pero no pierden flechas");
				
			}else {
				flechas+=coste_huida;
				Main_Window.textFlechas.setText(Integer.toString(flechas));
				arquerasHuyen = true;
			}
			
		}
		
		for (int i = 0; i < 7; i++) {
			
			if(territorios[i].getOrcos()>=3) {
				territorios[i].Destruir();
				JOptionPane.showMessageDialog(null,"Se ha destruido el territorio " + territorios[i].getNombre());
				territoriosDestruidos++;
			}
			
		}

	}
	
	void sacarCartaOrcos() {

		//Saco una carta del mazo de orcos
		
		int random =(int) (Math.random()*hordaDeOrcos.size());
		
		//me aseguro de que el random pueda devolver una carta valida
		if(hordaDeOrcos.get(random) == 0) {
			
			do {
				
				random = (int) (Math.random()*hordaDeOrcos.size());
				
			} while(hordaDeOrcos.get(random) == 0);
			
		}
		
		JOptionPane.showInternalMessageDialog(null, "La carta del mazo de hordas tiene un valor de " + hordaDeOrcos.get(random) + " orcos");
						
		//asi controlo que si sale una carta con 3 orcos, meta 3 orcos a sitios distintos
		for(int i = 0;i < hordaDeOrcos.get(random); i++) {
			
			tirarMoneda();
			insertarOrcosEnTerritorio();
			
			if(territorios[i].getOrcos() > 3) {
				
				territorios[i].isDestruido();
				/*
				 * boton.setEnabled(false)
				 */
				
			}
			
		}
		
		arquerasHuyen = false;
		
		//asi me aseguro de gastar todas las cartas sin que se repitan
		hordaDeOrcos.set(random, 0);
		mazo_hordas--;
		
		Main_Window.textHordas.setText(Integer.toString(mazo_hordas));
	}	
	
	private void tirarMoneda() {
		
		//Fichas con colores para saber donde puedo meter orcos
		
		randomMoneda = (int) (Math.random()*2);
		monedaVerde = randomMoneda;
		
		randomMoneda = (int) (Math.random()*2);
		monedaRoja = randomMoneda;
		
		randomMoneda = (int) (Math.random()*2);
		monedaAzul = randomMoneda;
		
	}

	public void deshabilitarBotones() {
		
		Main_Window.klifdalholm.setEnabled(false);
		Main_Window.klifstenvik.setEnabled(false);
		Main_Window.beknesvik.setEnabled(false);
		Main_Window.bekdalsand.setEnabled(false);
		Main_Window.bekstenholm.setEnabled(false);
		Main_Window.aenesholm.setEnabled(false);
		Main_Window.aestensand.setEnabled(false);

	}

	public static void habilitarBotones() {

		Main_Window.klifdalholm.setEnabled(true);
		Main_Window.klifstenvik.setEnabled(true);
		Main_Window.beknesvik.setEnabled(true);
		Main_Window.bekdalsand.setEnabled(true);
		Main_Window.bekstenholm.setEnabled(true);
		Main_Window.aenesholm.setEnabled(true);
		Main_Window.aestensand.setEnabled(true);

	}

	public void habilitarBotonesAdyacentes(int territorio) {
		
		Main_Window.setActionCommandTerritorioAlQueMover();
		
		switch (territorio) {
		case 0:
			Main_Window.klifstenvik.setEnabled(true);
			Main_Window.bekdalsand.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		case 1:
			Main_Window.klifdalholm.setEnabled(true);
			Main_Window.beknesvik.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		case 2:
			Main_Window.klifstenvik.setEnabled(true);
			Main_Window.aenesholm.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		case 3:
			Main_Window.klifdalholm.setEnabled(true);
			Main_Window.aestensand.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		case 4:
			Main_Window.klifstenvik.setEnabled(true);
			Main_Window.klifdalholm.setEnabled(true);
			Main_Window.beknesvik.setEnabled(true);
			Main_Window.bekdalsand.setEnabled(true);
			Main_Window.aestensand.setEnabled(true);
			Main_Window.aenesholm.setEnabled(true);
			break;
		case 5:
			Main_Window.beknesvik.setEnabled(true);
			Main_Window.aestensand.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		case 6:
			Main_Window.bekdalsand.setEnabled(true);
			Main_Window.aenesholm.setEnabled(true);
			Main_Window.bekstenholm.setEnabled(true);
			break;
		}
		
	}
	
	public void deshabilitarMCUC() {
		Main_Window.MoverCaballero.setEnabled(false);
		Main_Window.UsarCartas.setEnabled(false);
	}
	
	public static void habilitarMCUC() {
		Main_Window.MoverCaballero.setEnabled(true);
		Main_Window.UsarCartas.setEnabled(true);
	}

	public void habilitarCartas() {

		if(carta1_eliminada) {
			Main_Window.carta_1.setEnabled(false);	
		}else if(carta1_eliminada == false) {
			Main_Window.carta_1.setEnabled(true);	
		}

		if(carta2_eliminada) {
			Main_Window.carta_2.setEnabled(false);	
		}else if(carta2_eliminada == false) {
			Main_Window.carta_2.setEnabled(true);	
		}

		if(carta3_eliminada) {
			Main_Window.carta_3.setEnabled(false);	
		}else if(carta3_eliminada == false) {
			Main_Window.carta_3.setEnabled(true);	
		}

		if(carta4_eliminada) {
			Main_Window.carta_4.setEnabled(false);	
		}else if(carta4_eliminada == false) {
			Main_Window.carta_4.setEnabled(true);	
		}

	}

	public void deshabilitarCartas() {

		Main_Window.carta_1.setEnabled(false);
		Main_Window.carta_2.setEnabled(false);
		Main_Window.carta_3.setEnabled(false);
		Main_Window.carta_4.setEnabled(false);

	}
	
	public void deshabilitarDescartar() {
		
		Main_Window.Descartar1.setEnabled(false);
		Main_Window.Descartar2.setEnabled(false);
		Main_Window.Descartar3.setEnabled(false);
		Main_Window.Descartar4.setEnabled(false);
		
	}
	
	public void habilitarDescartar(int indice) {
	
		deshabilitarMCUC();
	
		switch (indice) {
		
		case 0:
			Main_Window.Descartar1.setEnabled(true);
			Main_Window.Descartar2.setEnabled(true);
			Main_Window.Descartar3.setEnabled(true);
			Main_Window.Descartar4.setEnabled(true);
			break;
		
		case 1:
			Main_Window.Descartar1.setEnabled(false);
			Main_Window.Descartar2.setEnabled(true);
			Main_Window.Descartar3.setEnabled(true);
			Main_Window.Descartar4.setEnabled(true);
			break;
			
		case 2:
			Main_Window.Descartar1.setEnabled(true);
			Main_Window.Descartar2.setEnabled(false);
			Main_Window.Descartar3.setEnabled(true);
			Main_Window.Descartar4.setEnabled(true);
			break;
			
		case 3:
			Main_Window.Descartar1.setEnabled(true);
			Main_Window.Descartar2.setEnabled(true);
			Main_Window.Descartar3.setEnabled(false);
			Main_Window.Descartar4.setEnabled(true);
			break;
			
		case 4:
			Main_Window.Descartar1.setEnabled(true);
			Main_Window.Descartar2.setEnabled(true);
			Main_Window.Descartar3.setEnabled(true);
			Main_Window.Descartar4.setEnabled(false);
			break;

		default:
			break;
		}
		
		
	}
	
	public void printInfo() {
		
//		Main_Window.text.append("\n");
//		Main_Window.text.append(territorios[0].toString());
//		Main_Window.text.append(territorios[1].toString());
//		Main_Window.text.append(territorios[2].toString());
//		Main_Window.text.append(territorios[3].toString());
//		Main_Window.text.append(territorios[4].toString());
//		Main_Window.text.append(territorios[5].toString());
//		Main_Window.text.append(territorios[6].toString());
//		Main_Window.text.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
//		Main_Window.text.append("\n");
		
	}
	
	public void actualizarInfo() {

		Main_Window.textFlechas.setText(Integer.toString(flechas));
		Main_Window.textHordas.setText(Integer.toString(mazo_hordas));

		Main_Window.txt_caballeros_Klifdalholm.setText(Integer.toString(territorios[0].getCaballeros()));
		Main_Window.txt_caballeros_Klifstenvik.setText(Integer.toString(territorios[1].getCaballeros()));
		Main_Window.txt_caballeros_beknesvik.setText(Integer.toString(territorios[2].getCaballeros()));
		Main_Window.txt_caballeros_bekdalsand.setText(Integer.toString(territorios[3].getCaballeros()));
		Main_Window.txt_caballeros_bekstenholm.setText(Integer.toString(territorios[4].getCaballeros()));
		Main_Window.txt_caballeros_aenesholm.setText(Integer.toString(territorios[5].getCaballeros()));
		Main_Window.txt_caballeros_aestensand.setText(Integer.toString(territorios[6].getCaballeros()));

		Main_Window.txt_orcos_klifdalholm.setText(Integer.toString(territorios[0].getOrcos()));
		Main_Window.txt_orcos_Klifstenvik.setText(Integer.toString(territorios[1].getOrcos()));
		Main_Window.txt_orcos_beknesvik.setText(Integer.toString(territorios[2].getOrcos()));
		Main_Window.txt_orcos_bekdalsand.setText(Integer.toString(territorios[3].getOrcos()));
		Main_Window.txt_orcos_bekstenholm.setText(Integer.toString(territorios[4].getOrcos()));
		Main_Window.txt_orcos_aenesholm.setText(Integer.toString(territorios[5].getOrcos()));
		Main_Window.txt_orcos_aestensand.setText(Integer.toString(territorios[6].getOrcos()));

	}

	void reglasFlechas(int i) {
		
		if (territorios[i].getOrcos() >= 1 && territorios[i].getCaballeros() == 0) {

			territorios[i].restarOrcos(1);
			flechas--;

		}

		if (territorios[i].getOrcos() == 1 && territorios[i].getCaballeros() == 0) {

			flechas -= 2;

		}

		if (territorios[i].getOrcos() == 0 && territorios[i].getCaballeros() >= 1) {

			territorios[i].restarCaballero();
			flechas -= 3;

		}

		if (territorios[i].getOrcos() >= 1 && territorios[i].getCaballeros() >= 1) {

			territorios[i].restarOrcos(1);
			territorios[i].restarCaballero();
			flechas -= 4;

		}

	}

}
