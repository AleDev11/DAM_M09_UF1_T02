package font.alejandro.dam.m09.uf1.t02.model.domain;

public class Alumno {
    private String nombre;
    private String NIF;
    private float nota;

    public Alumno(String _nombre, String _NIF, float _nota) {
        this.nombre = _nombre;
        this.NIF = _NIF;
        this.nota = _nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
