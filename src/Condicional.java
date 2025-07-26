public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPLano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022)
        {
            System.out.println("Lançamento que os clientes estão cuirtindo!!");
        }
        else
        {
            System.out.println("Filme retrô que vale a pena assistir!!");
        }

        if(incluidoNoPLano && tipoPlano.equals("plus"))
        {
            System.out.println("Filme liberado");
        }
        else
        {
            System.out.println("Deve entrar na assinatura");
        }
    }
}
