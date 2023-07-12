package mapping.mappers;

import domain.models.Client;
import mapping.dtos.ClientDto;
import java.util.List;

public class ClientMapper {

    public static ClientDto mapFrom(Client source){
        return new ClientDto(source.getIdentifier(),
                source.getFullName(),
                source.getEmail(),
                source.getType(),
                source.getContact());
    }

    public static Client mapFrom (ClientDto source){
        return new Client(source.identifier(),
                source.fullName(),
                source.email(),
                source.type(),
                source.cellphone());
    }
    public static List<ClientDto> mapFrom(List<Client> source){
        return source.stream().map(ClientMapper::mapFrom).collect(Collectors.toList());
    }
}
