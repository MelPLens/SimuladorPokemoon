
package simuladorpokemon;


public class pokemon {

   
    public static void main(String[] args) {
    }
    // Classe Pokémon: deverá ter o algoritmo para criação de pokémon bem como a vida, defesa e etc.
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    
    // CONSTRUTOR 
    //No método construtor da classe Pokémon deverá ser recebido como parâmetro o nome, 
    //tipo e level do pokémon para atribuição aos respectivos atributos da classe 
    //e também deverá ser utilizado os métodos calculaAtributos() e CalculaBonus(). 
    //Nesse mesmo método também será atribuído ao atributo "vida" de qualquer pokémon, o valor inicial de 1000.
    
    public pokemon(String nome,String tipo, int level) {
        this.tipo = tipo;
        this.nome = nome;
        this.level = level;
        calculaAtributos();// arrumar metodos
        calculaBonus();
        imprimepokemon();
        
    }
    
    
    // MÉTODOS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
     //No método imprimirPokemon(), deverá ser exibido em uma caixa de diálogo os valores correspondentes aos atributos
    //(mostrar o valor acompanhado do nome do atributo): nome, tipo, level, vida, ataque e defesa.
    public void imprimepokemon() {
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | "
        );
    }
    
    //Nesse mesmo método também será atribuído ao atributo "vida" de qualquer pokémon, o valor inicial de 1000.
    //O método CalculaAtributos() terá com objetivo de calcular a vida, ataque e defesa do pokémon, considerando o seu tipo:

    //Caso o tipo seja "Fogo", o atributo vida deverá ser reduzido em 80 níveis/pontos, o ataque deverá ter o valor 75 e a defesa terá o valor 10.
    //Caso o tipo seja "Água", o atributo vida deverá ser reduzido em 50 níveis/pontos, o ataque deverá ter o valor 65 e a defesa terá o valor 50.

    //Caso o tipo seja "Planta", o atributo vida deverá ser aumentado em 40 níveis/pontos, o ataque deverá ter o valor 25 e a defesa terá o valor 30.
   //Caso o tipo seja "Pedra", o atributo vida deverá ser aumentado em 10 níveis/pontos, o ataque deverá ter o valor 45 e a defesa terá o valor 80.
    
    public void calculaAtributos() { // arrumar * duvidas
        switch(this.tipo) {
            case "Fogo":
                this.vida = 1000;
                this.ataque = 40;
                this.defesa = 30;
            break;
            
            case "Agua":
                this.vida = 1000;
                this.ataque = 25;
                this.defesa = 30;
            break;
            
            case "Planta":
                this.vida = 1000;
                this.ataque = 20;
                this.defesa = 40;
            break;
            
            case "Voador":
                this.vida = 1000;
                this.ataque = 45;
                this.defesa = 30;
            break;
            
            case "Eletrico":
                this.vida = 1000;
                this.ataque = 70;
                this.defesa = 30;
            break;
        }
    }
    
//No método calcularBonus() deverá ser realizado os seguintes cálculos:
//O atributo vida será incrementado com a 1/4 do valor existente no atributo level.
//O atributo ataque será incrementado com 1/2 do valor existente no atributo level.
//O atributo defesa será incrementado com 1/3 do valor existente no atributo level.
    public void calculaBonus() {
        vida = vida + (level / 4);
        ataque = ataque + (level / 2);
        defesa = defesa + (level / 3);
    }
    
}
    

    
    

