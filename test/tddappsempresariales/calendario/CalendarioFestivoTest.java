package tddappsempresariales.calendario;
import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

import org.junit.Test;

import tddappsempresariales.calendario.CalendarioFestivo;

public class CalendarioFestivoTest {

	@Test
	public void test() {
		CalendarioFestivo calendario = new CalendarioFestivo();
		
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 25);
		boolean festivo = calendario.esFestivo(date);
		
		assertFalse(festivo);	
	}
	
	@Test
	public void testDomingo(){
		CalendarioFestivo calendario = new CalendarioFestivo();
		calendario.agregarRegla(new ReglaCalendarioDiaSemana(DayOfWeek.SUNDAY));
		
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 28);
		boolean festivo = calendario.esFestivo(date);
		
		assertTrue(festivo);
	}
	
	@Test
	public void testSabado(){
		CalendarioFestivo calendario = new CalendarioFestivo();
		calendario.agregarRegla(new ReglaCalendarioDiaSemana(DayOfWeek.SATURDAY));
		
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 27);
		boolean festivo = calendario.esFestivo(date);
		
		assertTrue(festivo);
	}
	
	@Test
	public void testFestivoColombia(){
		CalendarioFestivo calendario = new CalendarioFestivo();
		calendario.agregarRegla(new ReglaCalendarioDiaFestivo(MonthDay.of(Month.JULY, 20)));
		calendario.agregarRegla(new ReglaCalendarioDiaFestivo(MonthDay.of(Month.AUGUST, 7)));
		calendario.agregarRegla(new ReglaCalendarioDiaFestivo(MonthDay.of(Month.DECEMBER, 8)));
		calendario.agregarRegla(new ReglaCalendarioDiaFestivo(MonthDay.of(Month.MAY, 1)));
		calendario.agregarRegla(new ReglaCalendarioDiaFestivo(MonthDay.of(Month.JANUARY, 1)));
		
		LocalDate date = LocalDate.of(2016, Month.JULY,20);
		boolean festivo = calendario.esFestivo(date);
		
		assertTrue(festivo);
		
		date = LocalDate.of(2012, Month.AUGUST, 7);
		assertTrue(calendario.esFestivo(date));
		
		date = LocalDate.of(2021, Month.DECEMBER, 8);
		assertTrue(calendario.esFestivo(date));
		
		date = LocalDate.of(2013, Month.MAY, 1);
		assertTrue(calendario.esFestivo(date));
		
		date = LocalDate.of(2014, Month.JANUARY, 1);
		assertTrue(calendario.esFestivo(date));
		
	}
	
	@Test
	public void testFestivoCualquiera(){
		CalendarioFestivo calendario = new CalendarioFestivo();
		calendario.agregarRegla(new ReglaCalendarioDiaCualquiera(LocalDate.of(2012, Month.APRIL, 20)));
		
		LocalDate date = LocalDate.of(2012, Month.APRIL,20);
		boolean festivo = calendario.esFestivo(date);
		
		assertTrue(festivo);
	}

}
