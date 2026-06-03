package br.com.aris.aris_api.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "LOG_AÇÕES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogAcao {

    @Id
    @Column(name = "id_log")
    private Long idLog;

    private String acao;

    private String descricao;
}