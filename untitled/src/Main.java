
import domain.enums.ClientType;
import mapping.dtos.ClientDto;
import repository.ClientRepository;
import repository.impl.ClientRepositoryImpl;
import services.impl.ClientService;
import services.impl.ClientServiceImpl;


public class Main {
    public static void main(String[]args){
        ClientRepository repository = new ClientRepositoryImpl();
        ClientService service = new ClientServiceImpl(repository);
        createClients(service);

        System.out.println("Clientes: "+ service.listAllClient());

        service.updateClient(new ClientDto("1", "Lorena","lorena@cue.edu.co", ClientType.TEAR1,"323232"));

        System.out.println("Clients updated: "+ service.listAllClient());
        System.out.println("Clients filtered: ");
        service.listAllByType(ClientType.TEAR2).forEach(System.out::println);
        service.removeClient("3");
        System.out.println("Clients updated (2): "+ service.listAllClient());

    }

    private static void createClients (ClientService service){
        service.createClient(new ClientDto("1", "Lorena","lorena@cue.edu.co", ClientType.TEAR1,"323232"));
        service.createClient(new ClientDto("2", "Lorena","lorena@cue.edu.co",ClientType.TEAR1,"323232"));
        service.createClient(new ClientDto("3", "Lorena","lorena@cue.edu.co",ClientType.TEAR1,"323232"));
    }
}

