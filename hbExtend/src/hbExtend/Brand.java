package hbExtend;

public class Brand {
	private String name;
	private String logo;
	private String webUrl;
	public Brand() {
		super();
	}
	public Brand(String name, String logo, String webUrl) {
		super();
		this.name = name;
		this.logo = logo;
		this.webUrl = webUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	
}
