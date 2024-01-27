package classe;

public class EqualsComObj {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.nome = "Bruno Bazza";
		usuario.email = "brunonbazza@gmail.com";
		
		
		
		
		Usuario usuario2 = new Usuario();
		usuario2.nome = "Bruno Bazza";
		usuario2.email = "brunonbazza@gmail.com";
		
		System.out.println(usuario == usuario2); // quando compara um obj com outro ele compara o endereço de memoria e não o valor 
												 // de forma que o resultado seja false
		
		System.out.println(usuario.equals(usuario2)); 
		System.out.println(usuario2.equals(usuario));
		
	}
	
	
}
