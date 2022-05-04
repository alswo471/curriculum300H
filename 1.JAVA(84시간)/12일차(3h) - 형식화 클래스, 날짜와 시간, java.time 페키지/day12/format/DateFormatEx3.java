package day12.format;

import java.util.*;
import java.text.*;

public class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2022�� 05�� 04��");
			System.out.println(df2.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
