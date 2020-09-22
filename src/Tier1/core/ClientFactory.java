package Tier1.core;

import Tier2.Client.Client;
import Tier2.Client.RMIClientImpl;

public class ClientFactory {

  private static ClientFactory clientFactory;
  private Client client;

  public Client getClient() {
    if(client == null) {
      client = new RMIClientImpl();
      client.startClient();
    }
    return client;
  }

  public static ClientFactory getInstance() {
    if (clientFactory == null) {
      clientFactory = new ClientFactory();
    }
    return clientFactory;
  }


}
