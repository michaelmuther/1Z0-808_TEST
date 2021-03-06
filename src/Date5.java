public class Date5 {
}
/*
Which of the following are true regarding the new Date-Time API of Java 8?
Answered Correctly

You had to select 2 option(s)
It uses the calendar system defined in ISO-8601 as the default calendar. // TRUE
This calendar is based on the Gregorian calendar system and is used globally as the defacto standard for representing
date and time. The core classes in the Date-Time API have names such as LocalDateTime, ZonedDateTime, and
OffsetDateTime. All of these use the ISO calendar system.
If you want to use an alternative calendar system, such as Hijrah or Thai Buddhist, the java.time.chrono package allows
you to use one of the predefined calendar systems. Or you can create your own.

Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable. // TRUE
These classes do not have any setters. Once created you cannot change their contents. Even their constructors are private.

LocalDateTime includes time zone information but LocalDate does not. // FALSE
None of LocalDate, LocalDateTime, or LocalTime store zone information.
java.time.ZonedDateTime does. ZonedDateTime is an immutable representation of a date-time with a time-zone. This class
stores all date and time fields, to a precision of nanoseconds, and a time-zone, with a zone offset used to handle
ambiguous local date-times. For example, the value "2nd October 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris
time-zone" can be stored in a ZonedDateTime.
ZonedDateTime is not listed in official exam objectives.

To create a LocalDate or a LocalDateTime object, you can use one of their several constructors. // FALSE
These classes do not have any public constructors. You need to use their static factory methods to get their instances.
For example:

java.time.LocalDate d1 = java.time.LocalDate.of(2015, Month.JANUARY, 31);

java.time.LocalDateTime d2 =
    java.time.LocalDateTime.of(2015, Month.JANUARY, 31, 10, 56);

java.time.LocalDateTime d3 = \
    java.time.LocalDateTime.parse("2015-01-02T17:13:50");
    //Note that this
//will throw a  java.time.format.DateTimeParseException if the input string
//lacks the time component i.e.T17:13:50

java.time.LocalDate d4 = java.time.LocalDate.parse("2015-01-02"); //Note that
//this will throw a  java.time.format.DateTimeParseException if the input string
//contains the time component

java.time.LocalTime d5 = java.time.LocalTime.parse("02:13:59.985"); //Note that
//this will throw a  java.time.format.DateTimeParseException if the input string
//contains the Date component
 */
