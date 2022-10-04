package Package1;

public class Ogrenci {
	
	private String ogrenciNo;
	private String ad;
	private String soyad;
	private Not not;
	
	
	public String getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Not getNot() {
		return not;
	}
	public void setNot(Not not) {
		this.not = not;
	}
	
	public Ogrenci(String ogrenciNo, String ad, String soyad, Not not) {
		this.ogrenciNo = ogrenciNo;
		this.ad = ad;
		this.soyad = soyad;
		this.not = not;
				
	}
			

}
