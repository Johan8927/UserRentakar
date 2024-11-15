package fr.campus.rentakar.rentakar.services;

import fr.campus.rentakar.rentakar.models.User;
import fr.campus.rentakar.rentakar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Méthode pour enregistrer un utilisateur
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    // Méthode pour obtenir un utilisateur par son nom d'utilisateur
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByName(String name) {
        // Vous pouvez implémenter la logique ici si nécessaire
        return null;
    }

    // Méthode pour obtenir tous les utilisateurs
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    // Méthode pour supprimer un utilisateur par son ID
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
