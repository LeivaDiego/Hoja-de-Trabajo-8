import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
class PriorityManagerTest {

    @Test
    void testOrdenarPorVectorHeap() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");

        // Ordenar los procesos utilizando VectorHeap
        List<Process> procesosOrdenados = PriorityManager.sortByVectorHeap(procesos);

        // Verificar que la lista de procesos ordenados no esté vacía
        assertNotNull(procesosOrdenados);
        assertEquals(4, procesosOrdenados.size());

        // Verificar el orden correcto de los procesos
        assertEquals("ls", procesosOrdenados.get(0).getName());
        assertEquals("vi", procesosOrdenados.get(1).getName());
        assertEquals("firefox", procesosOrdenados.get(2).getName());
        assertEquals("cat", procesosOrdenados.get(3).getName());
    }

    @Test
    void testOrdenarPorJCF() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");

        // Ordenar los procesos utilizando VectorHeap
        List<Process> procesosOrdenados = PriorityManager.sortByPriorityQueueJCF(procesos);

        // Verificar que la lista de procesos ordenados no esté vacía
        assertNotNull(procesosOrdenados);
        assertEquals(4, procesosOrdenados.size());

        // Verificar el orden correcto de los procesos
        assertEquals("ls", procesosOrdenados.get(0).getName());
        assertEquals("vi", procesosOrdenados.get(1).getName());
        assertEquals("firefox", procesosOrdenados.get(2).getName());
        assertEquals("cat", procesosOrdenados.get(3).getName());
    }


}