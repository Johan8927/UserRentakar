package fr.campus.rentakar.rentakar.repository;


import fr.campus.rentakar.rentakar.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    User findByUsername(String username);
    User findByEmail(String email);
}
