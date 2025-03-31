package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import modelo1.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Aquí puedes definir métodos de consulta personalizados si es necesario.
}
