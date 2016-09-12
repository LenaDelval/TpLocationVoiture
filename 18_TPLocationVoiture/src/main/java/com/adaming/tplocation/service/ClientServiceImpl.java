package com.adaming.tplocation.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.tplocation.dao.IClientDAO;
import com.adaming.tplocation.entities.Client;

@Transactional
public class ClientServiceImpl implements IClientService {
	
	Logger log = Logger.getLogger("ClientServiceImpl");
	
	private IClientDAO dao = null;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IClientDAO dao) {
		this.dao = dao;
		log.info("------------ DAO injecté ----------------");
	}
	
	
	@Override
	public Client add(Client client) {
		return dao.add(client);
	}
	

	@Override
	public Client add(Client client, Long pIdAgence) {
		return dao.add(client, pIdAgence);
	}

	@Override
	public Client update(Client client) {

		return dao.update(client);
		
	}

	@Override
	public List<Client> getAll() {
		return dao.getAll();
	}

	@Override
	public Client getById(Long pId) {
		return dao.getById(pId);
	}



}
