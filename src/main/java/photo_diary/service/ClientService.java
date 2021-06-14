package photo_diary.service;


import photo_diary.entity.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    void saveClient(Client client);

    void deleteClient(int id);

    Client getClient(int id);


}
