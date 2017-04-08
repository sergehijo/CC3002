package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LuchaTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon l2;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 l2 = new Lucha();
	 n = new Normal();
	}
	@Test
	public void LuchaAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		l.attack(p);
		assertEquals(70, p.getTotalDamage());
	}
	@Test
	public void LuchaAttacksFuego(){
		l.attack(f);
		assertEquals(70, f.getTotalDamage());
	}
	@Test
	public void LuchaAttacksAgua(){
		l.attack(a);
		assertEquals(70, a.getTotalDamage());
	}
	@Test
	public void LuchaAttacksElectrico(){
		l.attack(e);
		assertEquals(70, e.getTotalDamage());
	}
	@Test
	public void LuchaAttacksTierra(){
		l.attack(t);
		assertEquals(70, t.getTotalDamage());
	}
	@Test
	public void LuchaAttacksPsiquico(){
		l.attack(ps);
		assertEquals(70, ps.getTotalDamage());
		assertEquals(100, ps.getLifePoints());
		assertEquals(0, l.getTotalDamage());
		assertEquals(100, l.getLifePoints());
		l.attack(ps);
		assertEquals(140,ps.getTotalDamage());
		ps.attack(l);
		assertEquals(0,l.getTotalDamage());
		//p.resetDamage();
		l.attack(ps);
		l2.attack(l);
		l2.attack(l);
		l.attack(ps);
		l.resetDamage();
	}
	@Test
	public void LuchaAttacksLucha(){
		l2.attack(l);
		assertEquals(70, l.getTotalDamage());
	}
	@Test
	public void LuchaAttacksNormal(){
		l.attack(n);
		assertEquals(140, n.getTotalDamage());
	}	
}
