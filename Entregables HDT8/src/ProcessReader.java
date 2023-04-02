import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ProcessReader que se encarga de leer el archivo de texto y obtener todos los procesos contenidos en este
 * Convierte cada linea del archivo en un objeto Process
 *
 * @author diego leiva, pablo orellana
 */
public class ProcessReader {

    /**
     * Lee el archivo de texto especificado y devuelve una lista de objetos Process
     * @param file el nombre del archivo de texto que contiene la informacion de los procesos
     * @return una lista de objetos Process obtenidos del archivo
     * @throws IOException si ocurre un error al leer el archivo
     */
    public static List<Process> getProcesses(String file) throws IOException {
        List<Process> processes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] slpitted = linea.split(",");
                String name = slpitted[0];
                String user = slpitted[1];
                int nice = Integer.parseInt(slpitted[2]);
                processes.add(new Process(name, user, nice));
            }
        }
        return processes;
    }
}