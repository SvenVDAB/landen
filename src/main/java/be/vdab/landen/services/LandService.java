package be.vdab.landen.services;

import be.vdab.landen.repositories.LandRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class LandService {
    private final LandRepository repository;

    public LandService(LandRepository repository) {
        this.repository = repository;
    }
    public long findAantal() {
        return repository.count();
    }
}
