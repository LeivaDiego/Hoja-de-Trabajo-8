import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VectorHeapTest {

    @Test
    public void testIsEmpty() {
        VectorHeap<Integer> vectorHeap = new VectorHeap<>();

        // Verificar que el heap esté vacío al inicio
        assertTrue(vectorHeap.isEmpty());
    }

    @Test
    public void testInsertion() {
        VectorHeap<Integer> vectorHeap = new VectorHeap<>();

        // Insertar datos
        vectorHeap.insert(3);
        vectorHeap.insert(1);
        vectorHeap.insert(4);
        vectorHeap.insert(2);

        // Verificar que el heap no esté vacío después de las inserciones
        assertFalse(vectorHeap.isEmpty());
    }

    @Test
    public void testRemoval(){
        VectorHeap<Integer> vectorHeap = new VectorHeap<>();
        // Insertar datos
        vectorHeap.insert(3);
        vectorHeap.insert(1);
        vectorHeap.insert(4);
        vectorHeap.insert(2);

        // Verificar que los elementos se eliminen en el orden correcto
        assertEquals(Integer.valueOf(1), vectorHeap.remove());
        assertEquals(Integer.valueOf(2), vectorHeap.remove());
        assertEquals(Integer.valueOf(3), vectorHeap.remove());
        assertEquals(Integer.valueOf(4), vectorHeap.remove());

        // Verificar que el heap esté vacío después de eliminar todos los elementos
        assertTrue(vectorHeap.isEmpty());
    }
}

