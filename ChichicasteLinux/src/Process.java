/**
 * Clase Process que representa un proceso en el sistema, contiene datos como el nombre del proceso, el nombre del
 * usuario y el valor nice
 * Implementa la interfaz Comparable para comparar procesos segun su prioridad
 *
 * @author diego leiva, pablo orellana
 */
public class Process implements Comparable<Process> {
    private String name;    //almacena el nombre del proceso
    private String user;    //almacena el usuario
    private int nice;       //almacena el valor nice del proceso
    private int priority;   //almacena la prioridad del proceso

    /**
     * Contructor de la clase Process
     * @param name el nombre del proceso
     * @param user el nombre del usuario
     * @param nice el valor nice del proceso
     */
    public Process(String name, String user, int nice) {
        this.name = name;
        this.user = user;
        this.nice = nice;
        this.priority = 20 + nice + 100; //calculo del valor PR a partir de la definicion del Linux Kernel
    }

    /**
     * Obtiene el nombre del proceso
     * @return el nombre del proceso
     */
    public String getName() { return name; }

    /**
     * Obtiene el nombre del usuario
     * @return el nombre del usuario
     */
    public String getUser() { return user; }

    /**
     * Obtiene el valor nice del proceso
     * @return el valor nice
     */
    public int getNice() { return nice; }

    /**
     * Obtiene el valor de la prioridad del proceso
     * @return el valor de la prioridad
     */
    public int getPriority() { return priority; }

    /**
     * Compara este proceso con otro proceso segun su prioridad
     * @param process el proceso a ser comparado
     * @return un valor negativo, cero o positivo si la prioridad de este proceso es menor, igual o mayor que la
     * prioridad del otro proceso
     */
    @Override
    public int compareTo(Process process) {
        return Integer.compare(this.priority, process.priority);
    }

    /**
     * Devuelve una representacion en cadena del proceso, incluyendo el nombre del proceso,el nombre del usuario,
     * el valor nice y la prioridad (PR)
     * @return una cadena que representa el proceso
     */
    @Override
    public String toString() {
        return name + "," + user + "," + nice + ",PR=" + priority;
    }

}
