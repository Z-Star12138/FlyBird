package cn.zwq.fly;

import javax.swing.ImageIcon;

public class Column {
	ImageIcon columnImg;
	int x,y;
	int width,heigth;
	int xSpacing;//��������X����ļ��
	
	
	//���ӵĳ�ʼ����Դ
	//����n����������һ������(һ�������������������ӣ���������)
	public Column(int n) {
		columnImg = new ImageIcon("img/column.png");
		width = columnImg.getIconWidth();
		heigth = columnImg.getIconHeight();
		xSpacing = 280;
		x = (n-1)*xSpacing + 440;
		y = (int) -(Math.random()*300+200);
	}
	
	//���ӵ��˶�
	public void columnRun() {
		x--;
		if(x < -80) {
			x = 460;
//			y = (int) -(Math.random()*300+220);
		}
	}
}
