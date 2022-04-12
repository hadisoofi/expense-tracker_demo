package org.soofi.expensetracker.repository;

import org.soofi.expensetracker.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<AppUser, String> {
    AppUser findByEmail(String email);
}
