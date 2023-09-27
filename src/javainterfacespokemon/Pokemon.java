
package javainterfacespokemon;

public abstract class Pokemon {
    
    //Attributes
    protected int pokedexNum, season;
    protected String namePokemon;
    protected double weight;
    
    //Methods for common attacks
    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackBite();
}
