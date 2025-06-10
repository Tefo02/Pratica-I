
/**
 * @author user
 */
public class Horticultura {
    public static void main(String[] args) {
        Estufa estufa = new Estufa();
        System.out.println("Estado inicial da estufa:");
        System.out.println(estufa);
        System.out.println();

        System.out.println("Ajustando temperatura para 25°C:");
        int resultadoTemp = estufa.ajustarTemperatura(25.0f);
        System.out.println(resultadoTemp == 1 ? "Temperatura ajustada com sucesso." : "Erro: temperatura fora do limite.");
        System.out.println();

        System.out.println("Ajustando umidade para 85%:");
        int resultadoUmid = estufa.ajustarUmidade(85.0f);
        System.out.println(resultadoUmid == 1 ? "Umidade ajustada com sucesso." : "Erro: umidade fora do limite.");
        System.out.println();

        System.out.println("Tentando ajustar temperatura para 35°C:");
        resultadoTemp = estufa.ajustarTemperatura(35.0f);
        System.out.println(resultadoTemp == 1 ? "Temperatura ajustada com sucesso." : "Erro: temperatura fora do limite.");
        System.out.println();

        System.out.println("Tentando ajustar umidade para 50%:");
        resultadoUmid = estufa.ajustarUmidade(50.0f);
        System.out.println(resultadoUmid == 1 ? "Umidade ajustada com sucesso." : "Erro: umidade fora do limite.");
        System.out.println();

        System.out.println("Estado final da estufa:");
        System.out.println(estufa);
    }
}

