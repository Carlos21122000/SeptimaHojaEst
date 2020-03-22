/**
 *
 * @author Carlos Albero Raxtum 
 * Carnet 19721
 */


package hoja7;

public class Association<K, V> {
    K key;
    V valor;
    /**
     * Agrega ambas palabras, creando asociacion
     */
    public void addAsociation(K key, V valor){
        this.key = key;
        this.valor = valor;
    }
    /**
     * retornaa la palabra en ingles
     */
    public K getKey(){
        return this.key;
    }
    /**
     * retorna la palabra en español
     */
    public V getValor(){
        return this.valor;
    }
}
