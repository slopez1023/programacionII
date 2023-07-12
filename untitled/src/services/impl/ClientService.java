package services.impl;

import domain.enums.ClientType;
import mapping.dtos.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto createClient(ClientDto client);
    ClientDto updateClient(ClientDto client);
    String removeClient(String clientId);
    List<ClientDto> listAllClient();
    List<ClientDto> listAllByType(ClientType type);
    double getDiscountByClient(String clientId);
    String
}
