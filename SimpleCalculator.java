import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		// создаем панель  	
		JPanel windowContent = new JPanel();
		//задаем менеджер отображения для этой панели
		FlowLayout fl = new FlowLayout ();
		windowContent.setLayout(fl);
		//создаем компоненты в памяти
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1=new JTextField (10);
		JLabel label2=new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField (10);
		JButton go = new JButton ("Add");
		
		//добавляем компоненты на панель
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		//создаем фрейм и задаем для него панель
		
		JFrame frame = new JFrame ("My First Calculator");
		frame.setContentPane(windowContent);
		
		// задаем размер и делаем видимым
		
		frame.setSize(400,100);
		frame.setVisible(true);
	}

}
