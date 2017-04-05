package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AguaTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon a2;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 a2 = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void PlantaAttacksAgua(){
		p.attack(a);
		assertEquals(120, a.getTotalDamage());
		assertNotEquals(-20,a.getLifePoints());
		a.attack(p);
		a.resetDamage();
		a.attack(p);
		assertEquals(45, p.getTotalDamage());
		assertEquals(0, a.getTotalDamage());
		f.attack(p);
		a.attack(p);
	}	
	@Test
	public void FuegoAttacksAgua(){
		f.attack(a);
		assertEquals(50, a.getTotalDamage());
		assertEquals(100,a.getLifePoints());
		assertEquals(0, f.getTotalDamage());
		f.attack(a);
		a.attack(f);
		assertNotEquals(130, f.getTotalDamage());
		a.resetDamage();
		a.attack(f);
		f.attack(a);
		assertNotEquals(50, a.getTotalDamage());
	}
	@Test
	public void AguaAttacksAgua(){
		a2.attack(a);
		assertEquals(65, a.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksAgua(){
		e.attack(a);
		assertEquals(160, a.getTotalDamage());
	}
	@Test
	public void TierraAttacksAgua(){
		t.attack(a);
		assertEquals(65, a.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksAgua(){
		ps.attack(a);
		assertEquals(80, a.getTotalDamage());
	}
	@Test
	public void LuchaAttacksAgua(){
		l.attack(a);
		assertEquals(70, a.getTotalDamage());
	}
	@Test
	public void NormalAttacksAgua(){
		n.attack(a);
		assertEquals(45, a.getTotalDamage());
	}
}
