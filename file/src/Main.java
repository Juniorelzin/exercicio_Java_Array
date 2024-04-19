import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            String nome = JOptionPane.showInputDialog("Nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));

            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
        }
        String mostrar = "";

        for (int i = 0; i < pessoas.size(); i++) {

            System.out.println("Pessoa "+ (i+1) + " Nome: " + pessoas.get(i).getNome() +" - " + " Idade: " + pessoas.get(i).getIdade());
            mostrar += ("Pessoa "+ (i+1) + " Nome: " + pessoas.get(i).getNome() +" - " + " Idade: " + pessoas.get(i).getIdade()+"\n");
        }

        JOptionPane.showMessageDialog(null,mostrar);
    }
}