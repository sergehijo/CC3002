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
	 e = new Electrico();
	 e2 = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void ElectricoAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		e.attack(p);
		assertEquals(80, p.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksFuego(){
		e.attack(f);
		assertEquals(80, f.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksAgua(){
		e.attack(a);
		assertEquals(160, a.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksElectrico(){
		e.attack(e2);
		assertEquals(60, e2.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksTierra(){
		e.attack(t);
		assertEquals(60, t.getTotalDamage());
		assertEquals(100, t.getLifePoints());
		assertEquals(0, e.getTotalDamage());
		assertEquals(100, e.getLifePoints());
		e.attack(t);
		assertEquals(120,t.getTotalDamage());
		t.attack(e);
		assertEquals(0,e.getTotalDamage());
		//p.resetDamage();
		e.attack(t);
		e2.attack(e);
		e2.attack(e);
		e.attack(t);
		e.resetDamage();
	}
	@Test
	public void ElectricoAttacksPsiquico(){
		e.attack(ps);
		assertEquals(80, ps.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksLucha(){
		e.attack(l);
		assertEquals(80, l.getTotalDamage());
	}
	@Test
	public void ElectricoAttacksNormal(){
		e.attack(n);
		assertEquals(80, n.getTotalDamage());
	}	
}
