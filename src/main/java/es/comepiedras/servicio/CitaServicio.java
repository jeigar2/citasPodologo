package es.comepiedras.servicio;

import es.comepiedras.CitasPodologo;
import es.comepiedras.dominio.Cita;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitaServicio {
    private Map<String, Cita> citas;

    public CitaServicio(){
        this.citas = new HashMap<>();
        cargarMock();
    }

    public void cargarMock(){
       // Inicializar citas predefinidas
       // citas.put("1", new Cita("1", pacientes.get("1"), LocalDateTime.of(2024, 2, 23, 10, 0), "Consulta médica"));
       // citas.put("2", new Cita("2", pacientes.get("2"), LocalDateTime.of(2024, 2, 24, 11, 0), "Control de rutina"));
    }

    public List<Cita> obtenerTodasLasCitas(){
        return new ArrayList<>(citas.values());
    }

    public Cita obtenerCitaPorId(String id){
        return citas.get(id);
    }

    public void crearCita(Cita cita){ citas.put(cita.getId(), cita); }
}
