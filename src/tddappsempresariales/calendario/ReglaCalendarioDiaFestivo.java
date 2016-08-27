/**
 * 
 */
package tddappsempresariales.calendario;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author esteban.catanoe
 *
 */
public class ReglaCalendarioDiaFestivo implements ReglaCalendario {

	private MonthDay dia;
	
	
	public ReglaCalendarioDiaFestivo(MonthDay dia) {
		this.dia = dia;
	}

	/* (non-Javadoc)
	 * @see tddappsempresariales.calendario.ReglaCalendario#esFestivo(java.time.LocalDate)
	 */
	@Override
	public boolean esFestivo(LocalDate date) {
		// TODO Auto-generated method stub
		return dia.getDayOfMonth() == date.getDayOfMonth() 
				&& dia.getMonth().equals(date.getMonth());
				
	}

}
