package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlantaTest {
	BatallaPokemon p ;
	BatallaPokemon p2;
	BatallaPokemon f ;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 p2 = new Planta();
	 f = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void PlantaAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		p.attack(p2);
		assertEquals(60, p2.getTotalDamage());
	}
	@Test
	public void PlantaAttacksFuego(){
		p.attack(f);
		assertEquals(40, f.getTotalDamage());
	}
	@Test
	public void PlantaAttacksAgua(){
		p.attack(a);
		assertEquals(120, a.getTotalDamage());
	}
	@Test
	public void PlantaAttacksElectrico(){
		p.attack(e);
		assertEquals(60, e.getTotalDamage());
	}
	@Test
	public void PlantaAttacksTierra(){
		p.attack(t);
		assertEquals(120, t.getTotalDamage());
		assertEquals(100, t.getLifePoints());
		assertEquals(0, p.getTotalDamage());
		assertEquals(100, p.getLifePoints());
		p.attack(t);
		assertEquals(120,t.getTotalDamage());
		t.attack(p);
		assertEquals(0,p.getTotalDamage());
		//p.resetDamage();
		f.attack(p);
		assertEquals(140,p.getTotalDamage());
		p.attack(t);
		assertEquals(120,t.getTotalDamage());
		p.resetDamage();
	}
	@Test
	public void PlantaAttacksPsiquico(){
		p.attack(ps);
		assertEquals(60, ps.getTotalDamage());
	}
	@Test
	public void PlantaAttacksLucha(){
		p.attack(l);
		assertEquals(60, l.getTotalDamage());
	}
	@Test
	public void PlantaAttacksNormal(){
		p.attack(n);
		assertEquals(60, n.getTotalDamage());
	}
}
