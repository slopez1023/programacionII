package services.impl;

import domain.enums.ClientType;
import mapping.dtos.ClientDto;
import services.ClientService;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {

    private List<ClientDto> clients = new ArrayList<ClientDto>();
    @Override
    public ClientDto createClient(ClientDto client) {
        return null;
    }

    @Override
    public ClientDto updateClient(ClientDto client) {
        return null;
    }

    @Override
    public String removeClient(String clientId) {
        return null;
    }

    @Override
    public List<ClientDto> listAllClient() {
        return null;
    }

    @Override
    public List<ClientDto> listAllByType(ClientType type) {
        return null;
    }
}
