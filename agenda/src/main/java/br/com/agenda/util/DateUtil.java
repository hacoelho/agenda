package br.com.agenda.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil 
{
	public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime)
	{
		return DateTimeFormatter.ofPattern("yyy-MMM-dd HH:mm:ss").format(localDateTime);
	}
}