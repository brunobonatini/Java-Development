import java.util.List;

public class GenericList {
    public static void main(String[] args) {

        // Exemplo sem Generics - Permite adicionar qualquer tipo de objeto
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        // Exemplo com Generics - Tipo String
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento)
        }

        // Iterandoo a lista sem Generics
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}