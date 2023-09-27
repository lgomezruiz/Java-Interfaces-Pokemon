
package javainterfacespokemon;

public class Bulbasaur extends Pokemon implements IPlant {

    //Empty Builder
    public Bulbasaur() {
    }
    
    /************************
        POKEMON COMMON METHODS
    *************************/
    @Override
    protected void attackTackle() {
        System.out.println("Bulbasaur use tackle!");
    }
    @Override
    protected void attackScratch() {
        System.out.println("Bulbasaur use scratch!");
    }
    @Override
    protected void attackBite() {
        System.out.println("Bulbasaur use bite!");
    }

    /*****************
        PLANT METHODS
    *****************/
    @Override
    public void attackSewerSystem() {
        System.out.println("Bulbasaur use sewer system!");
    }
    @Override
    public void attackParalyze() {
        System.out.println("Bulbasaur use paralyze!");
    }

    
    
        
}
