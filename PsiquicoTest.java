package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PsiquicoTest {

	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon ps2;
	BatallaPokemon l ;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	ps2 = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void PsiquicoAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		ps.attack(p);
		assertEquals(80, p.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksFuego(){
		ps.attack(f);
		assertEquals(80, f.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksAgua(){
		ps.attack(a);
		assertEquals(80, a.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksElectrico(){
		ps.attack(e);
		assertEquals(80, e.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksTierra(){
		ps.attack(t);
		assertEquals(80, t.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksPsiquico(){
		ps.attack(ps2);
		assertEquals(160, ps2.getTotalDamage());
	}
	@Test
	public void PsiquicoAttacksLucha(){
		ps.attack(l);
		assertEquals(160, l.getTotalDamage());
		assertEquals(100, l.getLifePoints());
		assertEquals(0, ps.getTotalDamage());
		assertEquals(100, ps.getLifePoints());
		ps.attack(l);
		assertEquals(160,l.getTotalDamage());
		l.attack(ps);
		assertEquals(0,ps.getTotalDamage());
		//p.resetDamage();
		ps2.attack(ps);
		assertEquals(160, ps.getTotalDamage());
		ps.attack(l);
		ps.resetDamage();
	}
	@Test
	public void PsiquicoAttacksNormal(){
		ps.attack(n);
		assertEquals(60, n.getTotalDamage());
	}
}
