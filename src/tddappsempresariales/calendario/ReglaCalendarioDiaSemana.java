/**
 * 
 */
package tddappsempresariales.calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author esteban.catanoe
 *
 */
public class ReglaCalendarioDiaSemana implements ReglaCalendario {
	private DayOfWeek day;
	
	public ReglaCalendarioDiaSemana(DayOfWeek day) {
		this.day = day;
	}

	/* (non-Javadoc)
	 * @see tddappsempresariales.calendario.ReglaCalendario#esFestivo(java.time.LocalDate)
	 */
	@Override
	public boolean esFestivo(LocalDate date) {
		// TODO Auto-generated method stub
		return this.day.equals(date.getDayOfWeek());
	}

}
