package com.kumar.journalApp.repository;

import com.kumar.journalApp.entity.JournalEntry;
import com.kumar.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);
}
