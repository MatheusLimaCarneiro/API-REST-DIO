package dio.API.REST.service;

import dio.API.REST.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
