package tddappsempresariales.calendario;
/**
 * 
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author esteban.catanoe
 *
 */
public class CalendarioFestivo {
	private List<ReglaCalendario> listaReglas;
	
	public CalendarioFestivo() {
		listaReglas = new ArrayList<>();
	}

	public void agregarRegla(ReglaCalendario regla){
		listaReglas.add(regla);
	}
	
	public boolean esFestivo(LocalDate date){
		boolean festivo = false;
		for(ReglaCalendario regla: listaReglas){
			if(regla.esFestivo(date))festivo = true;
		}
		return festivo;
	}
	
	/*private List<MonthDay> listaFestivos;
	private List<LocalDate> listaEspecial;
	
	
	public CalendarioFestivo() {
		listaFestivos = new ArrayList<>();
		listaEspecial = new ArrayList<>();
		listaFestivos.add(MonthDay.of(Month.JANUARY, 1));
		listaFestivos.add(MonthDay.of(Month.MAY, 1));
		listaFestivos.add(MonthDay.of(Month.JULY, 20));
		listaFestivos.add(MonthDay.of(Month.AUGUST, 7));
		listaFestivos.add(MonthDay.of(Month.DECEMBER, 8));
		listaEspecial.add(LocalDate.of(2012, Month.APRIL, 20));
	}

	public boolean esFestivo(LocalDate date) {
		// TODO Auto-generated method stub
		
		return date.getDayOfWeek().equals(DayOfWeek.SUNDAY) 
				|| date.getDayOfWeek().equals(DayOfWeek.SATURDAY)
				|| listaFestivos.contains(MonthDay.of(date.getMonth(), date.getDayOfMonth()))
				|| listaEspecial.contains(date);
	}
	*/
}
