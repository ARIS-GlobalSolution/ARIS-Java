package br.com.aris.aris_api.service;

import br.com.aris.aris_api.entity.Sensores;
import br.com.aris.aris_api.entity.Sensores;
import br.com.aris.aris_api.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {

    private final SensorRepository repository;

    public List<Sensores> listarTodos() {
        return repository.findAll();
    }

    public Sensores buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensor não encontrado"));
    }

    public Sensores salvar(Sensores sensor) {
        return repository.save(sensor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Sensores atualizar(Long id, Sensores sensor) {

        return sensor;
    }
}
