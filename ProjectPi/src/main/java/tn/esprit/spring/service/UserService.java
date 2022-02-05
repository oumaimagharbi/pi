package tn.esprit.spring.service;

import tn.esprit.spring.domain.User;
import tn.esprit.spring.enumuration.Education_level;
import tn.esprit.spring.enumuration.Hobbies;
import tn.esprit.spring.enumuration.Occupation;
import tn.esprit.spring.enumuration.Relationship;
import tn.esprit.spring.enumuration.Sex;
import tn.esprit.spring.exception.domain.*;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email,Sex sex ,Education_level education_level,Hobbies hobbies,Occupation occupation,Relationship relationship) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    void deleteUser(String username) throws IOException;

    void resetPassword(String email) throws MessagingException, EmailNotFoundException;

    
}
