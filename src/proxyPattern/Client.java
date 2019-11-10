package proxyPattern;

public class Client {
	public static void main(String[] args) {
		Searcher searcher = new ProxySearcher();
		String result = searcher.doSearch("Ñî¹ı", "ÓñÅ®ĞÄÁé");
	}
}
