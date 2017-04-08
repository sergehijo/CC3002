package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NormalTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon n ;
	BatallaPokemon n2;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	 n2 = new Normal();
	}
	@Test
	public void NormalAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		n.attack(p);
		assertEquals(45, p.getTotalDamage());
	}
	@Test
	public void NormalAttacksFuego(){
		n.attack(f);
		assertEquals(45, f.getTotalDamage());
	}
	@Test
	public void NormalAttacksAgua(){
		n.attack(a);
		assertEquals(45, a.getTotalDamage());
	}
	@Test
	public void NormalAttacksElectrico(){
		n.attack(e);
		assertEquals(45, e.getTotalDamage());
	}
	@Test
	public void NormalAttacksTierra(){
		n.attack(t);
		assertEquals(25, t.getTotalDamage());
		assertEquals(100, t.getLifePoints());
		assertEquals(0, n.getTotalDamage());
		assertEquals(100, n.getLifePoints());
		a.attack(t);
		assertEquals(155,t.getTotalDamage());
		t.attack(n);
		assertEquals(0, n.getTotalDamage());
		//p.resetDamage();
		n.attack(t);
		l.attack(n);
		n2.attack(n);
		n.attack(t);
		n.resetDamage();
	}
	@Test
	public void NormalAttacksPsiquico(){
		n.attack(ps);
		assertEquals(45, ps.getTotalDamage());
	}
	@Test
	public void NormalAttacksLucha(){
		n.attack(l);
		assertEquals(45, l.getTotalDamage());
	}
	@Test
	public void NormalAttacksNormal(){
		n.attack(n2);
		assertEquals(45, n2.getTotalDamage());
	}		
}
