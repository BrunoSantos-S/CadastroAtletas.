import java.util.Scanner;

public class CadastroAtletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            // Pegar os dados do atleta
            System.out.print("Nome do atleta: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do atleta: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            // Determina a categoria
            String categoria;
            if (idade <= 10) {
                categoria = "Infantil";
            } else if (idade <= 15) {
                categoria = "Juvenil";
            } else if (idade <= 19) {
                categoria = "Júnior";
            } else if (idade <= 40) {
                categoria = "Adulto";
            } else {
                categoria = "Master";
            }

            // Mostra as informações do atleta
            System.out.println("\nAtleta cadastrado:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: " + categoria);

            // Pergunta se deseja cadastrar um novo atleta
            System.out.print("\nDeseja cadastrar um novo atleta? (s/n): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("\nCadastro finalizado.");
    }
}
