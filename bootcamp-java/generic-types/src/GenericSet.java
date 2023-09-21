import java.util.List;

public class GenericSet {
    public static void main(String[] args) {

        // Exemplo sem Generics - Permite adicionar qualquer tipo de objeto
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        // Exemplo com Generics - Tipo String
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        // Iterando o conjunto com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento)
        }

        // Iterandoo a lista sem Generics
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}