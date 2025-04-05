import java.util.ArrayList;
public class Apartamento {
    private int numero;
    private int andar;
    private double metragem;
    private String situacao;
    private ArrayList<Moradores> moradores;

    public Apartamento(int numero, int andar, double metragem, String situacao) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    public int getNumero() {
        return this.numero;
    }

    public void AdicionarMorador(Moradores morador) {
        this.moradores.add(morador);
    }

    public String toString() {
        String texto = "\nApartamento: " + numero +
                "\nAndar: " + andar +
                "\nMetragem: " + metragem + "m²" +
                "\nSituação: " + situacao +
                "\n----- Moradores -----";

        for (Moradores m : moradores) {
            texto += m.toString();
        }

        return texto;
    }

}

