package Ex1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1 ou 2");
        int opcao = in.nextInt();
        in.nextLine();

        if (opcao == 1) {
            System.out.println("Nome:");
            String nome = in.nextLine();
            System.out.println("Texto:");
            String texto = in.nextLine();
            System.out.println("Título");
            String titulo = in.nextLine();
            System.out.println("Ficheiro:");
            String ficheiro = in.nextLine();

            Dados dados = new Dados(nome, texto, titulo);

            try {
                FileOutputStream fileOut = new FileOutputStream(ficheiro + ".dat");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(dados);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                System.out.println("Erro a salvar");
            }
        } else if (opcao == 2) {
            System.out.println("Ficheiro:");
            String ficheiro = in.nextLine();
            try {
                FileInputStream fileIn = new FileInputStream(ficheiro + ".dat");
                ObjectInputStream nin = new ObjectInputStream(fileIn);
                Dados loadDados = (Dados) nin.readObject();
                nin.close();
                fileIn.close();
                System.out.println(loadDados);
            } catch (IOException e) {
                System.out.println("Erro a ler");
            } catch (ClassNotFoundException e) {
                System.out.println("Não foi possível converter");
            }
        }
    }
}
