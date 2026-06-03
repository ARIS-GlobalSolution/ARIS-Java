package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SENSORES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sensores {

    @Id
    @Column(name = "id_sensor")
    private Long idSensor;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoSensor tipoSensor;

    @ManyToOne
    @JoinColumn(name = "id_estufa")
    private Estufa estufa;
}
