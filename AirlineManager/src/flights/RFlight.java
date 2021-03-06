package flights;

import java.io.Serializable;
import java.util.Calendar;

import planes.Airplane;


/**
 * Class that represents a regular flight.
 * @author Daniela Fontes, Ivo Correia, Jo�o Penetra, Jo�o Barbosa, Ricardo Bernardino
 *
 */
@SuppressWarnings("serial")
public class RFlight implements Serializable {
	private Airplane airplane;
	private String origin;
	private String destination;
	private String day;
	private boolean isCharter;
	private int idPlane, idFlight, hour, minute, weekDay;

	/**
	 * The Main Constructor.
	 * 
	 * @param airplane
	 * @param origin
	 * @param destination
	 * @param weekDay
	 * @param hour
	 * @param minute
	 * @param idPlane
	 * @param idFlight
	 */
	public RFlight(Airplane airplane, String origin, String destination,
			int weekDay, int hour, int minute, int idPlane, int idFlight, boolean isCharter) {
		this.origin = origin;
		this.destination = destination;
		this.idPlane = idPlane;
		this.idFlight = idFlight;
		this.hour = hour;
		this.minute = minute;
		this.airplane = airplane;
		this.weekDay = weekDay;
		this.isCharter = isCharter;
		translateWeekDayToString(weekDay);
		
	}

	/**
	 * This is an override of method equals. It compares two flights by their id.
	 * 
	 * @param Object a - Airplane;
	 */
	@Override
	public boolean equals(Object a){
		if(((RFlight) a).getIdFlight()==this.idFlight){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Given a week day in number format, saves its correspondent string
	 * in the variable day.
	 * 
	 * @param int weekDay
	 */
	public void translateWeekDayToString(int weekDay){
		if (weekDay == Calendar.SUNDAY)
			day = "Sunday";
		else if (weekDay == Calendar.MONDAY)
			day = "Monday";
		else if (weekDay == Calendar.TUESDAY)
			day = "Tuesday";
		else if (weekDay == Calendar.WEDNESDAY)
			day = "Wednesday";
		else if (weekDay == Calendar.THURSDAY)
			day = "Thursday";
		else if (weekDay == Calendar.FRIDAY)
			day = "Friday";
		else if (weekDay == Calendar.SATURDAY)
			day = "Saturday";
	}
	
	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public int getIdPlane() {
		return idPlane;
	}

	public int getIdFlight() {
		return idFlight;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public String getDay() {
		return day;
	}

	public String getData() {
		return day + ", " + hour + "h" + minute;
	}

	public Airplane getPlane() {
		return airplane;
	}

	public int getWeekDay() {
		return weekDay;
	}
	
	public boolean isCharter(){
		return isCharter;
	}
}
