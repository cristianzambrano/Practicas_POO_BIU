package ClasesBases;

public class Usuario {

    protected int id;
    protected String nombre;
    protected String clave;
    protected String departamento;
    protected int tipo;
    protected String fechacreacion;

    public Usuario(int id, String nombre, String clave, String departamento,
                   int tipo, String fechacreacion) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.departamento = departamento;
        this.tipo = tipo;
        this.fechacreacion = fechacreacion;
    }


}
