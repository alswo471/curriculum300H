package day13_14;

import java.util.*;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("�̺���", Integer.valueOf(90));
		map.put("���¸�", Integer.valueOf(100));
		map.put("������", Integer.valueOf(100));
		map.put("�����", Integer.valueOf(80));
		map.put("������", Integer.valueOf(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ���� : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total / set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}
