public class Condicional {
    public static void main(String[] args) {
        int ano = 2017;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2017) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado! Divirta-se.");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
