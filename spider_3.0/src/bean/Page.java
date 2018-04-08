package bean;

public class Page {

	public String url;
	public String source;
	public Page(){}
	public Page(Page p)
	{
		this.url=new String(p.url);
		this.source=new String(p.source);
	}
	public Page(String url,String source)
	{
		this.url=url;
		this.source=source;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
