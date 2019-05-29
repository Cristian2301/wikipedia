package wikipedia;

import java.util.ArrayList;
import java.util.Map;

public class LinkEnComun extends Wikipedia{
	
	public LinkEnComun (String title, Map<String, WikipediaPage> infobox) {
		super(title, infobox);
	}
	
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wiki){
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for (WikipediaPage p: wiki) {
			if (this.tienenPaginaEnComun(page, p)) {
					paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
	}
	
	public Boolean tienenPaginaEnComun(WikipediaPage page, WikipediaPage p) {
		Boolean tienenMismaPag = false;
		for (WikipediaPage l:page.getLinks()) {
			tienenMismaPag = tienenMismaPag || p.getLinks().contains(l);
		}
		return tienenMismaPag;
	}
}
