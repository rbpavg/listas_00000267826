package interfaces;
import excepciones.ListException;
import java.util.Iterator;

/**
 *
 * NOTA: Por omision se utilizaran los comentarios previos.
 * 
 * Interfaz generica para implementar una lista.
 * 
 * @author 267826
 * @param <T> el parametro de los objeyos genericos para la lista
 */
public interface IList<T> {
    
    /**
    * Inserta un elemento al final de la lista
    *
    * @param o Elemento a insertar al final de la lista
    * @throws ListException Si la lista esta llena
    */
    public void append(T o) throws ListException;
    /**
    * Inserta un elemento en la posición i de la lista
    *
    * @param o Elemento a insertar en la posición i de la lista
    * @param i Posición i de la lista donde se inserta el elemento
    * @throws ListException Si la lista esta llena o el indice es menor
    * i > size().
    */
    public void insert(T o, int i) throws ListException;
    /**
    * inspecciona el elemento en la posición i de la lista sin
    * extraerlo
    *
    * @param i Posición i de la lista del elemento a inspeccionar
    * @return El elemento en la posición i de la lista
    * @throws ListException Si la lista esta vacia o el indice es menor
    */
    public T get(int i) throws ListException;
    /**
    * Extrae el elemento de la posición i de la lista
    *
    * @param i Posición i de la lista del elemento a remover
    * @return El elemento de la posición i de la lista
    * @throws ListException Si la lista esta vacia o el indice es menor
    */
    public T remove(int i) throws ListException;
    /**
    * Determina si la lista se encuentra vacía
    *
    * @return true si la lista se encuentra vacia,
    * false en caso contrario.
    */
    public boolean empty();
    /**
    * Regresa el numero de elementos en la lista
    *
    * @return El numero de elementos en la lista
    */
    public int size();
    
    /**
    * Regresa un iterador para esta lista
    *
    * @return Un iterador para esta lista
    */
    public Iterator<T> iterator();
    
    /**
     * 2025-09-24 - Edicion
     */
    
    /**
     * Remplaza a elemento en el indice i, con el elemento o
     * @param o = Elemento que se va a colocar en el indice
     * @param i = Indice dentro de la lista
     * @throws ListException Se lanza la excepcion si la lista esta vacia o parametro i esta fuera de su indice.
     */
    public void set(T o, int i) throws ListException;
    
    /**
     * Elimina un elemento especifico despues de confirmar que si este en la lista.
     * @param o el elemento que se busca dentro de la lista para eliminarlo
     * (Es la primera ocurrencia que importa.)
     * @return true si el elemento o esta dentro de la lista, false si no es asi.
     * @throws ListException cuando la lista esta vacia.
     */
    public boolean remove(T o) throws ListException;
    
    /**
     * Regresa el indice del elemento o que se busca.
     * @param o = elemento a buscar dentro de la lista
     * @return el numero de indice, o -1 si es que no lo encuentra.
     */
    public int indexOf(T o);
    
    /**
     * Metodo que elimina todo los elementos de la lista (la limpia).
     */
    public void clear();
    
}
