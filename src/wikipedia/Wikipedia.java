package wikipedia;


import java.util.ArrayList;
import java.util.Map;

public class Wikipedia implements WikipediaPage{
	private String title;
	private ArrayList <WikipediaPage> links;
	private Map <String, WikipediaPage> infobox;
	
	public Wikipedia(String Title, Map <String, WikipediaPage> infobox) {
		this.title = title;
		this.infobox = infobox;
		this.links = new ArrayList<WikipediaPage>();
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public ArrayList<WikipediaPage> getLinks() {
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}

}
