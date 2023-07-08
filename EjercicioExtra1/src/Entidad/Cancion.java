
package Entidad;

/**
 *
 * @author Usuario
 */
public class Cancion {
    /*atributos*/
    private String titulo;
    private String autor;
    
    /*constructor vacio*/
    public Cancion() {
    }
    
    /*construcotr x parametro*/
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    /*getter*/
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    /*setter*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
