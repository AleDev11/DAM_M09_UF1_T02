package font.alejandro.dam.m09.uf1.t02.model.view;

public class PedirDatosAlumnoView {
    private String nombre;
    private String NIF;
    private float nota;

    public PedirDatosAlumnoView() {
        this.nombre = "";
        this.NIF = "";
        this.nota = 0;
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
