
package Simuladorpokemon;


public class Pokemon {
    
    private String nome;
    private String tipo;
    private Integer level;
    private Integer vida;
    private Integer ataque;
    private Integer defesa;

   
    
    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    //TIPO
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    //LEVEL
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }

    //VIDA
    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

   // ATAQUE
    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

   
    // DEFESA
    public Integer getDefesa() {
        return defesa;
    }


    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }
    
    //metodo
     public String calcularAtributos(Pokemon p){
        
        
        if ( Fogo()>=5)
           System.out.println("Aluno Reprovado");
        else
           System.out.println("Aluno Reprovado");
        
     
      }
}
  
    
    
  
