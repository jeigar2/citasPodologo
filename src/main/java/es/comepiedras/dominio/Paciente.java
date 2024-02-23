package es.comepiedras.dominio;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor  // Añade este importante
@AllArgsConstructor
@Builder
public class Paciente {
    private String id;
    private String nombre;
    private String apellido;
  //  private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String dni;
}
