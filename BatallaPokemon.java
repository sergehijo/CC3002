package cc3002_pokemon_sergio_ehijo;

public interface BatallaPokemon {
	
	public void attack(BatallaPokemon Q);
	
	public void receiveAttackFrom(Planta r);
	public void receiveAttackFrom(Fuego F);
	public void receiveAttackFrom(Agua A );
	public void receiveAttackFrom(Electrico E);
	public void receiveAttackFrom(Tierra T);
	public void receiveAttackFrom(Psiquico ps);
	public void receiveAttackFrom(Lucha L);
	public void receiveAttackFrom(Normal N);

	public int getTotalDamage();
	public int getAttackDamage();
	public int getLifePoints();

	public void resetDamage();
}
