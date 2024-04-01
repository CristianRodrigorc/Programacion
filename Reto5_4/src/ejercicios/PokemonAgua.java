package ejercicios;

public class PokemonAgua extends Pokemon{

	/* se agregó este comentario */
	private int bonusAttack; 
	
	public PokemonAgua(String nombrePokemon, int healthPoints, int fuerzaDeAtaque) {
		super(nombrePokemon, healthPoints, fuerzaDeAtaque);
		this.bonusAttack = 2;
	}

}
