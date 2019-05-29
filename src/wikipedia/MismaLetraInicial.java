package wikipedia;

import java.util.ArrayList;
import java.util.Map;

public class MismaLetraInicial extends Wikipedia {
	
	public MismaLetraInicial(String title, Map<String, WikipediaPage> infobox) {
		super(title, infobox);
	}
	
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wiki) {
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for (WikipediaPage p: wiki) {
			if (page.getTitle().charAt(0) == p.getTitle().charAt(0)) {
				paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
	}
	
}
