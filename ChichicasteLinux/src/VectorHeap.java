import java.util.ArrayList;
import java.util.List;

/**
 * La clase VectorHeap implementa una cola de prioridad utilizando un vector y la interfaz IPriorityQueue
 * Basado en un Heap
 * REFERENCIA: http://www.cs.williams.edu/~jeannie/cs136/javadoc/structure5/structure5/VectorHeap.html
 *
 * @author diego leiva, pablo orellana
 * 
 * @param <E> el tipo de elementos almacenados en el heap, que deben ser comparables
 */
public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private List<E> data;

    /**
     * Constructor para la clase VectorHeap
     * Inicializa una nueva instancia de VectorHeap vacia
     */
    public VectorHeap() {
        data = new ArrayList<>();
    }

    /**
     * Inserta un nuevo elemento en el heap
     * El heap se reorganiza para mantener la propiedad del heap
     * @param value el elemento a insertar en el heap
     */
    @Override
    public void insert(E value) {
        data.add(value);
        int index = data.size() - 1;
        while (index > 0 && data.get(index).compareTo(data.get((index - 1) / 2)) < 0) {
            E temp = data.get(index);
            data.set(index, data.get((index - 1) / 2));
            data.set((index - 1) / 2, temp);
            index = (index - 1) / 2;
        }
    }

    /**
     * Obtiene el elemento con la prioridad mas alta (el menor elemento) del heap sin eliminarlo
     * @return el elemento con la prioridad mas alta
     */
    @Override
    public E get() {
        return data.get(0);
    }

    /**
     * Elimina y devuelve el elemento con la prioridad mas alta (el menor elemento) del heap
     * @return el elemento con la prioridad mas alta
     */
    @Override
    public E remove() {
        E result = data.get(0);
        E last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            int index = 0;
            boolean done = false;
            while (!done) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int min = left;

                if (right < data.size() && data.get(right).compareTo(data.get(left)) < 0) {
                    min = right;
                }

                if (left < data.size() && data.get(min).compareTo(data.get(index)) < 0) {
                    E temp = data.get(index);
                    data.set(index, data.get(min));
                    data.set(min, temp);
                    index = min;
                } else {
                    done = true;
                }
            }
        }
        return result;
    }

    /**
     * Devuelve la cantidad de elementos en el heap
     * @return la cantidad de elementos en el heap
     */
    @Override
    public int count() {
        return data.size();
    }

    /**
     * Verifica si el heap esta vacio
     * @return verdadero si el heap esta vacio, falso en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}

