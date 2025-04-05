public class Moradores {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private int apartamento;
    private int codAcesso;

    public Moradores(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, int apartamento, int codAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codAcesso = codAcesso;
    }

    public String toString() {
        return "\nNome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nCelular: " + this.celular +
                "\nData de nascimento: " + this.dataNascimento +
                "\nSexo: " + this.sexo +
                "\nBloco: " + this.bloco +
                "\nApartamento: " + this.apartamento +
                "\nCódigo de Acesso: " + this.codAcesso +
                "\n___________________\n";
    }
}
