package com.everis.jevslf4j;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dual Everis - Ejercicios SLF4J - Javier Esmerado Vela
 *
 */
public class App {

	/* Instanciamos la clase Logger */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	Scanner sc = new Scanner(System.in);

	/**
	 * Método para realizar la suma.
	 */
	public void sum() {
		LOGGER.info("Ha entrado en el método sum.");
		try {
			System.out.println("Introduce el primer número: ");
			int n1 = sc.nextInt();
			
			LOGGER.info("Se ha obtenido el primer valor.");
			
			System.out.println("Introduce el segundo número: ");
			int n2 = sc.nextInt();
			
			LOGGER.info("Se ha introducido el segundo valor.");
			
			System.out.println("El resultado de la suma es : " + (n1 + n2));
			
		} catch (Exception e) {
			LOGGER.error("Ha entrado en la excepción.");
			System.err.println("Ha introducido un valor no numérico.");
			exit();
		}
		LOGGER.info("Sale del método sum.");
	}
	
	
	/**
	 * Método para realizar la resta.
	 */
	public void resta() {
		LOGGER.info("Ha entrado en el método resta.");
		try {
			System.out.println("Introduce el primer número: ");
			int n1 = sc.nextInt();
			
			LOGGER.info("Se ha obtenido el primer valor.");
			
			System.out.println("Introduce el segundo número: ");
			int n2 = sc.nextInt();
			
			LOGGER.info("Se ha introducido el segundo valor.");
			
			System.out.println("El resultado de la resta es : " + (n1 - n2));
			
		} catch (Exception e) {
			LOGGER.error("Ha entrado en la excepción.");
			System.err.println("Ha introducido un valor no numérico.");
			exit();
		}
		LOGGER.info("Sale del método resta.");
	}
	
	/**
	 * Método para la multiplicación.
	 */
	public void multi() {
		LOGGER.info("Ha entrado en el método multi.");
		try {
			System.out.println("Introduce el primer número: ");
			int n1 = sc.nextInt();
			
			LOGGER.info("Se ha obtenido el primer valor.");
			
			System.out.println("Introduce el segundo número: ");
			int n2 = sc.nextInt();
			
			LOGGER.info("Se ha introducido el segundo valor.");
			
			System.out.println("El resultado de la multiplicación es : " + (n1 * n2));
			
		} catch (Exception e) {
			LOGGER.error("Ha entrado en la excepción.");
			System.err.println("Ha introducido un valor no numérico.");
			exit();
		}
		LOGGER.info("Sale del método multi.");
	}
	
	/**
	 * Método para la división.
	 */
	public void div() {
		LOGGER.info("Ha entrado en el método div.");
		try {
			System.out.println("Introduce el primer número: ");
			int n1 = sc.nextInt();
			
			LOGGER.info("Se ha obtenido el primer valor.");
			
			LOGGER.warn("Si se introduce un valor menor o igual a 0, saltará excepción.");
			System.out.println("Introduce el segundo número: ");
			int n2 = sc.nextInt();
			
			LOGGER.info("Se ha introducido el segundo valor.");
			
			if(n2 <= 0) {
				System.err.println("El segundo valor no puede ser 0 o menor.");
				LOGGER.error("Ha introducido un valor menor o igual a 0.");
			}
			
			System.out.println("El resultado de la división es : " + (n1 / n2));
			
		} catch (Exception e) {
			LOGGER.error("Ha entrado en la excepción.");
			System.err.println("Ha introducido un valor no numérico.");
			exit();
		}
		LOGGER.info("Sale del método div.");
	}
	
	/**
	 * Método exit.
	 */
	public void exit() {
		LOGGER.info("Entra en el método exit.");
		System.out.println("HASTA PRONTO!!!");
		System.exit(0);
	}
	
	
	/**
	 * Menú de nuestra app.
	 */
	public void menu() {
		LOGGER.info("Entramos en el método menu.");
		while(true) {
			try {
				LOGGER.info("Entramos en el while.");
				System.out.println("Elija la operación que desea realizar");
				System.out.println("1.- Suma");
				System.out.println("2.- Resta");
				System.out.println("3.- Multiplicación");
				System.out.println("4.- División");
				System.out.println("5.- Salir");
				int n = sc.nextInt();
				LOGGER.info("Se ha seleccionado la acción a realizar.");
				
				switch (n) {
				case 1:
					LOGGER.info("Entramos en la opción 1.");
					sum();
					LOGGER.info("Salimos la opción 1.");
					break;
				case 2:
					LOGGER.info("Entramos en la opción 2.");
					resta();
					LOGGER.info("Salimos la opción 2.");
					break;
				case 3:
					LOGGER.info("Entramos en la opción 3.");
					multi();
					LOGGER.info("Salimos la opción 3.");
					break;
				case 4:
					LOGGER.info("Entramos en la opción 4.");
					div();
					LOGGER.info("Salimos la opción 4.");
					break;	
				default:
					LOGGER.info("Entramos en la opción default");
					exit();
					break;
				}
				
			}catch (Exception e) {
				LOGGER.error("Ha entrado en la excepción.");
				System.err.println("Ha introducido un valor no numérico.");
				exit();
			}
		}
	}
	
	
	

}
