package es.comepiedras;

import es.comepiedras.config.AppConfing;
import es.comepiedras.controlador.CitaControlador;
import es.comepiedras.controlador.PacienteControlador;
import es.comepiedras.servicio.CitaServicio;
import es.comepiedras.servicio.PacienteServicio;
import io.javalin.Javalin;

public class CitasPodologo {
    public static void main(String[] args) {

        PacienteServicio pacienteServicio = new PacienteServicio();
        CitaServicio citaServicio = new CitaServicio();

        PacienteControlador pacienteControlador = new PacienteControlador(pacienteServicio);
        CitaControlador citaControlador = new CitaControlador(citaServicio);



        Javalin app = AppConfing.configureApp();
        app.get("/pacientes", pacienteControlador.obtenerTodosLosPacientes);
        app.get("/pacientes/{id}", pacienteControlador.obtenerPacientePorId);
        app.post("/pacientes", pacienteControlador.crearPaciente);

        app.get("/citas", citaControlador.obtenerTodasLasCitas);
        app.get("/citas/{id}", citaControlador.obtenerCitaPorId);
        app.post("citas", citaControlador.crearCita);
    }
}
