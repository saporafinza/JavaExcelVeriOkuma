package Package1;

import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.hslf.record.Sound;

public class Ders {
	
	private static int passNote = 50;
	private Ogrenci[] ogrenciler;
	
	public enum Missions {
		studentList, 
		averageNote, 
		passedStudents, 
		unpassedStudents, 
	}
	
	public Ders() {
		ogrenciler = new Ogrenci [13];		
	}

	public Ogrenci[] getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(Ogrenci[] ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	public void goster(Missions _missions) throws IOException {
		for (int i = 0; i < 13; i++) {
			
			Ogrenci ogrenci = ogrenciler[i];
			switch (_missions) {
			
				case studentList:
					System.out.println(ogrenci.getOgrenciNo() + ": " + ogrenci.getAd()+ " " + ogrenci.getSoyad() + ": " + ogrenci.getNot().getVize1()  + ": "+ ogrenci.getNot().getVize2() +  ": " + ogrenci.getNot().getFinalNot() + "\n");
				break;
				
				case averageNote:
					
					System.out.print(ogrenci.getAd() + " " + ogrenci.getSoyad() + ":" + "-----" + ogrenci.getNot().ortalama() + "-----");
					System.out.println(ogrenci.getNot().letterGrade(ogrenci.getNot().ortalama()) + "\n");
				break;
				
				case passedStudents:
				if (whoPassed(ogrenci)) { 
					System.out.print(ogrenci.getAd()+ " " + ogrenci.getSoyad() + ":" + "-----" + ogrenci.getNot().ortalama() + "-----");
					System.out.println(ogrenci.getNot().letterGrade(ogrenci.getNot().ortalama()) + "\n");
				}
				break;			
				
				case unpassedStudents:	
				if (!whoPassed(ogrenci)) {
					System.out.print(ogrenci.getAd()+ " " + ogrenci.getSoyad() + ":" + "-----" + ogrenci.getNot().ortalama() + "-----");
					System.out.println(ogrenci.getNot().letterGrade(ogrenci.getNot().ortalama()) + "\n");
				}
				break;
				
				default:	
				System.out.println("Bir hata oluştu, enum yanlış olabilir.");	
			
			}		
		}
	}
	
	private Not notlar;
	
	public Not getNotlar() {
		return notlar;
	}

	public void setNotlar(Not notlar) {
		this.notlar = notlar;
	}
	
	public void ortalama() {
			
		System.out.println(notlar.ortalama());
	
	}
	public void lessonAverage(Ogrenci[] ogrenciler) {
		System.out.println("Sınıfın ders ortalaması: " + totalAverage(ogrenciler) / ogrenciler.length + "   Harf Notu: " + ogrenciler[0].getNot().letterGrade(totalAverage(ogrenciler) / ogrenciler.length) + "\n");		
	}
	
	public int totalAverage(Ogrenci[] ogrenciler) {
		int total = 0;
		for (int i = 0; i < ogrenciler.length; i++) {
			Ogrenci ogrenci = ogrenciler[i];
			total = total + ogrenci.getNot().ortalama();
		}
		return total;
	}
	public static boolean whoPassed(Ogrenci _ogrenci) {

		if (_ogrenci.getNot().ortalama() >= passNote) {
			return true;
		}
		else {
			return false;
		}	
	
	}

}
