import java.util.Scanner;

public class App {
    public static void menu() {
        System.out.println("---------------------------------------"
                + "\n[1]Cadastrar novo cliente"
                + "\n[2]Listar Clientes"
                + "\n[3]Cadastrar novo pet"
                + "\n[4]Listar Pets"
                + "\n[5]Realizar venda"
                + "\n[6]Relatorio de provisões"
                + "\n[0]Para encerrar o programa");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Clientes c = new Clientes();
        Pets p = new Pets();
        Loja l = new Loja();

        while (true) {
            menu();
            int opção = input.nextInt();
            if (opção == 1) {
                l.Cadastrar_Cliente(c);
            } else if (opção == 2) {
                l.ListarClientes();
            } else if (opção == 3) {
                l.Cadastrar_Pet(p);
            } else if (opção == 4) {
                l.ListarPets();
            } else if (opção == 5) {
                System.out.print("Digite o id do pet: ");
                int id = input.nextInt();
                System.out.print("Digite o CPF do cliente: ");
                long cpf = input.nextLong();
                l.VenderPet(id, cpf);
            } else if (opção == 6) {
                l.relaçãoMantimentos();
            } else if (opção == 0) {
                break;
            }
        }
    }
}