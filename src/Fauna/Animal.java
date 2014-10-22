package Fauna;

/**
 * Created by alunos5 on 14/10/14.
 */
public class Animal {

    private String nome;
    private String cor;
    private Double peso;

    public void comer(){
        System.out.println("Humm estou comendo!");
    }

    public void dormir(){
        System.out.println("ZZZZ");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
