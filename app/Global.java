import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {

	@SuppressWarnings("rawtypes")
	@Override
	public void onStart(Application app) {
		super.onStart(app);

		// if (Usuario.find.findRowCount() == 0) {
		// Ebean.save((Map) Yaml.load("datos-iniciales.yaml"));
		// }
	}

}
