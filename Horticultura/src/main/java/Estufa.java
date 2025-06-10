/*
* @author Stefano Lopes Delgado
*/

public class Estufa {
    // Limites de referência (exemplo: para alface)
    private float TEMP_MIN = 15.0f;
    private float TEMP_MAX = 28.0f;
    private float UMID_MIN = 60.0f;
    private float UMID_MAX = 90.0f;

    private float temperatura;
    private float umidade;

    public Estufa() {
        temperatura = 22.0f; // valor inicial aceitável
        umidade = 75.0f;     // valor inicial aceitável
    }

    public int ajustarTemperatura(float novaTemperatura) {
        if (novaTemperatura >= TEMP_MIN && novaTemperatura <= TEMP_MAX) {
            temperatura = novaTemperatura;
            return 1;
        }
        return -1;
    }

    public int ajustarUmidade(float novaUmidade) {
        if (novaUmidade >= UMID_MIN && novaUmidade <= UMID_MAX) {
            umidade = novaUmidade;
            return 1;
        }
        return -1;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    @Override
    public String toString() {
        return "Estufa: {\n" +
               "\tTemperatura atual: " + temperatura + "°C\n" +
               "\tUmidade atual: " + umidade + "%\n" +
               "}";
    }
}
