import java.util.ArrayList;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        ArrayList<Cooperado> folha = new ArrayList<>();

        folha.add(new Cooperado("Ana", "01", 300.00));
        folha.add(new Peconheiro("Bia", "02", 300.00, 12));
        folha.add(new Batedor("Rita", "03", 300.00, 50.0));

        double total = 0;

        for (Cooperado c : folha) {
            c.exibirResumo();
            total += c.calcularPagamento();
        }

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Total da folha: R$ %.2f%n", total);
    }
}