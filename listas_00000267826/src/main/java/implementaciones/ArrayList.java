package implementaciones;
import excepciones.ListException;
import interfaces.IList;
import java.util.Iterator;

/**
 * Clase de ArrayList, implementando IList.
 * 
 * 
 * @author 267826
 * @param <T> Objeto generico.
 */
public class ArrayList<T> implements IList<T>, Iterable<T> {

    public int nElementos;
    public int tamLista;
    public T lista[];
    
    // 2025-09-25
    /**
     * Remplaza a elemento en el indice i, con el elemento o
     * @param o = Elemento que se va a colocar en el indice
     * @param i = Indice dentro de la lista
     * @throws ListException Se lanza la excepcion si la lista esta vacia o parametro i esta fuera de su indice.
     */
    @Override
    public void set(T o, int i) throws ListException {
        if (empty())
            throw new ListException("Lista vacia");
        // Si el indice i esta fuera de los limites de los datos
        if(i < 0 || i >= nElementos)
            throw new ListException("Indice fuera de limites");
        lista[i] = o;
    }
    /**
     * Elimina un elemento especifico despues de confirmar que si este en la lista.
     * @param o el elemento que se busca dentro de la lista para eliminarlo
     * (Es la primera ocurrencia que importa.)
     * @return true si el elemento o esta dentro de la lista, false si no es asi.
     * @throws ListException cuando la lista esta vacia.
     */
    @Override
    public boolean remove(T o) throws ListException {
        // Variable para mandar el boolean
        boolean found = false;
        // Checar si esta vacia.
        if (empty())
            throw new ListException("Lista vacia");
        // Pasar por la lista, si se encuentra, se elimina y se returna.
        for(int i = 0; i < nElementos; i++) {
            if(lista[i] == o) {
                lista[i] = lista[i+1];
                nElementos--;
                for(int n = i + 1; n < nElementos; n++) {
                    lista[n] = lista[n+1];
                    // System.out.println(lista[n]); <--- Esto nada mas para verificar de mi lado que se este haciendo bien.
                }
                found = true;
            }
        }
        // Se regresa el valor de boolean, found.
        return found;
    }
    
    /**
     * Regresa el indice del elemento o que se busca.
     * @param o = elemento a buscar dentro de la lista
     * @return el numero de indice, o -1 si es que no lo encuentra.
     */
    @Override
    public int indexOf(T o) {
        // Checar si esta vacia.
        if (empty())
            throw new ListException("Lista vacia");
        int n = -1;
        for(int i = 0; i < nElementos; i++) {
            if(lista[i] == o) {
                n = i;
                break;
            }
        }
        return n;
    }
    
    /**
     * Metodo que elimina todo los elementos de la lista (la limpia).
     */
    @Override
    public void clear() {
        for(int i = 0; i < nElementos; i++) {
            lista[i] = null;
            nElementos = 0;
            
        }
    }

    /**
    * Esta clase miembro representa un iterador para esta lista
    */
    private class ListIterator<T> implements Iterator<T> {

        private int actual = 0;
        /**
        * Determina si el iterador tiene otro elemento que regresar
        *
        * @return true si el iterador tiene otro elemento que
        * regresar, false en caso contrario.
        */
        @Override
        public boolean hasNext() {
            return actual < nElementos;
        }

        /**
        * Regresa una referencia al siguiente elemento de la
        * colección y avanza el iterador a la siguiente posición.
        *
        * @return Una referencia al siguiente elemento de la
        * colección
        * @throws Una excepción del tipo NoSuchElementException si
        * ya no hay elementos que regresar
        */
        @Override
        public T next() {
            return (T)lista[actual++];
        }
    }
    
    /**
    * Constructor de la clase. Crea el arreglo sobre el que se
    * implementa la lista e inicializa nElementos a cero para
    * indicar que la lista inicialmente esta vacia.
    *
    * @param tipoDato Tipo de los elementos que se almacenaran en
    * la lista
    * @param tamLista Tamaño del arreglo sobre el que se implementa
    * la lista
    */
    public ArrayList(Class<T> tipoDato, int tamLista) {
        this.tamLista = tamLista;
        nElementos = 0;
        lista = (T[]) java.lang.reflect.Array.newInstance(tipoDato,
        tamLista);
    }
    /**
    * Inserta un elemento al final de la lista
    * @param o Elemento a insertar en la posición i de la lista
    * @throws ListException Si la lista esta llena
    */
    @Override
    public void append(T o) throws ListException {
        // Si la lista esta llena, lanza una excepcion
        if (nElementos >= tamLista)
            throw new ListException("Lista llena");
        // Inserta el dato en el nElementos de la lista
        lista[nElementos] = o;
        nElementos++;
    }

    /**
    * Inserta un elemento en la posición i de la lista
    *
    * @param o Elemento a insertar en la posición i de la lista
    * @param i Posición i de la lista donde se inserta el elemento
    * @throws ListException Si la lista esta llena o menor que cero
    */
    @Override
    public void insert(T o, int i) throws ListException {
        // Si la lista esta llena, lanza una excepcion
        if (nElementos >= tamLista)
            throw new ListException("Lista llena");
        // Si el indice i esta fuera de los limites de los datos
        if(i < 0 || i > nElementos)
            throw new ListException("Indice fuera de limites");
        for(int j = nElementos; j > i; j--)
            lista[j] = lista[j - 1];
        lista[i] = o;
        nElementos++;
    }
    /**
    * Inspecciona el elemento en la posición i de la lista sin
    * extraerlo
    *
    * @param i Posición i de la lista del elemento a inspeccionar
    * @return El elemento en la posición i de la lista
    * @throws ListException Si la lista esta vacia o menor que cero
    */
    @Override
    public T get(int i) throws ListException {
        // Si la lista esta vacia lanza una excepcion
        if (empty())
            throw new ListException("Lista vacia");
        // Si el indice i esta fuera de los limites de los datos
        if(i < 0 || i >= nElementos)
            throw new ListException("Indice fuera de limites");
        return lista[i];
    }
    /**
    * Extrae el elemento de la posición i de la lista
    *
    * @param i Posición i de la lista del elemento a remover
    * @return El elemento de la posición i de la lista
    * @throws ListException Si la lista esta vacia o menor que cero
    */
    @Override
    public T remove(int i) throws ListException {
        T o = get(i);
        for(int j = i; j < nElementos - 1; j++)
            lista[j] = lista[j+1];
        nElementos--;
        return o;
    }
    /**
    * Determina si la lista se encuentra vacía
    *
    * @return true si la lista se encuentra vacia,
    * false en caso contrario.
    */
    @Override
    public boolean empty() {
        return nElementos == 0;
    }
    /**
    * Regresa el numero de elementos en la lista
    *
    * @return El numero de elementos en la lista
    * */
    @Override
    public int size() {
        return nElementos;
    }
    /**
    * Regresa un iterador para esta lista
    *
    * @return Un iterador para esta lista
    */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    /**
    * Genera una cadena con los valores de los elementos de la
    * lista
    *
    * @return La cadena con los valores de los elementos de la
    * lista
    */
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < nElementos; i++) {
            s += lista[i];
            if(i < nElementos - 1) s += ", ";
        }
        s += "";
        return s;
    }
}
