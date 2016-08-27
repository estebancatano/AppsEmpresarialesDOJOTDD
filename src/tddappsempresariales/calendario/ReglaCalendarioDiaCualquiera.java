/**
 * 
 */
package tddappsempresariales.calendario;

import java.time.LocalDate;

/**
 * @author esteban.catanoe
 *
 */
public class ReglaCalendarioDiaCualquiera implements ReglaCalendario {

	private LocalDate dia;
	
	
	public ReglaCalendarioDiaCualquiera(LocalDate dia) {
		this.dia = dia;
	}

	/* (non-Javadoc)
	 * @see tddappsempresariales.calendario.ReglaCalendario#esFestivo(java.time.LocalDate)
	 */
	@Override
	public boolean esFestivo(LocalDate date) {
		// TODO Auto-generated method stub
		return this.dia.equals(date);
				
	}

}
