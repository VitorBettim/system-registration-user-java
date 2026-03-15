import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        while (true){
            
            System.out.println("\n======= SISTEMA DE CADASTRO =======");
            System.out.println("1- Cadastrar usuário");
            System.out.println("2- Listar usuários");
            System.out.println("3- Buscar usuário");
            System.out.println("4- Remover usuário");
            System.out.println("5- Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Email: ");
                    String email = sc.nextLine();

                    Usuario usuario = new Usuario(id, nome, email);
                    sistema.cadastrarUsuario(usuario);

                    System.out.println("Usuário cadastrado com sucesso");
                    break;

                case 2:
                    sistema.listarUsuario();
                    break;

                case 3:
                    System.out.println("Digite o ID do usuário: ");
                    int idBuscar = sc.nextInt();

                    Usuario encontrado = sistema.buscarUsuario(idBuscar);
                    if (encontrado != null) {
                        System.out.println("ID: " + encontrado.getId());
                        System.out.println("Nome: " + encontrado.getNome());
                        System.out.println("Email: " + encontrado.getEmail());
                    }else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do usuário para remover: ");
                    int idRemover = sc.nextInt();
                    sistema.removerUsuario(idRemover);
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    
            }
        }
    }
}
