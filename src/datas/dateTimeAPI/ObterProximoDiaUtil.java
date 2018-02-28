package datas.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ObterProximoDiaUtil implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		
		DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		
		int diasASomar = 1;
		switch(diaDaSemana) {
			case FRIDAY : 
				diasASomar = 3; 
				break;
			case SATURDAY :
				diasASomar = 2;
				break;
			default:
				break;
		}
		
		return temporal.plus(diasASomar, ChronoUnit.DAYS);
	}

}
