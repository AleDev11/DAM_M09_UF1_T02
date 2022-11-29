package font.alejandro.dam.m09.uf1.t02.model.view;

import font.alejandro.dam.m09.uf1.t02.model.domain.Alumno;

public class PedirDatosAlumnoView {
    public Alumno pedirDatosAlumno() {

        Alumno alumno = null;

        UtilidadesPeticionView utilidadesPeticionView = new UtilidadesPeticionView();
        String nombre = utilidadesPeticionView.getString("Introduce el nombre del alumno");
        String NIF = utilidadesPeticionView.getString("Introduce el NIF del alumno");
        float nota = utilidadesPeticionView.getFloat("Introduce la nota del alumno");

        alumno = new Alumno(nombre, NIF, nota);

        return alumno;
    }
}
