package ece.engineering.journalApp.service;

import ece.engineering.journalApp.entity.JournalEntry;
import ece.engineering.journalApp.entity.User;
import ece.engineering.journalApp.repository.JournalEntryRepository;
import ece.engineering.journalApp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
        userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }

        public void deleteById(ObjectId id){
            userRepository.deleteById(id);
    }
}

