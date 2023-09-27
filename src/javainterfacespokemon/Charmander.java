
package javainterfacespokemon;

public class Charmander extends Pokemon implements IFire {
    
    //Empty Builder
    public Charmander() {
    }
    
    /************************
        POKEMON COMMON METHODS
    *************************/
    @Override
    protected void attackTackle() {
        System.out.println("Charmander use tackle!");
    }
    @Override
    protected void attackScratch() {
         System.out.println("Charmander use scratch!");
    }
    @Override
    protected void attackBite() {
        System.out.println("Charmander use bite!");
    }

    /****************
        FIRE METHODS
    ****************/
    @Override
    public void attackFireFist() {
        System.out.println("Charmander use fire fist!");
    }
    @Override
    public void attackFlamethrower() {
        System.out.println("Charmander use flamethrower!");
    }
    @Override
    public void attackEmbers() {
        System.out.println("Charmander use embers!");
    }
}
