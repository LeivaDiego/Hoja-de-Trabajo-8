import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Clase PriorityManager que contiene metodos para ordenar los procesos utilizando 2 diferentes implementaciones
 * de colas de prioridad: siendo el VectorHeap, y el JCF PriorityQueue
 * @author diego leiva, pablo orellana
 */
public class PriorityManager {

    /**
     * Ordena una lista de procesos utilizando la implementacion VectorHeap
     * @param processes  la lista de procesos a ordenar
     * @return lista de procesos ordenados segun su prioridad
     */
    public static List<Process> sortByVectorHeap(List<Process> processes){
        //Ordenamiento del vectorHeap por prioridad de procesos
        VectorHeap<Process> vectorHeap = new VectorHeap<>();

        for (Process process : processes) {
            vectorHeap.insert(process);
        }

        //Generacion del nuevo listado ordenado por prioridad de procesos
        List<Process> sortedProcesses = new ArrayList<>();
        while (!vectorHeap.isEmpty()) {
            sortedProcesses.add(vectorHeap.remove());
        }

        return sortedProcesses;
    }


    /**
     * Ordena una lista de procesos utilizando la implementacion PriorityQueue
     * del Java Collection Framework.
     *
     * @param processes la lista de procesos a ordenar
     * @return lista de procesos ordenados segun su prioridad
     */
    public static List<Process> sortByPriorityQueueJCF(List<Process> processes) {
        PriorityQueue<Process> priorityQueue = new PriorityQueue<>(processes);

        List<Process> sortedProcesses = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            sortedProcesses.add(priorityQueue.poll());
        }

        return sortedProcesses;
    }



}
