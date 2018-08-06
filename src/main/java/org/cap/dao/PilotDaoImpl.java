package org.cap.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("pilotDao")
@Transactional
public class PilotDaoImpl implements PilotDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Pilot pilot) {
		entityManager.persist(pilot);
	}

}
