package day22.gui;

import javax.swing.*;
import java.awt.*;

public class JTableTest extends JFrame {
	JTableTest() {
		super("JTable Test");
		setSize(300, 300);
		setLocation(300, 300);
		setLayout(new BorderLayout());
		String[] title = {"���", "����", "�μ�"};
		String[][] data = {{"1", "��ֽ�", "�ѹ���"}, {"2", "������", "�λ��"}, {"3", "������", "�����"}};
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane js = new JScrollPane(table, v, h);
		add(js, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest();
	}
}
