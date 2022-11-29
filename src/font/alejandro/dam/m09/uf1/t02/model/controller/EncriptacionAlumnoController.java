package font.alejandro.dam.m09.uf1.t02.model.controller;

import font.alejandro.dam.m09.uf1.t02.model.domain.Alumno;
import font.alejandro.dam.m09.uf1.t02.model.service.EncriptacionAlumnoService;
import font.alejandro.dam.m09.uf1.t02.model.view.MostrarDatosAlumnoView;
import font.alejandro.dam.m09.uf1.t02.model.view.PedirDatosAlumnoView;

public class EncriptacionAlumnoController {
    public void encripta() {
        try {
            PedirDatosAlumnoView pedirDatosAlumnoView = new PedirDatosAlumnoView();
            Alumno alumno = pedirDatosAlumnoView.pedirDatosAlumno();

            EncriptacionAlumnoService encriptacionAlumnoService = new EncriptacionAlumnoService();
            String alunmoEncriptado = encriptacionAlumnoService.encripta(alumno);

            MostrarDatosAlumnoView mostrarDatosAlumnoView = new MostrarDatosAlumnoView();
            mostrarDatosAlumnoView.show(alunmoEncriptado);
        } catch (Exception ex) {
            MostrarDatosAlumnoView mostrarDatosAlumnoView = new MostrarDatosAlumnoView();
            mostrarDatosAlumnoView.show(ex.getMessage());
        }

    }
}
