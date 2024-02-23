package es.comepiedras.dominio;

import lombok.*;

//import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor  // Añade este importante
@AllArgsConstructor
@Builder
public class Cita {
    private String id;
    private Paciente paciente;
 //   private LocalDateTime fechaHora;
    private String motivo;
}
