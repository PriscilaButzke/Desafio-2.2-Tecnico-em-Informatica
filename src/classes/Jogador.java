
package classes;

import java.util.Calendar;

/**
 *
 * @author User
 */
public class Jogador {
    
    
    
    private String nome;
    private String posicao;
    //private String meio;
    //private String ataque;
    private int dia;
    private int mes;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    
    public Jogador(){
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
        this.posicao = posicao.toUpperCase();
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
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);
        return (anoAtual - anoNascimento);
    }
    
    public int calAposentar(){
       int idadeAp = 0;
     
       if (posicao.equals("DEFESA")){
            idadeAp = (40 - calcIdade());
       }else if (posicao.equals("MEIO-CAMPO")){
            idadeAp = (38 -calcIdade());
       }else {
            posicao.equals("ATACANTE");
            idadeAp =  (35 - calcIdade());
       }
       return idadeAp;
       
    } 
    
    public String toString(){
        
        String resp = "";
                
        resp =  " Nome: " + nome 
                +" \n Data de Nascimento: " + dia+ "/" +mes +"/"+ anoNascimento 
                +"\n Nacionalidade: " + nacionalidade 
                +"\n Altura: " + this.altura 
                +"\n Peso: " + this.peso  
                +"\n Você ainda precisa trabalhar " + calAposentar() 
                +"\n anos para se aposentar.";
                
        return resp;        
    }
        
}
