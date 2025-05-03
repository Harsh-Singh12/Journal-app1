package com.example.harsh_app.service;

import com.example.harsh_app.Entity.User;
import com.example.harsh_app.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component  // class level annotation used to mark a class as a Spring managed bean.
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
  public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
  }
  public void deleteById(ObjectId id){
        userRepository.deleteById(id);
  }
  public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
  }
}
