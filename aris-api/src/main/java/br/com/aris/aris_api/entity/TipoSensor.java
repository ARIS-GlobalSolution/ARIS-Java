package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TIPO_SENSOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoSensor {

    @Id
    @Column(name = "id_tipo")
    private Long idTipo;

    private String nome;

    private String unidade;
}
