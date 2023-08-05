package com.example.pp_3_1_2.dao;

import com.example.pp_3_1_2.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Transactional(readOnly = true)
   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      Query query = entityManager.createQuery("from User", User.class);
      return (List<User>) query.getResultList();
   }

   @Transactional
   @Override
   public void createUser(User user) {
      entityManager.persist(user);
   }

   @Transactional
   @Override
   public void editEmail(Long id, String newEmail) {
      User user = getUserById(id);
      if (user != null) user.setEmail(newEmail);
   }

   @Transactional
   @Override
   public void dropUser(Long id) {
      User user = getUserById(id);
      if (user != null) entityManager.remove(user);
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserById(Long id) {
      return entityManager.find(User.class, id);
   }
}
