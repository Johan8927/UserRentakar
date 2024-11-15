package fr.campus.rentakar.rentakar.services;

import fr.campus.rentakar.rentakar.models.User;

import java.util.Optional;

public interface UserService {

    // Méthode pour enregistrer un utilisateur
    User saveUser(User user);

    // Méthode pour obtenir un utilisateur par son nom d'utilisateur
    User getUserByUsername(String username);

    Optional<User> findById(Long id);

    User findByName(String name);

    User findByUsername(String username);

    // Méthode pour obtenir un utilisateur par son ID

}
