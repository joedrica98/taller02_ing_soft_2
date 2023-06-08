package labcodeinspection;

import java.util.Locale;

public class Email {

	private final String m_firstName; // final
	private final String m_lastName; // final
	private String password; // no es necesaria una inicialización redundante
	private String department;
	private final int DEFAULT_PASSWORD_LENGTH = 8;
	private String email;

    /**
     * Constructor de la clase Email.
     *
     * @param firstName el nombre de pila
     * @param lastName  el apellido
     */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

    /**
     * Muestra la información del correo electrónico.
     */
	public void showInfo() {
		System.out.println("\nNOMBRE DE PILA= " + m_firstName + "\nAPELLIDO= " + m_lastName);
		System.out.println("DEPARTAMENTO= " + department + "\nCORREO ELECTRÓNICO= " + email + "\nCONTRASEÑA= " + password);
	}

    /**
     * Establece el departamento según la opción proporcionada.
     *
     * @param depChoice la elección del departamento
     */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "ventas";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return String.valueOf(password); // evitar la creación innecesaria de un objeto String
	}

    /**
     * Genera el correo electrónico y la contraseña.
     */
	public void generateEmail() {
		this.password = this.randomPassword(this.DEFAULT_PASSWORD_LENGTH);
		this.email = this.m_firstName.toLowerCase(Locale.ROOT) + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
