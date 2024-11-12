public class Main {
    public static void main(String[] args) {
        Double rendimentoSP = 67836.43;
        Double rendimentoRJ = 36678.66;
        Double rendimentoMG = 29229.88;
        Double rendimentoES = 27165.48;
        Double rendimentoOutros = 19849.53;

        Double rendimentoTotal = rendimentoSP + rendimentoRJ + rendimentoMG
                + rendimentoES + rendimentoOutros;

        System.out.println("A porcentagem do rendimento em SP é de: " + calcularPorcentagem(rendimentoTotal, rendimentoSP));
        System.out.println("A porcentagem do rendimento em RJ é de: " + calcularPorcentagem(rendimentoTotal, rendimentoRJ));
        System.out.println("A porcentagem do rendimento em MG é de: " + calcularPorcentagem(rendimentoTotal, rendimentoMG));
        System.out.println("A porcentagem do rendimento em ES é de: " + calcularPorcentagem(rendimentoTotal, rendimentoES));
        System.out.println("A porcentagem do rendimento nos outros estados é de: " + calcularPorcentagem(rendimentoTotal, rendimentoOutros));
    }

    public static float calcularPorcentagem(double total, double rendimento) {
        float porcentagem = (float) ((rendimento * 100)/total);

        return porcentagem;
    }
}