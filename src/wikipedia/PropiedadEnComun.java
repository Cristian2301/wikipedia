package wikipedia;

import java.util.ArrayList;
import java.util.Map;

public class PropiedadEnComun extends Wikipedia {
	
	public PropiedadEnComun (String title, Map<String, WikipediaPage> infobox) {
		super(title, infobox);
	}
	
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wiki){
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for (WikipediaPage p: wiki) {
			if (page.getInfobox().get(p) == p.getInfobox().get(p)) {
					paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
	}
}
