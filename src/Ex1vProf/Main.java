package Ex1vProf;

import java.io.*;
import java.util.Scanner;

public class Main {

    public void  inicio() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Novo dado");
        System.out.println("2 - Mostrar dados");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine();
        if(opcao==1){
            pedirDados(scanner);
        }else if(opcao==2){
            carregarDados(scanner);
        }
    }

    private void pedirDados(Scanner scanner){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Texto: ");
        String texto = scanner.nextLine();
        System.out.println("Título: ");
        String titulo = scanner.nextLine();
        System.out.println("Ficheiro: ");
        String ficheiro = scanner.nextLine();
        scanner.close();

        Documento documento = new Documento(nome, texto, titulo);

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficheiro));
            out.writeObject(documento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarDados(Scanner scanner){
        System.out.println("Ficheiro");
        String file = scanner.nextLine();

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            Documento documento = (Documento) in.readObject();
            System.out.println(documento);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().inicio();
    }
}
