package peliculas;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class FechasTest extends JUnitStories{

	public FechasTest() {
		this.configuredEmbedder().candidateSteps().add(new FechasEscenarios());
	}
	
	@Override
    public Configuration configuration() {
        // where to find the stories
        URL storyURL = null;
        try {
            storyURL = new URL("file://" + System.getProperty("user.dir") + "/test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return  new MostUsefulConfiguration()
            .useStoryLoader(storyURL != null ? new LoadFromRelativeFile(storyURL) : new LoadFromClasspath(this.getClass()))
            // CONSOLE and TXT reporting
            .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }
	
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("stories/Peliculas.story");
	}
	
}
