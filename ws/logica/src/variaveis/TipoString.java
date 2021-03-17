package variaveis;

public class TipoString {
	
	
	public static void main(String[] args) {
		String email = "vinicius.brunelli-barbosa@itau-unibanco.com.br";
		System.out.println("Original " + email);
		System.out.println("Minuscula " + email.toLowerCase());
		System.out.println("Qnt caracteres " + email.length());
		System.out.println("É igual " + email.equals("g@gama.com"));
		System.out.println("Tem arroba " + email.contains("@"));
		System.out.println("Posição do arroba " + email.indexOf("@"));
		System.out.println("Posição do arroba " + email.substring(2,5));

		if (email.contains("@") == true) {
			System.out.println("Usuário: " +email.substring(0,email.indexOf("@")));
		}
		// == representa comparação entre os primitivos
		// = atribuição da variavel
		
		
		
		
	}

}
