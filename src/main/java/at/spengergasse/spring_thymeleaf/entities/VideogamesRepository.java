package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogamesRepository extends JpaRepository<Videogames,Integer> {
}
