package Tier1.core;

import Tier1.model.Model;
import Tier1.model.ModelManager;
import Tier2.Client.RMIClientImpl;

public class ModelFactory {

  private Model model;
  private static ModelFactory modelFactory;

  private ModelFactory() {
  }

  public Model getQuizConverter() {
    if(model == null) {
      model = new ModelManager(ClientFactory.getInstance().getClient());
    }
    return model;
  }

  public static ModelFactory getInstance() {
    if (modelFactory == null) {
      modelFactory = new ModelFactory();
    }
    return modelFactory;
  }



}
