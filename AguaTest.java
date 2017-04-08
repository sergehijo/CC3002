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
	public void AguaAttacksPlanta() {
		//Se prueba el metodo attack de agua y todos sus casos.
		a.attack(p);
		assertEquals(45, p.getTotalDamage());
		assertEquals(100, p.getLifePoints());
		assertEquals(0, a.getTotalDamage());
		assertEquals(100, a.getLifePoints());
		f.attack(p);
		assertEquals(185,p.getTotalDamage());
		p.attack(a);
		assertEquals(0,a.getTotalDamage());
		//p.resetDamage();
		a.attack(p);
		e.attack(a);
		a.attack(p);
		a.resetDamage();
	}
	@Test
	public void AguaAttacksFuego(){
		a.attack(f);
		assertEquals(130, f.getTotalDamage());
	}
	@Test
	public void AguaAttacksAgua(){
		a.attack(a2);
		assertEquals(65, a2.getTotalDamage());
	}
	@Test
	public void AguaAttacksElectrico(){
		a.attack(e);
		assertEquals(65, e.getTotalDamage());
	}
	@Test
	public void AguaAttacksTierra(){
		a.attack(t);
		assertEquals(130, t.getTotalDamage());
	}
	@Test
	public void AguaAttacksPsiquico(){
		a.attack(ps);
		assertEquals(65, ps.getTotalDamage());
	}
	@Test
	public void AguaAttacksLucha(){
		a.attack(l);
		assertEquals(65, l.getTotalDamage());
	}
	@Test
	public void AguaAttacksNormal(){
		a.attack(n);
		assertEquals(65, n.getTotalDamage());
	}	
}
