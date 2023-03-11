import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set frutas = new HashSet();
        frutas.add("manzana");
        frutas.add("platano");
        frutas.add("limon");
        frutas.add("manzana");

        System.out.println(frutas);
        //System.out.println("Tenemos limon? " + frutas.contains("limon"));

        frutas.remove("limon");
        System.out.println("Cuantas frutas tenemos despues de haber quitado el limon: " + frutas.size());

        frutas.addAll(Arrays.asList("guayaba", "pera"));
        frutas.add("coco");
        System.out.println(frutas);

    }
}
