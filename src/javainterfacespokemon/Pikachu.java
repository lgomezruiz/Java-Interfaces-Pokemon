
package javainterfacespokemon;

public class Pikachu extends Pokemon implements IElectric {

    //Empty Builder
    public Pikachu() {
    }
  
    /************************
        POKEMON COMMON METHODS
    *************************/
    @Override
    protected void attackTackle() {
        System.out.println("Pikachu use tackle!");
    }
    @Override
    protected void attackScratch() {
         System.out.println("Pikachu use scratch!");
    }
    @Override
    protected void attackBite() {
        System.out.println("Pikachu use bite!");
    }

    /********************
        ELECTRIC METHODS
    ********************/
    @Override
    public void attackImpactthunder() {
        System.out.println("Pikachu use impactthunder!");
    }
    @Override
    public void attackElectricFist() {
        System.out.println("Pikachu use electric Fist!");
    }
    
    
}
