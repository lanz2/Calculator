import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculator {

//объявление всех компонентов калькулятора
JPanel windowContent;
JTextField displayField;
JButton button0;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
JButton button5;
JButton button6;
JButton button7;
JButton button8;
JButton button9;
JButton buttonPoint;
JButton buttonEqual;
JButton buttonPlus;
JButton buttonMinus;
JButton buttonMultiply;
JButton buttonDivide;

JPanel pl;
JPanel p2;

//в конструкторе создаются все компоненты
//и добавляются на фрейм с помощью комбинации
// BorderLayout и GridLayout

Calculator () {
windowContent = new JPanel ();

//задаем схему для этой панели

BorderLayout bl = new BorderLayout();
windowContent.setLayout (bl);

//      создаем и отображаем поле
//      добавляем его в северную область окна

displayField = new JTextField (30);
windowContent.add ("North", displayField);

//создаем кнопки, используя конструктор
//класса JButton, который принимает текст
//кнопки в качестве параметра

button0 = new JButton ("0");
button1 = new JButton ("1");
button2 = new JButton ("2");
button3 = new JButton ("3");
button4 = new JButton ("4");
button5 = new JButton ("5");
button6 = new JButton ("6");
button7 = new JButton ("7");
button8 = new JButton ("8");
button9 = new JButton ("9");
buttonPoint = new JButton (".");
buttonEqual= new JButton ("=");
buttonPlus = new JButton ("+");
buttonMinus = new JButton ("-");
buttonMultiply = new JButton ("*");
buttonDivide = new JButton ("/");


//создаем панель с GridLayout,
//которая содержит 12 кнопок - 10 кнопок с числами,
// кнопки с точкой и знаком равно

pl = new JPanel ();
GridLayout gl = new GridLayout (4, 3);
pl.setLayout (gl);

p2 = new JPanel ();
p2.setLayout (gl);

//добавляем кнопки на панель pl

pl.add (button1);
pl.add (button2);
pl.add (button3);
pl.add (button4);
pl.add (button5);
pl.add (button6);
pl.add (button7);
pl.add (button8);
pl.add (button9);
pl.add (button0);
pl.add (buttonPoint);
p2.add (buttonPlus);
p2.add (buttonMinus);
p2.add (buttonMultiply);
p2.add (buttonDivide);

//помещаем панель pl в цетральную область окна

windowContent.add ("Center", pl);
windowContent.add ("East", p2);

//создаем фрейм и задаем его основную панель

JFrame frame = new JFrame("Calculator");
frame.setContentPane(windowContent);

//делаем размер окна достаточным
//для того, чтобы вместить все компоненты

frame.pack ();

//наконец, отображаем окно

frame.setVisible (true);
}
public static void main ( String [] args) {
	Calculator calc = new Calculator ();
}
}
