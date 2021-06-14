package photo_diary.dao;


import photo_diary.entity.Client;

import java.util.List;

public interface ClientDAO {

    List<Client> getAllClients();

    void saveClient(Client client);

    void deleteClient(int id);

    Client getClient(int id);
}
