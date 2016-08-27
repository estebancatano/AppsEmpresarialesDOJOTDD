/**
 * 
 */
package tddappsempresariales.calendario;

import java.time.LocalDate;

/**
 * @author esteban.catanoe
 *
 */
public interface ReglaCalendario {
	boolean esFestivo(LocalDate date);
}
