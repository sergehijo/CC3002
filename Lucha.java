package cc3002_pokemon_sergio_ehijo;

public class Lucha implements BatallaPokemon {
	private int lifePoints; 
	private int totalDamage; 
	private int attackDamage;
	
	
	public Lucha(){
		lifePoints = 100;
		totalDamage= 0;
		attackDamage=70;
	}
	
	public void attack(BatallaPokemon Q){
		if (this.getLifePoints()> this.getTotalDamage() && Q.getLifePoints()> Q.getTotalDamage()) {
			Q.receiveAttackFrom(this);}			
	}
	public void receiveAttackFrom(Planta p){
		this.totalDamage += p.getAttackDamage();
	}
	public void receiveAttackFrom(Fuego F){
		this.totalDamage += F.getAttackDamage();
	}
	public void receiveAttackFrom(Agua A ){
		this.totalDamage += A.getAttackDamage();
	}
	public void receiveAttackFrom(Electrico E){
		this.totalDamage += E.getAttackDamage();
	}
	public void receiveAttackFrom(Tierra T){
		this.totalDamage += T.getAttackDamage()-20;
	}
	public void receiveAttackFrom(Psiquico ps){
		this.totalDamage += ps.getAttackDamage()*2;
	}
	public void receiveAttackFrom(Lucha L){
		this.totalDamage += L.getAttackDamage();
	}
	public void receiveAttackFrom(Normal N) {
		this.totalDamage += N.getAttackDamage();
	}
	public int getTotalDamage(){
		return this.totalDamage;
	}
	public int getAttackDamage(){
		return this.attackDamage;
	}
	public int getLifePoints(){
		return this.lifePoints;
	}
	public void resetDamage(){
		this.totalDamage = 0 ;
	}
}
