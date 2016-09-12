package com.adaming.tplocation.service;

import com.adaming.tplocation.entities.Client;

public interface IClientService extends IGenericService<Client> {

	public Client add(Client client, Long pIdAgence);

}
