import java.util.ArrayList;
import java.util.List;

/**
 * Clase Ordenamiento para ordenar los procesos utilizando el vectorHeap
 *
 * @author diego leiva, pablo orellana
 */
public class PriorityManager {

    /**
     * Ordena una lista de procesos utilizando la implementacion VectorHeap
     * @param processes  la lista de procesos a ordenar
     * @return lista de procesos ordenados segun su prioridad
     */
    public static List<Process> orderByPriority(List<Process> processes){
        //Ordenamiento del vectorHeap por prioridad de procesos
        VectorHeap<Process> vectorHeap = new VectorHeap<>();

        for (Process proceso : processes) {
            vectorHeap.insert(proceso);
        }

        //Generacion del nuevo listado ordenado por prioridad de procesos
        List<Process> procesosOrdenados = new ArrayList<>();
        while (!vectorHeap.isEmpty()) {
            procesosOrdenados.add(vectorHeap.remove());
        }

        return procesosOrdenados;
    }


}
