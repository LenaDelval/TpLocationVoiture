package com.adaming.tplocation.dao;


import com.adaming.tplocation.entities.Client;

public interface IClientDAO extends IGenericDAO<Client>{


	public Client add(Client client, Long pIdAgence);

}
