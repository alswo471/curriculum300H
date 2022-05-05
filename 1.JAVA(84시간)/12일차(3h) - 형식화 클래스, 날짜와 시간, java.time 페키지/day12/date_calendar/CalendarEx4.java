package day12.date_calendar;

import java.util.*;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2021, 0, 31); // 2021�� 1�� 31��
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��";
	}
}
