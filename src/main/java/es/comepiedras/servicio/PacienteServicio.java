package es.comepiedras.servicio;

import es.comepiedras.dominio.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacienteServicio {

    private Map<String, Paciente> pacientes;

    public PacienteServicio(){
        this.pacientes = new HashMap<>();
        cargaMock();
    }

    public void cargaMock(){
        // Inicializar pacientes predefinidos
        pacientes.put("1", Paciente
                .builder()
                .id("1")
                .nombre("Nombre1")
                .apellido("Apellido1")
             //   .fechaNacimiento(LocalDate.of(1990, 1, 1))
                .direccion("Dirección1")
                .build());
        pacientes.put("2", Paciente
                .builder()
                .id("2")
                .nombre("Nombre2")
                .apellido("Apellido2")
            //    .fechaNacimiento(LocalDate.of(1990, 1, 1))
                .direccion("Dirección2")
                .build());
        pacientes.put("3", Paciente
                .builder()
                .id("3")
                .nombre("Nombre13")
                .apellido("Apellido3")
            //    .fechaNacimiento(LocalDate.of(1990, 1, 1))
                .direccion("Dirección3")
                .build());
    }
    public List<Paciente> obtenerTodosLosPacientes(){
        return new ArrayList<>(pacientes.values());
    }

    public Paciente obtenerPacientePorId(String id){
        return pacientes.get(id);
    }

    public void crearPaciente(Paciente paciente){
        pacientes.put(paciente.getId(), paciente);
    }

}
