package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TierraTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon t2;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	 t2 = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void TierraAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		t.attack(p);
		assertEquals(45, p.getTotalDamage());
	}
	@Test
	public void TierraAttacksFuego(){
		t.attack(f);
		assertEquals(130, f.getTotalDamage());
		assertEquals(100, f.getLifePoints());
		assertEquals(0, t.getTotalDamage());
		assertEquals(100, t.getLifePoints());
		t.attack(f);
		assertEquals(130,f.getTotalDamage());
		f.attack(t);
		assertEquals(0,t.getTotalDamage());
		//p.resetDamage();
		e.attack(t);
		e.attack(t);
		t.attack(f);
		t.resetDamage();
	}
	@Test
	public void TierraAttacksAgua(){
		t.attack(a);
		assertEquals(65, a.getTotalDamage());
	}
	@Test
	public void TierraAttacksElectrico(){
		t.attack(e);
		assertEquals(130, e.getTotalDamage());
	}
	@Test
	public void TierraAttacksTierra(){
		t.attack(t2);
		assertNotEquals(130,t2.getTotalDamage());
	}
	@Test
	public void TierraAttacksPsiquico(){
		t.attack(ps);
		assertEquals(65, ps.getTotalDamage());
	}
	@Test
	public void TierraAttacksLucha(){
		t.attack(l);
		assertEquals(45, l.getTotalDamage());
	}
	@Test
	public void TierraAttacksNormal(){
		t.attack(n);
		assertEquals(65, n.getTotalDamage());
	}	
}
