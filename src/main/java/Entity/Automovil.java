package gt.edu.umg.automovil_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "automovil")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String linea;
    private Integer modelo;
}