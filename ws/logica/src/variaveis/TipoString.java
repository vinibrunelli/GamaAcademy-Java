package variaveis;

public class TipoString {
	
	
	public static void main(String[] args) {
		String email = "vinicius.brunelli-barbosa@itau-unibanco.com.br";
		System.out.println("Original " + email);
		System.out.println("Minuscula " + email.toLowerCase());
		System.out.println("Qnt caracteres " + email.length());
		System.out.println("� igual " + email.equals("g@gama.com"));
		System.out.println("Tem arroba " + email.contains("@"));
		System.out.println("Posi��o do arroba " + email.indexOf("@"));
		System.out.println("Posi��o do arroba " + email.substring(2,5));

		if (email.contains("@") == true) {
			System.out.println("Usu�rio: " +email.substring(0,email.indexOf("@")));
		}
		// == representa compara��o entre os primitivos
		// = atribui��o da variavel
		
		
		
		
	}

}
