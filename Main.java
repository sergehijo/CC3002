package cc3002_pokemon_sergio_ehijo;

public class Main  {

	public static void main(String[] args) {
		BatallaPokemon p = new Planta();
		BatallaPokemon f = new Fuego();
		p.attack(f);
		System.out.println(f.getTotalDamage());
		f.attack(p);
		System.out.println(p.getTotalDamage());
		f.attack(p);
		System.out.println(f.getTotalDamage());
		p.attack(f);
		System.out.println(p.getTotalDamage());
	}

}
