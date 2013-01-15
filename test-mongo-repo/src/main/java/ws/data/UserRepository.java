package ws.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByCredentials(ICredentials credentials);
	List<User> findByCredentialsEquals(ICredentials credentials);
}
