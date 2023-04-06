
package simuladorpokemon;


public class batalha {
    
 public static void main(String[] args) {
    
 }
    
  
    private Integer meuPokemonHP;
    private Integer outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;
   

    
    public Integer getMeuPokemonHP() {
        return meuPokemonHP;
    }
    public void setMeuPokemonHP(Integer meuPokemonHP) {
        this.meuPokemonHP = meuPokemonHP;
    }

   
    
    
    public Integer getOutroPokemonHP() {
        return outroPokemonHP;
    }
    public void setOutroPokemonHP(Integer outroPokemonHP) {
        this.outroPokemonHP = outroPokemonHP;
    }

    
    
    public String getMeuPokemonNome() {
        return meuPokemonNome;
    }
    public void setMeuPokemonNome(String meuPokemonNome) {
        this.meuPokemonNome = meuPokemonNome;
    }

   
    
    public String getOutroPokemonNome() {
        return outroPokemonNome;
    }
    public void setOutroPokemonNome(String outroPokemonNome) {
        this.outroPokemonNome = outroPokemonNome;
    }

    
    //Classe Batalhas: deverá ter o algoritmo para criação das batalhas e para definir quem são os pokémons participantes (seu e do adversário) 
    
      public int Batalha(int meuPokemonHP, int outroPokemonHP) {
        this.meuPokemonHP = meuPokemonHP;
        this.outroPokemonHP = outroPokemonHP;
    
      }
      
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
    //O método startBattle() deverá imprimir no console um primeiro aviso/mensagem que a batalha irá começar.
    //Dentro do método será avaliado se o atributo "meuPokemonVida" é maior do que o atributo "outroPokemonVida".
    //Caso for maior, o seu pokémon escolhido foi o vitorioso,
    //caso contrário, o pokémon vitorioso será o adversário (outro pokémon). FAZER
    
    public void startBatlle() {
        System.out.println(" Comece a batalha");
    }
//Com relação aos métodos meuPokemon() e outroPokemon(), serão recebidos como parâmetro, o nome e a vida dos pokemons
//envolvidos na batalha para que seja possível atribuir os valores aos atributos existentes na classe Batalha.  ARRUMAR DUVIDAS
                   
}



    
