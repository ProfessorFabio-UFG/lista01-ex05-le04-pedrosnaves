import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Moradores m1 = new Moradores("Claudio", "70864285744", "62995874412", "12/10/1956", "masculino", "A", 102, 1565);
        Moradores m2 = new Moradores("Ramon", "40122587466", "62980521466", "14/03/1945", "masculino", "B", 903, 2548);
        Moradores m3 = new Moradores("Jorge", "00125863633", "62980566624", "10/11/1999", "masculino", "B", 801, 3305);
        Moradores m4 = new Moradores("Abadia", "85966410002", "62999568874", "20/12/1975", "feminino", "C", 505, 4023);
        Moradores m5 = new Moradores("Hilda", "11235684715", "62988451965", "19/09/1988", "feminino", "A", 302, 5900);

        Apartamento a1 = new Apartamento(101, 1, 85.0, "Quitado");

        a1.AdicionarMorador(m1);
        a1.AdicionarMorador(m2);
        a1.AdicionarMorador(m3);
        a1.AdicionarMorador(m4);
        a1.AdicionarMorador(m5);

        System.out.println(a1);
        }
    }
