package Simuladorpokemon;


public class PokemonSimuladorV1 {
     public static void main(String[] args) {
       
      Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 10);
      Pokemon charmander = new Pokemon("Charmander", "Fogo", 8);
      Pokemon squirtle = new Pokemon("Squirtle", "Água", 7);
      
      Batalha batalha1 = new Batalha(pikachu, charmander);
      Batalha batalha2 = new Batalha(squirtle, pikachu);

    System.out.println("Resultado da Batalha 1: " + batalha1.simularBatalha());
    System.out.println("Resultado da Batalha 2: " + batalha2.simularBatalha());
}
     }
