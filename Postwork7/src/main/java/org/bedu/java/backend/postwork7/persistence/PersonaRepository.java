package org.bedu.java.backend.postwork7.persistence;

import org.bedu.java.backend.postwork7.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
