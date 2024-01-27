package classe;

public class Usuario {

	String nome;
	String email;
	
	
	@Override
	public boolean equals(Object obj) {
		
		// aqui se a instancia for do tipo Usuario ele entra no if fazedo a comparação se não for retorna false
		if(obj instanceof Usuario) {
			
			Usuario outro = (Usuario) obj; // aqui temos um casting onde converte o obj instanciado para usuario
			
			boolean nomeIgual = outro.nome.equals(nome);  
			boolean emailIgual = outro.email.equals(email);
			
			return nomeIgual && emailIgual;
		
		} else {
			
			return false;
		}
		
		
	}
	
}
