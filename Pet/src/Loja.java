import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Loja extends Base {
    Scanner input = new Scanner(System.in);
    public int PK = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Date dateC;
    public Date dateV;

    // Construtores
    public Loja() {
        super();
    }

    // Getters & Setters
    public Date getDateC() {
        return dateC;
    }

    public Date setDateC(Date date) {
        return this.dateC = date;
    }

    public Date getDateV() {
        return dateC;
    }

    public Date setDateV(Date date) {
        return this.dateC = date;
    }

    public void Cadastrar_Cliente(Clientes c) {
        c = new Clientes();
        input.nextLine();
        System.out.print("Nome:");
        c.setNome(input.nextLine());
        System.out.print("CPF:");
        c.setCPF(input.nextLong());
        System.out.print("Telefone:");
        c.setTelefone(input.nextInt());
        Clientes.add(c);
    }

    public void ListarClientes() {
        for (Clientes c : Clientes) {
            System.out.println(c.getNome() + '/' + c.getCPF() + '/' + c.getTelefone());
        }
    }

    public void Cadastrar_Pet(Pets p) throws ParseException {
        p = new Pets();
        p.setPK(PK + 1);
        this.PK = p.getPK();
        input.nextLine();
        System.out.println("Nome:");
        p.setNome(input.next());
        System.out.println("Apelido:");
        p.setApelido(input.next());
        System.out.println("Sexo:");
        p.setSexo(input.next());
        System.out.println("Data de entrada:[DD/MM/AAAA] ");
        p.setData_entrada(setDateC(sdf.parse(input.next())));
        System.out.println(p.getData_entrada());
        System.out.println("Escolha o Tipo do Animal a ser Cadastrado:" +
                "\n1.1: Cão sem pelo\n1.2: Cão de Pelo raso\n1.3: Cão de pelo curto\n1.4: Cão de pelo semi-longo" +
                "\n2.1: Gato não domesticado\n2.2: Gato Domesticado" +
                "\n3.1: Passaro de asa cortada\n3.2: Passaro de asa não cortada");
        String choice = input.next();
        if (choice.equalsIgnoreCase("1.1")) {
            p.setTipos("Cão sem pelo");
        } else if (choice.equalsIgnoreCase("1.2")) {
            p.setTipos("Cão de pelo raso");
        } else if (choice.equalsIgnoreCase("1.3")) {
            p.setTipos("Cão de pelo curto");
        } else if (choice.equalsIgnoreCase("1.4")) {
            p.setTipos("Cão de pelo semi-longo");
        } else if (choice.equalsIgnoreCase("2.1")) {
            p.setTipos("Gato não domesticado");
        } else if (choice.equalsIgnoreCase("2.2")) {
            p.setTipos("Gato domesticado");
        } else if (choice.equalsIgnoreCase("3.1")) {
            p.setTipos("Passaro de asa cortada");
        } else if (choice.equalsIgnoreCase("3.2")) {
            p.setTipos("Passaro de asa não cortada");
        }
        System.out.println(p.getTipos());
        System.out.println("Idade:");
        p.setIdade(input.nextInt());
        System.out.println("Escolha o tipo da ração:" + "\n1: Ração premium\n2:Ração comum\n3:Ração Nutricional");
        String ração = input.next();
        if (ração.equalsIgnoreCase("1")) {
            p.setRação("Ração Premium");
        } else if (ração.equalsIgnoreCase("2")) {
            p.setRação("Ração Comum");
        } else if (ração.equalsIgnoreCase("3")) {
            p.setRação("Ração Nutricional");
        }
        System.out.println("Quantidade de ração em Gramas:");
        p.setQntd_ração(input.nextDouble());
        System.out.println("Peso em KG:");
        p.setPeso_Pet(input.nextDouble());
        p.setData_venda(setDateV(sdf.parse("00/00/0000")));
        Pets.add(p);
    }

    public void ListarPets() {
        for (Pets p : Pets) {
            p.PetsInfo(p);
        }
    }

    public void VenderPet(int id, long CPF) throws ParseException {
        for (Clientes c : Clientes) {
            if (c.getCPF() == CPF) {
                for (Pets p : Pets) {
                    if (p.getPK() == id) {
                        p.setCPF(CPF);
                        System.out.println("Confirmação de data de Venda [DD/MM/YYYY]");
                        p.setData_venda(setDateC(sdf.parse(input.next())));
                    }
                }
            }
        }
    }

    public void relaçãoMantimentos() {
        double RaçãoPremium = 0;
        double RaçãoComum = 0;
        double RaçãoNutricional = 0;
        for (Pets p : Pets) {
            if (p.getCPF() == 0 && p.getRação().equals("Ração Premium")) {
                RaçãoPremium = RaçãoPremium + p.getQntd_ração();
            } else if (p.getCPF() == 0 && p.getRação().equals("Ração Comum")) {
                RaçãoComum = RaçãoComum + p.getQntd_ração();
            } else if (p.getCPF() == 0 && p.getRação().equals("Ração Nutricional")) {
                RaçãoNutricional = RaçãoNutricional + p.getQntd_ração();
            }
        }
        System.out.println(
                "Quantidade de mantimentos para Ração Premium: " + RaçãoPremium
                        + "\nQuantidade de mantimentos para Ração Comum:" + RaçãoComum
                        + "\nQuantidade de mantimentos para Ração Nutricional:" + RaçãoNutricional);
    }
}
