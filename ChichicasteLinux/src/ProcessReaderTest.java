import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProcessReaderTest {

    @Test
    void testProcessesNotEmpty() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");

        // Verificar que la lista de procesos no esté vacía
        assertNotNull(procesos);
        assertEquals(4, procesos.size());
    }

    @Test
    void testLeerProcesos1() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");
        // Verificar el contenido de los procesos
        assertEquals("vi", procesos.get(0).getName());
        assertEquals("juan02", procesos.get(0).getUser());
        assertEquals(0, procesos.get(0).getNice());
    }

    @Test
    void testLeerProcesos2() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");
        assertEquals("ls", procesos.get(1).getName());
        assertEquals("maria30", procesos.get(1).getUser());
        assertEquals(-20, procesos.get(1).getNice());
    }

    @Test
    void testLeerProcesos3() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");
        assertEquals("firefox", procesos.get(2).getName());
        assertEquals("rosa20", procesos.get(2).getUser());
        assertEquals(5, procesos.get(2).getNice());
    }
    @Test
    void testLeerProcesos4() throws IOException {
        // Leer procesos desde el archivo de prueba
        List<Process> procesos = ProcessReader.leerProcesos("procesos.txt");
        assertEquals("cat", procesos.get(3).getName());
        assertEquals("juan02", procesos.get(3).getUser());
        assertEquals(5, procesos.get(3).getNice());
    }
}
