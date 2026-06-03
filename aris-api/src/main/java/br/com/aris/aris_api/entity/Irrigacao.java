package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "IRRIGACAO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Irrigacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_irrigacao")
    private Long idIrrigacao;

    private String status;

    @ManyToOne
    @JoinColumn(name = "id_estufa")
    private Estufa estufa;
}