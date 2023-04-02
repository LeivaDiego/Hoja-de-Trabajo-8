/**
 * Interfaz IPriorityQueue que define los metodos basicos para una cola de prioridad
 * REFERENCIA: Variacion de Ejemplos de malonsoUVG
 *
 * @author diego leiva, pablo orellana
 *
 * @param <V> el tipo de elementos almacenados en la cola de prioridad, que deben ser comparables
 */
public interface IPriorityQueue<V> {

    /**
     * Inserta un nuevo elemento en la cola de prioridad
     * @param value el elemento a insertar en la cola de prioridad
     */
    void insert(V value);

    /**
     * Obtiene el elemento con la prioridad mas alta (el menor elemento) de la cola de prioridad sin eliminarlo
     * @return el elemento con la prioridad mas alta
     */
    V get();

    /**
     * Elimina y devuelve el elemento con la prioridad mas alta (el menor elemento) de la cola de prioridad
     * @return el elemento con la prioridad mas alta
     */
    V remove();

    /**
     * Devuelve la cantidad de elementos en la cola de prioridad
     * @return la cantidad de elementos en la cola de prioridad
     */
    int count();

    /**
     * Verifica si la cola de prioridad esta vacia
     * @return verdadero si la cola de prioridad esta vacia, falso en caso contrario
     */
    boolean isEmpty();
}
