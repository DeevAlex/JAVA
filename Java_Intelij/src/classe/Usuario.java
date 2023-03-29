package classe;

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		/* Codigo seguro
		 
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			return super.equals(objeto);
		} else {
			return false;			
		}
		
		*/
		
		/* Usado para checar se os objetos são iguais porém se mandar outro gera um erro de casting, então esse possibilita fazer a verificacão se é igual
		 
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		
		*/
		
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
		} else {
			return false;			
		}
		
	}
	
	// hashCode
	
	@Override
	public int hashCode() {
		return this.nome.length();
	}
	
}
