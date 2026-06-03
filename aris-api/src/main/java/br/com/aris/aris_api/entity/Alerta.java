package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ALERTAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alerta {

    @Id
    @Column(name = "id_alerta")
    private Long idAlerta;

    private String mensagem;

    private String nivelRisco;

    @ManyToOne
    @JoinColumn(name = "id_estufa")
    private Estufa estufa;
}