package cc3002_pokemon_sergio_ehijo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FuegoTest {
	BatallaPokemon p ;
	BatallaPokemon f ;
	BatallaPokemon f2;
	BatallaPokemon a;
	BatallaPokemon e ;
	BatallaPokemon t ;
	BatallaPokemon ps ;
	BatallaPokemon l ;
	BatallaPokemon n ;
	@Before
	public void SetUp(){
	 p = new Planta();
	 f = new Fuego();
	 f2 = new Fuego();
	 a = new Agua();
	 e = new Electrico();
	 t = new Tierra();
	ps = new Psiquico();
	 l = new Lucha();
	 n = new Normal();
	}
	@Test
	public void FuegoAttacksPlanta() {
		f.attack(p);
		assertEquals(140, p.getTotalDamage());
	}
	@Test
	public void FuegoAttacksFuego(){
		f.attack(f2);
		assertEquals(70, f2.getTotalDamage());
	}
	@Test
	public void FuegoAttacksAgua(){
		f.attack(a);
		assertEquals(50, a.getTotalDamage());
	}
	@Test
	public void FuegoAttacksElectrico(){
		f.attack(e);
		assertEquals(70, e.getTotalDamage());
	}
	@Test
	public void FuegoAttacksTierra(){
		f.attack(t);
		assertEquals(70, t.getTotalDamage());
	}
	@Test
	public void FuegoAttacksPsiquico(){
		f.attack(ps);
		assertEquals(70, ps.getTotalDamage());
		assertEquals(100, ps.getLifePoints());
		assertEquals(0, f.getTotalDamage());
		assertEquals(100, f.getLifePoints());
		f.attack(ps);
		assertEquals(140,ps.getTotalDamage());
		ps.attack(f);
		assertEquals(0,f.getTotalDamage());
		//p.resetDamage();
		f.attack(ps);
		f2.attack(f);
		f2.attack(f);
		f.attack(ps);
		f.resetDamage();
		}
	@Test
	public void FuegoAttacksLucha(){
		f.attack(l);
		assertEquals(70, l.getTotalDamage());
	}
	@Test
	public void FuegoAttacksNormal(){
		f.attack(n);
		assertEquals(70, n.getTotalDamage());
	}	
}
