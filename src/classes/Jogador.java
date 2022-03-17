
package classes;

/**
 *
 * @author Priscila Butzke
 */
public class Jogador {
    
    private String nome;
    private String posicao;
    private String dia;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    

    public Jogador(){
    }    
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int dataNasimento) {
        this.anoNascimento = dataNasimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
        
    
    public int calcIdade(){
        return (2022 - anoNascimento);
        
    }
    
    public String aposentar(){   
      
     
       if (posicao.equals("defesa") && calcIdade() < 40){
            return  +(40 - calcIdade())+ " anos para se aposentar.";
       }else if (posicao.equals("meio-Campo")&& calcIdade() < 38){
            return  +(38 -calcIdade())+ " anos para se aposentar.";
       }else {
            return +(35 - calcIdade() )+ " anos para se aposentar.";
       }
       
    } 
    
    public String toString(){
        return " Nome: " + nome +
        " \nPosição: " + posicao +
        " \nData de Nascimento: " + dia+ "/" + anoNascimento +
        "\nNacionalidade: " + nacionalidade +
        "nAltura: " + altura +
        "\n Peso: " + peso + 
        "\nTempo para aposentadoria: " + aposentar();
    }
}
 
