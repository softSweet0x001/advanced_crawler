package interfaces;

import bean.Page;

public interface Communication {

	public String geturl();
	public void puturl(String url);
	public void putSource(Page p);
	public Page getSource();
	public void putResult(Page p);
	public Page getResult();
	
	public int urlSize();
	public int sourceSize();
	public int resultSize();
}
