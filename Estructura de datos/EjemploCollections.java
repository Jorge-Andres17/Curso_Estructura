import java.util.*;
import java.util.stream.Collectors;

public class EjemploCollections {

    public static void main(String[] args) {

        // ================================
        // 1️⃣ LIST (ArrayList)
        // ================================

        List<String> lista = new ArrayList<>();

        // add() → Agrega un elemento
        lista.add("Juan");
        lista.add("Ana");
        lista.add("Carlos");
        System.out.println("Lista después de add(): " + lista);

        // get() → Obtiene elemento por índice
        System.out.println("Elemento en posición 1: " + lista.get(1));

        // set() → Reemplaza elemento
        lista.set(1, "María");
        System.out.println("Lista después de set(): " + lista);

        // remove() → Elimina por índice
        lista.remove(0);
        System.out.println("Lista después de remove(): " + lista);

        // contains() → Verifica si existe
        System.out.println("¿Contiene Carlos? " + lista.contains("Carlos"));

        // size() → Tamaño
        System.out.println("Tamaño: " + lista.size());

        // sort() → Ordena la lista
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // forEach() → Recorre la lista
        System.out.println("Recorrido con forEach:");
        lista.forEach(nombre -> System.out.println(nombre));

        // ================================
        // 2️⃣ SET (HashSet)
        // ================================

        Set<Integer> conjunto = new HashSet<>();

        // add() → No permite duplicados
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(10); // No se agrega
        System.out.println("Set (sin duplicados): " + conjunto);

        // remove() → Elimina elemento
        conjunto.remove(20);
        System.out.println("Set después de remove(): " + conjunto);

        // ================================
        // 3️⃣ MAP (HashMap)
        // ================================

        Map<String, Integer> mapa = new HashMap<>();

        // put() → Agrega clave-valor
        mapa.put("Juan", 25);
        mapa.put("Ana", 30);
        System.out.println("Mapa: " + mapa);

        // get() → Obtiene valor por clave
        System.out.println("Edad de Juan: " + mapa.get("Juan"));

        // containsKey() → Verifica clave
        System.out.println("¿Existe Ana? " + mapa.containsKey("Ana"));

        // remove() → Elimina por clave
        mapa.remove("Ana");
        System.out.println("Mapa después de remove(): " + mapa);

        // keySet() → Devuelve claves
        System.out.println("Claves: " + mapa.keySet());

        // values() → Devuelve valores
        System.out.println("Valores: " + mapa.values());

        // ================================
        // 4️⃣ STREAMS
        // ================================

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // filter() → Filtra números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares (filter): " + pares);

        // map() → Multiplica por 2
        List<Integer> dobles = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Números multiplicados por 2 (map): " + dobles);

        // count() → Cuenta elementos
        long cantidad = numeros.stream().count();
        System.out.println("Cantidad de elementos (count): " + cantidad);

        // reduce() → Suma todos los números
        int suma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma total (reduce): " + suma);

        // anyMatch() → Verifica si existe un número mayor que 5
        boolean existeMayor = numeros.stream()
                .anyMatch(n -> n > 5);
        System.out.println("¿Existe número mayor que 5? " + existeMayor);

        // ================================
        // 5️⃣ ITERATOR
        // ================================

        Iterator<String> iterator = lista.iterator();

        System.out.println("Recorrido con Iterator:");
        while (iterator.hasNext()) {
            String nombre = iterator.next(); // next() → Devuelve siguiente
            System.out.println(nombre);
        }

        // ================================
        // 6️⃣ MÉTODOS DE COLLECTIONS
        // ================================

        List<Integer> numeros2 = new ArrayList<>(Arrays.asList(5, 3, 8, 1));

        // reverse() → Invierte orden
        Collections.reverse(numeros2);
        System.out.println("Lista invertida: " + numeros2);

        // min() → Devuelve mínimo
        System.out.println("Mínimo: " + Collections.min(numeros2));

        // max() → Devuelve máximo
        System.out.println("Máximo: " + Collections.max(numeros2));

        // shuffle() → Mezcla aleatoriamente
        Collections.shuffle(numeros2);
        System.out.println("Lista mezclada: " + numeros2);
    }
}