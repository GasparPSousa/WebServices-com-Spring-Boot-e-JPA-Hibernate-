package br.com.gaspar.course.services;

import br.com.gaspar.course.entities.User;
import br.com.gaspar.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Listar Todos Users
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Listar objeto User por Id
    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    // Criar um objeto User
    public User insert(User obj) {
        return userRepository.save(obj);
    }

    // Deletar um objeto User por Id
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    // Atualizar um objeto User
    public User update(Long id, User obj) {
        User entity = userRepository.getById(id);
        updateData(entity, obj);
        return userRepository.save(entity);

    }

    private void updateData(User entity, User obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
