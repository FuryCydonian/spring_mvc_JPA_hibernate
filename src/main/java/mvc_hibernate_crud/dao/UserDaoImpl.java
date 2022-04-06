package mvc_hibernate_crud.dao;

import mvc_hibernate_crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

//    @Autowired
//    private EntityManagerFactory entityManagerFactory;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAllUsers() {
//        TypedQuery<User> query = entityManagerFactory.createEntityManager().createQuery("from User", User.class);
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    // TODO realize methods
    @Override
    @Transactional
    public void addUser(User user) {

    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public void removeUser(long id) {

    }
}
