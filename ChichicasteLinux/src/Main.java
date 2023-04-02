import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String archivo = "procesos.txt";
        List<Process> processes;

        try {
            processes = ProcessReader.getProcesses(archivo);
        } catch (IOException e) {
            View.Error("No se pudo leer el archivo de procesos: " + e.getMessage());
            return;
        }
        View.Menu();
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int option;

        do {
            flag = true;
            View.ShowMessage("Ingrese el número de la opción (1 o 2):\n");
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        View.ShowMessage("Procesos ordenados con el VectorHeap");
                        View.Separator();
                        for (Process process: PriorityManager.sortByVectorHeap(processes)){
                            View.ShowMessage(process.toString());
                        }
                        break;
                    case 2:
                        View.ShowMessage("Procesos ordenados con el JCF PriorityQueue");
                        View.Separator();
                        for (Process process: PriorityManager.sortByPriorityQueueJCF(processes)){
                            View.ShowMessage(process.toString());
                        }
                        break;
                    default:
                        View.Error("Opcion no valida");
                }
            } catch (NumberFormatException e){
                View.Error("Entrada inválida. Debe ingresar un número");
                flag = false;
            }
        } while (!flag);
    }
}