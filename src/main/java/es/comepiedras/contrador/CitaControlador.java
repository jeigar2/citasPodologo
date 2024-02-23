package es.comepiedras.contrador;

import es.comepiedras.dominio.Cita;
import es.comepiedras.servicio.CitaServicio;
import io.javalin.http.Handler;

import java.util.List;

public class CitaControlador {

    private CitaServicio citaServicio;

    public CitaControlador( CitaServicio citaServicio){
        this.citaServicio = citaServicio;
    }

    public Handler obtenerTodasLasCitas = ctx -> {
      List<Cita> citas = citaServicio.obtenerTodasLasCitas();
      ctx.json(citas);
    };

    public Handler obtenerCitaPorId = ctx -> {
        String id = ctx.pathParam("id");
        Cita cita = citaServicio.obtenerCitaPorId(id);
        if(cita != null){
            ctx.json(cita);
        } else {
            ctx.status(404).result("Cita no encontrada");
        }
    };

    public Handler crearCita = ctx -> {
        Cita cita = ctx.bodyAsClass(Cita.class);
        citaServicio.crearCita(cita);
    };
}
