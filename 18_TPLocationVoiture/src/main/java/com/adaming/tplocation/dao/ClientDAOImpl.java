package com.adaming.tplocation.dao;



import org.springframework.stereotype.Component;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Client;

@Component("clientDAO")
public class ClientDAOImpl extends GenericDaoImpl<Client> implements IClientDAO {

	/* (non-Javadoc)
	 * @see com.adaming.tplocation.dao.GenericDaoImpl#add(java.lang.Object)
	 */
	@Override
	public Client add(Client client, Long pIdAgence) {
		
		Agence a = em.find(Agence.class, pIdAgence);
		client.setAgence(a);
		em.persist(client);
		log.info(" Le client  : " + client + " a bien �t� ajout� !");
		return client;
		
	}
	

	

}
 