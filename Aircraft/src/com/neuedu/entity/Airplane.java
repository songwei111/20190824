package com.neuedu.entity;

import java.awt.Graphics;

import com.neuedu.actiion.ActionAble;
import com.neuedu.util.GetImageUtil;

/**
 *创建一个飞机类
 *@author songwei 
 *@date 2019.8.20
 */
public class Airplane extends GameObj implements ActionAble{
	
	public Airplane(){
		
	}
    public Airplane(int x,int y,String imgName){
    	this.x = x;
    	this.y = y;
    	this.img = GetImageUtil.getImg(imgName);
    	
    }
    @Override
    public void move(){
    	
    }
    @Override
    public void draw(Graphics g) {
		g.drawImage(img, x, y, null);

	}
}
