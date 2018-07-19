
package olap.entidades;


public class Nivel {
 
    private int codigo_nivel;
    private int codigo_sicoa;
    private String nombre;
    private String paralelo;
    private String modalidad;
    private int codigo_escuela;

    public Nivel() {
    }

    public Nivel(int codigo_nivel, int codigo_sicoa, String nombre, String paralelo, String modalidad, int codigo_escuela) {
        this.codigo_nivel = codigo_nivel;
        this.codigo_sicoa = codigo_sicoa;
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.modalidad = modalidad;
        this.codigo_escuela = codigo_escuela;
    }

    public int getCodigo_nivel() {
        return codigo_nivel;
    }

    public void setCodigo_nivel(int codigo_nivel) {
        this.codigo_nivel = codigo_nivel;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCodigo_escuela() {
        return codigo_escuela;
    }

    public void setCodigo_escuela(int codigo_escuela) {
        this.codigo_escuela = codigo_escuela;
    }
    }
