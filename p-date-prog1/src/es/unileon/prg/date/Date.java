package es.unileon.prg.date;

/**
*
*@TODO arreglar errores de compilacion
*@version 0.999
*/

/*public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this._year = year;
		this.setMonth(month); 
		this.setDay(day);
	}
	public void setMonth(int month) throws DateException{
	if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this._month = month;
		}
}
	public void setDay(int day) throws DateException{
		if (day < 1 || day > getDaysOfMonth(month)) {
			throw new DateException("Dia " + day + " no valido" + 
					" Valores posibles entre 1 y "+getDaysOfMonth(month));
		}
		else {
		this._day = day;
		}
	}
	private int DaysOfMonth(int month){
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
	}*/

	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
	}

}
	
	
	
