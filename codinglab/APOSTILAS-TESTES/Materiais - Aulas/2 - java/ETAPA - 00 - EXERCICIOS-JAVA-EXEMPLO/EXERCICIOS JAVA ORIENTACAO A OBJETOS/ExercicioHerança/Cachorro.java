package ExercicioHerança;

public class Cachorro extends Animal {

	public Cachorro(String nom, String ida, String emSom, String correr)
	{
		super(nom,ida, emSom,correr);
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: " + getNome() + 
				"\nIdade do Animal: " + getIdade() + 
				"\nSom emitido: " + getEmitirSom()
				+ "\nCorrer? " + getCorrer());
	}
	
}
