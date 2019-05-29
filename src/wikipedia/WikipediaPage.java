package wikipedia;

import java.util.ArrayList;
import java.util.Map;

public interface WikipediaPage {
	
	public String getTitle();
	
	public ArrayList<WikipediaPage> getLinks();
	
	public Map<String, WikipediaPage> getInfobox();
}
