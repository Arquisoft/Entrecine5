import play.Application;
import play.GlobalSettings;


public class Global extends GlobalSettings{

	@Override
	public void onStart(Application app) {
		super.onStart(app);
		
//		if (Usuario.find.findRowCount() == 0) {
//            Ebean.save((List) Yaml.load("datos-iniciales.yml"));
//        }
	}
	
	

}
