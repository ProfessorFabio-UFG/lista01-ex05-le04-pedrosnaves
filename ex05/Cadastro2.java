public class Moradores {

    private String nome;
    private String cpf;
    private String contato;
    private String data_nasc;
    private String sexo;
    private String bloco;
    private int apartamento;
    private int cod_acesso;


    public Moradores(String nome, String cpf, String contato, String data_nasc, String sexo, String bloco, int apartamento, int cod_acesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.cod_acesso = cod_acesso;

    }

    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nContato: " + contato +
                "\nData de Nascimento: " + data_nasc +
                "\nSexo: " + sexo +
                "\nBloco: " + bloco +
                "\nApartamento: " + apartamento +
                "\nCódigo de Acesso: " + cod_acesso +
                "\n-----------------------------";
    }
}
