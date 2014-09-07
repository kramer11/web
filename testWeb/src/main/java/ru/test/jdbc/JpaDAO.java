package ru.test.jdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.test.core.UserEntity;

@Repository(value="jpaDao")
@Transactional
public class JpaDAO {
	
	@PersistenceContext(unitName="unitPU")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<UserEntity> getAllUsers(){
		return (List<UserEntity>)em.createQuery("SELECT s FROM UserEntity s").getResultList();
		
	}
	
	public void addUser(UserEntity user){
	em.persist(user);
	}
	
	public void saveUser(UserEntity user){
		em.merge(user);
		}
	
	public UserEntity getUser(long id){
	return em.find(UserEntity.class, id);
		}

}
