package Package1;

import java.io.IOException;
import java.util.*;

import Package1.Ders.Missions;

public class Ciktı {

	public static void main(String[] args) throws IOException {

		ExcelOkuma excelOkuma = new ExcelOkuma();
		Ders ders = excelOkuma.oku();
				
		Scanner konsolData = new Scanner(System.in);
		int cikti;

		while (true) {

			System.out.println("1 - Öğenci bilgileri ve notları listele");
			System.out.println("2 - Ortalamaları listele");
			System.out.println("3 - Geçen öğrencileri listele");
			System.out.println("4 - Kalan öğrencileri listele");
			System.out.println("5 - Genel ortalamayı göster");
			System.out.println("6 - Uygulamadan Çık");
			System.out.println("Lütfen yapmak istediğiniz işlem numarasını seçiniz");

			cikti = konsolData.nextInt();

			switch (cikti) {

			case 1:
				ders.goster(Missions.studentList);
				break;
			case 2:
				ders.goster(Missions.averageNote);
				break;
			case 3:
				ders.goster(Missions.passedStudents);
				break;
			case 4:
				ders.goster(Missions.unpassedStudents);
				break;
			case 5:
				ders.lessonAverage(ders.getOgrenciler());
				break;
			case 6:
				System.out.println("Uygulamadan Çıkılıyor");
				return;
			}

		}

	}

}
