package cn.zwq.fly;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Blob;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyMain extends JPanel {
	ImageIcon backgroundImg;
	ImageIcon startImg;
	Bird bird;
	Ground ground;
	int score;//游戏分数
	int state;//游戏的三种状态(1.游戏开始；2.游戏中；3.游戏结束)
	
	//定义，控制游戏状态的常量
	public static final int BEFOR_GAME = 0;
	public static final int GAME_ING = 1;
	public static final int GAME_OVER = -1;
	
	//初始化游戏资源
	public FlyMain(){
		bird = new Bird();//游戏一开始也会加载小鸟资源
		ground = new Ground();//游戏开始加载地面资源
		backgroundImg = new ImageIcon("img/bg.png");
		startImg = new ImageIcon("img/start.png");
		state = BEFOR_GAME;
		score = 0;
	}
	
	//绘制图片进去
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(this.backgroundImg.getImage(), 0, 0, null);
		g.drawImage(this.startImg.getImage(), 0, 0, null);
		g.drawImage(bird.birdImg.getImage(), bird.x+(bird.width/2), bird.y+(bird.height/2), null);
		g.drawImage(ground.groundimg.getImage(), ground.x, ground.y, null);

		//分数字体设置
		Font font = new Font("微软雅黑", Font.BOLD, 18);
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("分数："+score, 10, 20);
	}
	
	//控制整个游戏的运行
	public void action() {
		while (true) {
			switch (state) {
			case BEFOR_GAME:
				bird.fly();
				ground.groundRun();
				break;
			case GAME_ING:
				bird.fly();
				ground.groundRun();
				break;
			case GAME_OVER:

				break;
			default:
				break;
			}
			//每循环一次就重绘一次
			repaint();
			//线程强制程序休眠200毫秒，降低小鸟飞行速度
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("飞鸟游戏");
		
		FlyMain panleFlyMain = new FlyMain();
		frame.add(panleFlyMain);//需要将JPanel加入到JFrame中
		
		frame.setSize(450,620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭即退出
		frame.setLocationRelativeTo(null);//空值代表设置应用居中，可有可无
		frame.setVisible(true);//设置可见
		panleFlyMain.action();
	}
}
