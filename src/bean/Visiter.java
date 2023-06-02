package bean;

import java.util.Date;

public class Visiter {
	private String codemed;
	private String codepat;
	private Date date;
	
	public Visiter(String codemed, String codepat, Date date) {
		super();
		this.codemed = codemed;
		this.codepat = codepat;
		this.date = date;
	}
	
	public String getCodemed() {
		return codemed;
	}
	public void setCodemed(String codemed) {
		this.codemed = codemed;
	}
	public String getCodepat() {
		return codepat;
	}
	public void setCodepat(String codepat) {
		this.codepat = codepat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Visiter [codemed=" + codemed + ", codepat=" + codepat + ", date=" + date + "]";
	}
}
