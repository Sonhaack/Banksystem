package Tier2.Server;

import Tier2.Client.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientPool
{

    // Husk at lav DB om så kunder er alle Clients i stedet.

    private List<Client> pool;

    public ClientPool()
    {
        pool = new ArrayList<>();
    }

    public void AddClient(Client client)
    {
        pool.add(client);
    }

    public void removeClient(Client client)
    {
        pool.remove(client);
    }

    public Client getClient(int i)
    {
        return pool.get(i);
    }

    public List<Client> getList()
    {
        return pool;
    }


}
