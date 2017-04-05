package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricoTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e2;
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
	 e2 = new Electrico();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void PlantaAttacksElectrico(){
		p.attack(e);
		assertEquals(60, e.getTotalDamage());
		assertNotEquals(-20,e.getLifePoints());
		e.attack(p);
		e.resetDamage();
		e.attack(p);
		assertEquals(160, p.getTotalDamage());
		assertEquals(0, e.getTotalDamage());
		f.attack(p);
		e.attack(p);
	}	
	@Test
	public void FuegoAttacksElectrico(){
		f.attack(e);
		assertEquals(70, e.getTotalDamage());
	}
	@Test
	public void AguaAttacksElectrico(){
		a.attack(e);
		assertEquals(65, e.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksElectrico(){
		e.attack(e2);
		assertEquals(60, e2.getTotalDamage());
	}
	@Test
	public void TierraAttacksElectrico(){
		t.attack(e);
		assertEquals(130, e.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksElectrico(){
		ps.attack(e);
		assertEquals(80, e.getTotalDamage());
	}
	@Test
	public void LuchaAttacksElectrico(){
		l.attack(e);
		assertEquals(70, e.getTotalDamage());
	}
	@Test
	public void NormalAttacksElectrico(){
		n.attack(e);
		assertEquals(45, e.getTotalDamage());
	}	
}
