package cn.zwq.fly;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyMain extends JPanel {
	ImageIcon backgroundImg;
	ImageIcon startImg;
	Bird bird;
	int state;//��Ϸ������״̬(1.��Ϸ��ʼ��2.��Ϸ�У�3.��Ϸ����)
	
	//���壬������Ϸ״̬�ĳ���
	public static final int BEFOR_GAME = 0;
	public static final int GAME_ING = 1;
	public static final int GAME_OVER = -1;
	
	//��ʼ����Ϸ��Դ
	public FlyMain(){
		bird = new Bird();//��Ϸһ��ʼҲ�����С����Դ
		backgroundImg = new ImageIcon("img/bg.png");
		startImg = new ImageIcon("img/start.png");
		state = BEFOR_GAME;
	}
	
	//����ͼƬ��ȥ
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(this.backgroundImg.getImage(), 0, 0, null);
		g.drawImage(this.startImg.getImage(), 0, 0, null);
		g.drawImage(bird.birdImg.getImage(), bird.x+(bird.width/2), bird.y+(bird.height/2), null);
	}
	
	//����������Ϸ������
	public void action() {
		while (true) {
			switch (state) {
			case BEFOR_GAME:
				bird.fly();
				break;
			case GAME_ING:
				bird.fly();
				break;
			case GAME_OVER:

				break;
			default:
				break;
			}
			//ÿѭ��һ�ξ��ػ�һ��
			repaint();
			//�߳�ǿ�Ƴ�������200���룬����С������ٶ�
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������Ϸ");
		
		FlyMain panleFlyMain = new FlyMain();
		frame.add(panleFlyMain);//��Ҫ��JPanel���뵽JFrame��
		
		frame.setSize(450,650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرռ��˳�
		frame.setLocationRelativeTo(null);//��ֵ��������Ӧ�þ��У����п���
		frame.setVisible(true);//���ÿɼ�
		panleFlyMain.action();
	}
}
