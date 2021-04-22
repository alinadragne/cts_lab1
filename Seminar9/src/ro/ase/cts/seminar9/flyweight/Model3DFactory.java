package ro.ase.cts.seminar9.flyweight;

import java.util.HashMap;

public class Model3DFactory {
static HashMap<ModelType,ModelFlyweigthInterface> models;

static {
	models = new HashMap<>();
	models.put(ModelType.SOLIDER, new Model3DFlyweight("Solider"));
	models.put(ModelType.TREE, new Model3DFlyweight("Tree"));
}

public static ModelFlyweigthInterface getModel(ModelType type) {
	return models.get(type);
}
}
