import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String archivo = "procesos.txt";
        List<Process> processes;

        try {
            processes = ProcessReader.leerProcesos(archivo);
        } catch (IOException e) {
            View.Error("No se pudo leer el archivo de procesos: " + e.getMessage());
            return;
        }
        View.Menu();

        for (Process process: PriorityManager.orderByPriority(processes)){
            View.ShowMessage(process.toString());
        }

    }
}