import java.util.List;

public class GenericMap {
    public static void main(String[] args) {

        // Exemplo sem Generics - Permite adicionar qualquer tipo de objeto
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "valor");

        // Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        // Iterando sobre o mapa com Generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Cheve: " + chave + ", Valor: " + valor);
        }

        // Iterando sobre o mapa sem Generics (necesário fazer cast)
        for (Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

    }
}