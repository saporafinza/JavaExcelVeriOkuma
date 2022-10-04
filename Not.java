package Package1;

public class Not {
	
	private int vize1;
	private int vize2;
	private int finalNot;
	
	
	public int getVize1() {
		return vize1;
	}
	public void setVize1(int vize1) {
		this.vize1 = vize1;
	}
	public int getVize2() {
		return vize2;
	}
	public void setVize2(int vize2) {
		this.vize2 = vize2;
	}
	public int getFinalNot() {
		return finalNot;
	}
	public void setFinalNot(int finalNot) {
		this.finalNot = finalNot;
	}
	
	public Not(int vize1, int vize2, int finalNot) {
		this.vize1 = vize1;
		this.vize2 = vize2;
		this.finalNot = finalNot;
	}
	
	public int ortalama() {
		int ortalama = (int)(((vize1 + vize2) / 2) * 0.4 + finalNot * 0.6); 
		return ortalama;	
	}
	
	public String letterGrade(double not) {
		
//		boolean control = true;
//		switch (control) {
//		
//		case (not >= 90) :
//			return "AA";
//		break;
//		
//		case not 
//		}
		
		if (not >= 90) {
			return "AA";
		}
		else if (not >=85) {
			return "BA";
		}
		else if (not >=80) {
			return "BB";	
		}
		else if (not >=75) {
			return "BC";
		}
		else if (not >=70) {
			return "CC";
		}
		else if (not >=65) {
			return "DC";
		}
		else if (not >=60) {
			return "DD";
		}
		else if (not >=50) {
			return "FD";
		}
		else if ( not <= 50) {
			return "FF";
		}
		else
			return "Bir hata oluştu";
		
	}

}
