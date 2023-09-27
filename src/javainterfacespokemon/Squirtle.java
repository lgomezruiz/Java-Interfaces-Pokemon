
package javainterfacespokemon;

public class Squirtle extends Pokemon implements IWater {
    
    //Empty Builder
    public Squirtle() {
    }
    
    /************************
        POKEMON COMMON METHODS
    *************************/
    @Override
    protected void attackTackle() {
        System.out.println("Squirtle use tackle!");
    }
    @Override
    protected void attackScratch() {
         System.out.println("Squirtle use scratch!");
    }
    @Override
    protected void attackBite() {
        System.out.println("Squirtle use bite!");
    }

    /*****************
        WATER METHODS
    *****************/
    @Override
    public void attackHydropump() {
        System.out.println("Squirtle use hydropump!");
    }
    @Override
    public void attackBubble() {
        System.out.println("Squirtle use bubble!");
    }
    @Override
    public void attackWaterGun() {
        System.out.println("Squirtle use water gun!");
    }
}
