package cn.zwq.fly;

import javax.swing.ImageIcon;

public class Bird {
	ImageIcon birdImg;//鸟的每一帧的图片(一共八张图)
	ImageIcon birdImgs[];//图片集数组;每一帧都在图片集俩面切换
	int x,y;
	int width,height;//鸟的长宽
	//上抛运动的需求
	int v0;//上抛初速度
	double t;//上抛时间
	double g;//重力加速度
	int s;//上抛的距离
	int index;//数组下标，以用于图片取出使用。
	
	
	//初始化小鸟各种参数
	public Bird() {
		this.x = 70;
		this.y = 210;
		birdImg = new ImageIcon("img/0.png");
		//初始化图片集数组(有8张图片)
		birdImgs = new ImageIcon[8];
		//使用for循环读取每一张图片,初始化图片集数组。
		for(int i = 0;i < birdImgs.length;i++) {
			birdImgs[i] = new ImageIcon("img/"+i+".png");	
		}
		
		width = birdImg.getIconWidth();//获取图片宽度
		height = birdImg.getIconHeight();//获取图片高度
		v0 = 5;
		t = 0.5;
		g = 10;
		
	}
	
	//鸟飞的变换动作
	public void fly() {
		index++;//图片不断的变化
		//不断的替换图片，是鸟产生飞的动作
		birdImg = birdImgs[index%8];
		//此时index%8的结果始终是在0~7之间的正整数余数，所以结果必然是0~7之间的图片
	}
	//上抛运动
	public void birdrun() {
		
	}
	//鸟撞击地面
	public void hitGround() {
		
	}
	//鸟撞击柱子
	public void hitColum() {
		
	}
}
