
package simuladorpokemon;

//Classe principal (método main): terá instanciados os objetos do tipo Batalha e Pokémon e exibir o resultado das batalhas.
// ARRUMAR
public class pokemonsimulador {

    
    public static void main(String[] args) {
  
        // Instanciar um objeto do tipo Pokemon
       
        int vencedor;
        pokemon meuPokemonNome = new pokemon("Fogo", 10);
        pokemon outroPokemonHP = new pokemon("Agua", 10);
        pokemon outroPokemonNome = new pokemon("Planta", 10);
        
        batalha batalha = new batalha(pokemon1.getVida(), pokemon2.getVida());
        
        vencedor = batalha.lute(pokemon1.getVida(), pokemon2.getVida());
        if(vencedor == 1) {
            System.out.println("O " + pokemon1.getNome() + " venceu.");
        }
        else {
            System.out.println("O " + pokemon2.getNome() + " venceu.");
            
            public int lute(int meuPokemonHP, int outroPokemonHP) {
        int vencedor;
        if(meuPokemonHP > outroPokemonHP) {
            vencedor = 1;
        }
        else {
            vencedor = 2;
        }
        return vencedor;
    }
    
        }
    }
    
}
