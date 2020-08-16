package cn.zwq.fly;

import javax.swing.ImageIcon;

public class Column {
	ImageIcon columnImg;
	int x,y;
	int width,heigth;
	int xSpacing;//两根柱子X坐标的间距
	
	
	//柱子的初始化资源
	//参数n：代表是哪一根柱子(一个界面里面有两根柱子，两个对象)
	public Column(int n) {
		columnImg = new ImageIcon("img/column.png");
		width = columnImg.getIconWidth();
		heigth = columnImg.getIconHeight();
		xSpacing = 280;
		x = (n-1)*xSpacing + 440;
		y = (int) -(Math.random()*300+200);
	}
	
	//柱子的运动
	public void columnRun() {
		x--;
		if(x < -80) {
			x = 460;
//			y = (int) -(Math.random()*300+220);
		}
	}
}
