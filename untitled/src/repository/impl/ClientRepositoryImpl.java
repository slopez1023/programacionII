package repository.impl;

import domain.enums.ClientType;
import domain.models.Client;
import mapping.dtos.ClientDto;
import mapping.mappers.ClientMapper;
import repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    List<Client> clients;

    public ClientRepositoryImpl(){
        clients = new ArrayList<Client>();
    }
    @Override
    public ClientDto createClient(ClientDto client) {
        clients.add(ClientMapper.mapFrom(client));
        return client;
    }

    @Override
    public ClientDto updateClient(ClientDto client) {
        Client clientSaved = finById(client.identifier());
        clientSaved.setContact(client.cellphone());
        clientSaved.setEmail(client.email());
        clientSaved.setFullName(client.fullName());
        updateClientInList(clientSaved);
        return ClientMapper.mapFrom(clientSaved);
    }

    private void updateClientInList(Client client){
        clients.remove(client);
        clients.add(client);
    }

    @Override
    public String removeClient(String clientId) {
        return null;
    }

    @Override
    public List<ClientDto> listAllClient() {
        return ClientMapper.mapFrom(clients);
    }

    @Override
    public List<ClientDto> listAllByType(ClientType type) {
        return null;
    }
    private Client finById(String identifier){
        for(Client client: clients){
            if(client.getIdentifier().equalsIgnoreCase(identifier)){
                return client;
            }
        }
        throw new RuntimeException("Client not found");
}

}
