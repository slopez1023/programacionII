package services.impl;

import domain.enums.ClientType;
import mapping.dtos.ClientDto;
import repository.ClientRepository;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public ClientDto createClient(ClientDto client) {
        return repository.createClient(client);
    }

    @Override
    public ClientDto updateClient(ClientDto client) {
        return repository.updateClient(client);
    }

    @Override
    public String removeClient(String clientId) {
        return repository.removeClient(clientId);
    }

    @Override
    public List<ClientDto> listAllClient() {
        return repository.listAllClient();
    }

    @Override
    public List<ClientDto> listAllByType(ClientType type) {
        return repository.listAllByType(type);
    }
    public double getDiscountByClient(String clientId) {
        return repository.findByClientId(clientId);

    }

}
