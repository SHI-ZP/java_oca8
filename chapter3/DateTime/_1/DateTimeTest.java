import static java.lang.System.out;

public class DateTimeTest{
	public static void main(String... args) {
		out.println("now()");

		out.println(java.time.LocalTime.now());
		out.println(java.time.LocalDate.now());
		out.println(java.time.LocalDateTime.now());

		out.println("of()");

		out.println(java.time.LocalTime.of(19, 15, 15));
		// out.println(java.time.LocalTime.of(-19, 15, 15));
		out.println(java.time.LocalDate.of(-2000, 12, 25));
		// out.println(java.time.LocalDate.of(-2000, 12L, 25));
		out.println(java.time.LocalDate.of(-200000, 12, 25));
		out.println(java.time.LocalDateTime.of(1988, 2, 23, 23, 54, 59));
		// out.println(java.time.LocalDateTime.of(1988, 2, 23, 23, 54, 60));

		out.println("parse()");
		java.time.LocalTime timeParse = java.time.LocalTime.parse("19:33:29");
		out.println(timeParse);
		// timeParse = java.time.LocalTime.parse("19:40:30:0");

		java.time.LocalDate dateParse = java.time.LocalDate.parse("2018-06-16");
		out.println(dateParse);
		// dateParse = java.time.LocalDate.parse("2018-00006-16");
		// dateParse = java.time.LocalDate.parse("2018-06-016");
		// dateParse = java.time.LocalDate.parse("2018-5-06");
		// dateParse = java.time.LocalDate.parse("2018-05-6");
		dateParse = java.time.LocalDate.parse("0018-05-06");
		out.println(dateParse);

		out.println("plus()");
		java.time.LocalTime timePlus = java.time.LocalTime.of(20, 28, 30);
		out.println(timePlus.plusSeconds(1));
		out.println(timePlus.plusMinutes(1));
		out.println(timePlus.plusHours(1));

		java.time.LocalDate datePlus = java.time.LocalDate.of(1989, 4, 20);
		out.println(datePlus.plusYears(1));
		out.println(datePlus.plusMonths(1));
		out.println(datePlus.plusDays(1));
		out.println(datePlus.plusWeeks(1));

		java.time.LocalDateTime dateTimePlus = java.time.LocalDateTime.of(1997, 7, 1, 20, 44, 33);
		out.println(dateTimePlus.plusYears(1));
		out.println(dateTimePlus.plusMonths(1));
		out.println(dateTimePlus.plusDays(1));
		out.println(dateTimePlus.plusWeeks(1));
		out.println(dateTimePlus.plusHours(1));
		out.println(dateTimePlus.plusMinutes(1));
		out.println(dateTimePlus.plusSeconds(1));

		// out.println(timePlus.plusSeconds(1.0));
		out.println(timePlus.plusSeconds(-200));

		out.println("minus()");

		out.println("period.ofxxx");
		java.time.LocalDateTime dateTimePeriod = java.time.LocalDateTime.of(1998, 12, 20, 02, 33, 11);
		out.println(dateTimePeriod.plus(java.time.Period.ofYears(1)));
		out.println(dateTimePeriod.plus(java.time.Period.ofMonths(1)));
		out.println(dateTimePeriod.plus(java.time.Period.ofDays(1)));
		out.println(dateTimePeriod.plus(java.time.Period.ofWeeks(2)));
		out.println(dateTimePeriod.plus(java.time.Period.of(1, 2, 3)));
		// out.println(dateTimePeriod.plus(java.time.Period.ofHours(1)));
		// out.println(dateTimePeriod.plus(java.time.Period.ofMinutes(1)));
		// out.println(dateTimePeriod.plus(java.time.Period.ofSeconds(1)));

		out.println(dateTimePeriod.minus(java.time.Period.of(3,2,1)));

		out.println("date time datetime format()");
		java.time.format.DateTimeFormatter timeFormatter = java.time.format.DateTimeFormatter.ofLocalizedTime(java.time.format.FormatStyle.SHORT);
		java.time.format.DateTimeFormatter dateFormatter = java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.MEDIUM);
		java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.SHORT);
		java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.SHORT, java.time.format.FormatStyle.MEDIUM);
		out.println(java.time.LocalTime.now());
		out.println(java.time.LocalTime.now().format(timeFormatter));
		// out.println(java.time.LocalTime.now().format(dateFormatter));
		// out.println(java.time.LocalTime.now().format(dateTimeFormatter1));

		out.println(java.time.LocalDate.now());
		out.println(java.time.LocalDate.now().format(dateFormatter));
		// out.println(java.time.LocalDate.now().format(timeFormatter));
		// out.println(java.time.LocalDate.now().format(dateTimeFormatter1));

		out.println(java.time.LocalDateTime.now());
		out.println(java.time.LocalDateTime.now().format(dateTimeFormatter1));
		out.println(java.time.LocalDateTime.now().format(dateTimeFormatter2));
		out.println(java.time.LocalDateTime.now().format(timeFormatter));
		out.println(java.time.LocalDateTime.now().format(dateFormatter));

		out.println("formatter format()");
		out.println(timeFormatter.format(java.time.LocalTime.now()));
		out.println(dateFormatter.format(java.time.LocalDate.now()));
		out.println(dateTimeFormatter2.format(java.time.LocalDateTime.now()));

		out.println("ofPattern()");
		java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ofPattern("yyyy@MM@dd");
		java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofPattern("yyyy@MM@dd@@hh");
		java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ofPattern("yy@MM@dd@@hh");
		out.println(dateTimeFormatter3.format(java.time.LocalDate.now()));
		// out.println(dateTimeFormatter3.format(java.time.LocalTime.now()));
		out.println(dateTimeFormatter3.format(java.time.LocalDateTime.now()));
		out.println(dateTimeFormatter4.format(java.time.LocalDateTime.now()));
		out.println(dateTimeFormatter5.format(java.time.LocalDateTime.now()));
	}
}