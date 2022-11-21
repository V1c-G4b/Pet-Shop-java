import java.text.SimpleDateFormat;
import java.util.Date;

public class Pets extends Base {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    private int PK;
    private String nome;
    private String apelido;
    private String sexo;
    private Date data_entrada;
    private int idade;
    private String ração;
    private double qntd_ração;
    private double peso_Pet;
    private Date data_venda;
    private String tipos;
    private long CPF;

    public Pets() {
    }

    public Pets(int pK, String nome, String apelido, String sexo, Date data_entrada, int idade, String ração,
            double qntd_ração, double peso_Pet, Date data_venda, String tipos, long CPF) {
        super();

        PK = pK;
        this.CPF = CPF;
        this.nome = nome;
        this.apelido = apelido;
        this.sexo = sexo;
        this.data_entrada = data_entrada;
        this.tipos = tipos;
        this.idade = idade;
        this.ração = ração;
        this.qntd_ração = qntd_ração;
        this.peso_Pet = peso_Pet;
        this.data_venda = data_venda;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long cPF) {
        CPF = cPF;
    }

    public int getPK() {
        return PK;
    }

    public void setPK(int pK) {
        PK = pK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRação() {
        return ração;
    }

    public void setRação(String ração) {
        this.ração = ração;
    }

    public double getQntd_ração() {
        return qntd_ração;
    }

    public void setQntd_ração(double qntd_ração) {
        this.qntd_ração = qntd_ração;
    }

    public double getPeso_Pet() {
        return peso_Pet;
    }

    public void setPeso_Pet(double peso_Pet) {
        this.peso_Pet = peso_Pet;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void PetsInfo(Pets p) {
        System.out.println(
                "ID" + p.getPK() + "\nNome:" + p.getNome() + "\nApelido:" + p.getApelido() + "\nSexo:" + p.getSexo() +
                        "\nData De Entrada:" + formato.format(p.getData_entrada()) + "\nIdade:" + p.getIdade() +
                        "\nRação:" + p.getRação() + "\nQuantidade de ração:" + p.getQntd_ração() + "G" +
                        "Peso:" + p.getPeso_Pet() + "KG" + "\nData Venda:" + formato.format(p.getData_venda()) + "\nCPF"
                        + p.getCPF());
    }

}
