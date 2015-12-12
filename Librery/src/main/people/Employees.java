package people;

public class Employees extends AbstractPeople {
	String title ;
	int years;
	
	public Employees( String name , String id ,String phone,String title,int years ) {
	super(name,id,phone);
	this.title = title;
	this.years  = years;		
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}


		
		
	
}
