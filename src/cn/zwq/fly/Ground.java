package cn.zwq.fly;

import javax.swing.ImageIcon;

public class Ground {
	ImageIcon groundimg;
	int x,y;
	int width,height;
	
	//构造方法，加载地面资源
	public Ground() {
		groundimg = new ImageIcon("img/ground.png");
		width = groundimg.getIconWidth();
		height = groundimg.getIconHeight();
		x = 0;
		y = 490;
	}
	
	//让地面运动
	public void groundRun() {
		x -=5;
		if(x<-200) {
			x = 0;
		}
	}
	
}
