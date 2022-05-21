package day22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPopupMenuTest extends JFrame {
	
	
	JPopupMenuTest() {
		super("�˾��޴����� �׸� ����");
		
		String[] title = {"���", "����", "�μ�" };
		JRadioButtonMenuItem[] rbm = new JRadioButtonMenuItem[3];
		
		JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup();
		
		for (int i = 0; i < rbm.length; i++) {
			rbm[i] = new JRadioButtonMenuItem(title[i]);
			pmenu.add(rbm[i]);
			tgroup.add(rbm[i]);
		}
		
		// ���콺 �̺�Ʈ�� �����Ϳ� ���
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				checkForTriggerEvent(e);
			}
			
			public void mouseReleased(MouseEvent e) {
				checkForTriggerEvent(e);
			}
			
			// ���콺 ������ ��ư�� �����ų� ������ �� �߻�
			private void checkForTriggerEvent(MouseEvent e) {
				if (e.isPopupTrigger()) 
					pmenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPopupMenuTest();
	}
}
