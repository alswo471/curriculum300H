package day20_21;

import java.io.*;

public class RandomAccessFileEx2 {
	public static void main(String[] args) {
		//				   ��ȣ, ����, ����, ���� 
		int[] score = {   1,  100,    90,     90, 
							    2,   70,    90,    100,
							    3,  100,   100,    100,
							    4,   70,    60,     80,
							    5,   70,    90,    100 };
		
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
			for(int i = 0; i < score.length; i++) {
				raf.writeInt(score[i]);
			}
			
			/**
			 * ���������Ͱ� ������ ���� ������ �����Ƿ� 
			 * ���� �����͸� �ٽ� ó������ �̵� ���Ѿ� ����� ���� �о�� �� �ִ�.
			 */
			raf.seek(0);  
			while(true) {
				System.out.println(raf.readInt());
			}
			
		} catch (EOFException eof) {
			// readInt()�� ȣ������ �� �� �̻� ���� ������ ���ٸ� EOFException�� �߻��Ѵ�.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
