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
 *��Ϸ�ͻ���
 *@author songwei 
 *@date 2019.8.19
 */
public class GameClient extends Frame{
	
	//����һ��airplane����
	Airplane airplane = new Airplane(100,200,"plane/feiji2.png");
	//���ɿͻ��˴��ڵķ���
	public void launchFrame() {
		//���ô��ڴ�С
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		//���ñ���
		this.setTitle("��ͨ����ս");
		//�����ܷ���ʾ	
		this.setVisible(true);
		//��Ӵ���ͼ��
		Image img = GetImageUtil.getImg("youxi.png");
		this.setIconImage(img);
		//�رմ�����ӹرռ�����
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});		
		}
	//��дpaint����
	@Override
	public void paint(Graphics g) {
		airplane.draw(g);
		 
	}
}


