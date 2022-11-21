public class Clientes extends Base {
    private long CPF;
    private String nome;
    private int Telefone;

    public Clientes() {

    }

    public Clientes(long CPF, String nome, int Telefone) {
        super();
        this.nome = nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long cPF) {
        CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }
}
