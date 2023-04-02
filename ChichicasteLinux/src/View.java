/**
 * Clase View que maneja la entrada y salida de datos en la aplicacion
 * Se encarga de mostrar mensajes en consola al usuario
 * 
 * @author diego leiva, pablo orellana
 */
public class View {
    /**
     * Muestra el menu del sistema en consola
     */
    public static void Menu(){
        System.out.println("Bienvenido a Chichicaste Linux");
        System.out.println("Un sistema de colas con prioridad para que el CPU atienda procesos\n");
    }

    /**
     * Muesta una linea separadora en consola
     */
    public static void Separator(){
        System.out.println("\n------------------------------------------\n");
    }

    /**
     * Muestra un mensaje de error en la consola
     * @param error el error a mostrar
     */

    public static void Error(String error){
        System.out.println("ERROR: "+ error+"\n");
    }

    /**
     * Muestra un mensaje dado en la consola
     * @param message el mensaje a mostrar
     */
    public static void ShowMessage(String message){
        System.out.println(message);
    }
}
