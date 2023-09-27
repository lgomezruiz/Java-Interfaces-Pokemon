
package javainterfacespokemon;


public class JavaInterfacesPokemon {

    public static void main(String[] args) {
        
        Pikachu pikachu = new Pikachu ();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        
        squirtle.attackScratch();
        squirtle.attackHydropump();
        charmander.attackScratch();
        charmander.attackFlamethrower();
        bulbasaur.attackScratch();
        bulbasaur.attackSewerSystem();
        pikachu.attackScratch();
        pikachu.attackImpactthunder();
    }
    
}
