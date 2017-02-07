
public class Entry {

	
	private String Prezime;
	private String Ime;
	private String Broj;
	public Entry down;
	
	
	public Entry(String s1, String s2, String s3)
	{
		Prezime = s1;
		Ime = s2;
		Broj = s3;
		down = null;
	}


	

	public void setPrezime(String s1) {
		Prezime = s1;
	}
	
	 public String getPrezime() {
		return Prezime;
	}

	 public void setIme(String s2) {
		Ime = s2;
		}
	 
	 public String getIme() {
		return Ime;
	}

	public void setBroj(String s3){
		Broj = s3;
		
	}
	
	public String getBroj() {
		return Broj;
	}

	public Entry getDown() {
		return down;
	}

	public void setDown(Entry down) {
		this.down = down;
	}


	public  void  display()
    {
     System.out.println("Prezime : " + getPrezime() + " Ime : " + getIme() + " Broj : " + getBroj());
    }

	


}


