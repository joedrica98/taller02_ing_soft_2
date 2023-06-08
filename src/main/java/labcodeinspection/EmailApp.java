package labcodeinspection;

import java.util.Scanner;

/**
 * La clase principal de la aplicación para manejar correos electrónicos.
 */
public final class EmailApp { // la clase de utilidad debería ser final

	/**
     * Constructor privado para evitar la instanciación.
     */
	private EmailApp() {
		// vacío
	}

	/**
     * Método principal de la aplicación.
     * 
     * @param args los argumentos de la línea de comandos
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese su nombre de pila: ");
		String firstName = sc.nextLine();

		System.out.print("Ingrese su apellido: ");
		String lastName = sc.nextLine();

		System.out.print("\nCÓDIGO DE DEPARTAMENTO\n1. para ventas\n2. para desarrollo\n3. para contabilidad\nIngrese el código: ");

		int depChoice = sc.nextInt();
		sc.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
