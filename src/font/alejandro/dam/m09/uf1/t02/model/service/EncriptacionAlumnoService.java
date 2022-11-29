package font.alejandro.dam.m09.uf1.t02.model.service;

import font.alejandro.dam.m09.uf1.t02.model.domain.Alumno;

public class EncriptacionAlumnoService {
    public String encripta(Alumno _alumno)
    {
        if (_alumno.getNota() > 10 || _alumno.getNota() < 0) {
            throw new RuntimeException("La nota del alumno no puede ser menor que 0 o mayor que 10");
        }

        if (_alumno.getNIF().length() != 9) {
            throw new RuntimeException("El NIF del alumno no tiene 9 caracteres");
        }

        StringBuilder sb = new StringBuilder();

        EncriptacionSha256Service encriptacionSha256Service = new EncriptacionSha256Service();

        String nameEncriptado = encriptacionSha256Service.encripta(_alumno.getNombre());
        String NIFEncriptado = encriptacionSha256Service.encripta(_alumno.getNIF());
        String capacidadEncriptada = encriptacionSha256Service.encripta(String.valueOf(_alumno.getNota()));

        sb.append("================================================================\n");
        sb.append("Nombre: " + nameEncriptado + "\n");
        sb.append("NIF: " + NIFEncriptado + "\n");
        sb.append("Nota: " + capacidadEncriptada + "\n");
        sb.append("================================================================\n");

        return sb.toString();
    }
}
