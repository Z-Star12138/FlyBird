package cn.zwq.fly;

import javax.swing.ImageIcon;

public class Bird {
	ImageIcon birdImg;//���ÿһ֡��ͼƬ(һ������ͼ)
	ImageIcon birdImgs[];//ͼƬ������;ÿһ֡����ͼƬ�������л�
	int x,y;
	int width,height;//��ĳ���
	//�����˶�������
	int v0;//���׳��ٶ�
	double t;//����ʱ��
	double g;//�������ٶ�
	int s;//���׵ľ���
	int index;//�����±꣬������ͼƬȡ��ʹ�á�
	
	
	//��ʼ��С����ֲ���
	public Bird() {
		this.x = 70;
		this.y = 210;
		birdImg = new ImageIcon("img/0.png");
		//��ʼ��ͼƬ������(��8��ͼƬ)
		birdImgs = new ImageIcon[8];
		//ʹ��forѭ����ȡÿһ��ͼƬ,��ʼ��ͼƬ�����顣
		for(int i = 0;i < birdImgs.length;i++) {
			birdImgs[i] = new ImageIcon("img/"+i+".png");	
		}
		
		width = birdImg.getIconWidth();//��ȡͼƬ���
		height = birdImg.getIconHeight();//��ȡͼƬ�߶�
		v0 = 5;
		t = 0.5;
		g = 10;
		
	}
	
	//��ɵı任����
	public void fly() {
		index++;//ͼƬ���ϵı仯
		//���ϵ��滻ͼƬ����������ɵĶ���
		birdImg = birdImgs[index%8];
		//��ʱindex%8�Ľ��ʼ������0~7֮������������������Խ����Ȼ��0~7֮���ͼƬ
	}
	//�����˶�
	public void birdrun() {
		
	}
	//��ײ������
	public void hitGround() {
		
	}
	//��ײ������
	public void hitColum() {
		
	}
}
