package es.comepiedras.controlador;

import es.comepiedras.dominio.Paciente;
import es.comepiedras.servicio.PacienteServicio;
import io.javalin.http.Handler;
import io.javalin.http.Context;

import java.util.List;

public class PacienteControlador {

    private PacienteServicio pacienteServicio;

    public PacienteControlador(PacienteServicio pacienteServicio) {
        this.pacienteServicio = pacienteServicio;
    }

    public Handler obtenerTodosLosPacientes = ctx -> {
        List<Paciente> pacientes = pacienteServicio.obtenerTodosLosPacientes();
        ctx.json(pacientes);
    };

    public Handler obtenerPacientePorId = ctx -> {
        String id = ctx.pathParam("id");
        Paciente paciente = pacienteServicio.obtenerPacientePorId(id);
        if (paciente != null) {
            ctx.json(paciente);
        } else {
            ctx.status(404).result("Paciente no encontrado");
        }
    };

    public Handler crearPaciente = ctx -> {
        Paciente paciente = ctx.bodyAsClass(Paciente.class);
        pacienteServicio.crearPaciente(paciente);
        ctx.status(201);
    };
}
