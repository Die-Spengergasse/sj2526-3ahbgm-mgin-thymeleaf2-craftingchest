package at.spengergasse.spring_thymeleaf.entities;

import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogamesRepository extends JpaRepository<@NonNull Videogames, @NonNull Integer> {
}
