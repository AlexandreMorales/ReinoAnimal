package Fauna;

/**
 * Created by alunos5 on 14/10/14.
 */
public class Gato extends Animal {

    public static void main(String[] args) {

        Gato leroy = new Gato();

        leroy.setCor("Verde");

        String corDoGato;

        corDoGato = leroy.getCor();

        System.out.println("A cor do maldito gato é igual a = " + corDoGato);

        leroy.comer();

    }
}
