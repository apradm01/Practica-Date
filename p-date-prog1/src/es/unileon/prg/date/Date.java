package es.unileon.prg.date;

/**
*
*
*@version 0.999
*/

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		this.setMonth(month); 
		this.setDay(day);
	}
	public void setMonth(int month) throws DateException{
	if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
}
	public void setDay(int day) throws DateException{
		if (day < 1 || day > getDaysOfMonth(this.month)) {
			throw new DateException("Dia " + day + " no valido" + 
					" Valores posibles entre 1 y "+getDaysOfMonth(this.month));
		}
		else {
		this.day = day;
		}
}
	private int getDaysOfMonth(int month){
	int number = 0;
	switch (month){
	case 1: //next
	case 3: //next
	case 5: //next
	case 7: //next
	case 8: //next
	case 10: //next
	case 12: number = 31;
	break;
	case 2: number = 28;
	break;
	case 4: //next
	case 6: //next
	case 9: //next
	case 11: number = 30;
	break;
	}
	return number;
	}
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}
	
	
	
