package com.neuedu.client;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.neuedu.costant.Constant;
import com.neuedu.entity.Airplane;
import com.neuedu.util.GetImageUtil;

/**
 *游戏客户端
 *@author songwei 
 *@date 2019.8.19
 */
public class GameClient extends Frame{
	
	//创建一个airplane对象
	Airplane airplane = new Airplane(100,200,"plane/feiji2.png");
	//生成客户端窗口的方法
	public void launchFrame() {
		//设置窗口大小
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		//设置标题
		this.setTitle("卡通大作战");
		//设置能否显示	
		this.setVisible(true);
		//添加窗口图标
		Image img = GetImageUtil.getImg("youxi.png");
		this.setIconImage(img);
		//关闭窗口添加关闭监听器
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});		
		}
	//重写paint方法
	@Override
	public void paint(Graphics g) {
		airplane.draw(g);
		 
	}
}


