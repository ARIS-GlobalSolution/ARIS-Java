package br.com.aris.aris_api.service;

import br.com.aris.aris_api.entity.Telemetria;
import br.com.aris.aris_api.repository.TelemetriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelemetriaService {

    private final TelemetriaRepository repository;

    public List<Telemetria> listarTodos() {
        return repository.findAll();
    }

    public Telemetria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Telemetria não encontrada"));
    }

    public Telemetria salvar(Telemetria telemetria) {
        return repository.save(telemetria);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
