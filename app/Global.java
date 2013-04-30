import java.util.List;
import java.util.Map;

import com.avaje.ebean.Ebean;

import models.Usuario;
import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

public class Global extends GlobalSettings {

	@SuppressWarnings("unchecked")
	@Override
	public void onStart(Application app) {
		// super.onStart(app);

		if (Ebean.find(Usuario.class).findRowCount() == 0) {
			Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml
					.load("datos-iniciales.yaml");
			Ebean.save(all.get("usuarios"));
			Ebean.save(all.get("salas"));
			Ebean.save(all.get("peliculas"));
			Ebean.save(all.get("tiposesion"));
			Ebean.save(all.get("sesiones"));
			Ebean.save(all.get("sesiones"));

		}
	}

}
