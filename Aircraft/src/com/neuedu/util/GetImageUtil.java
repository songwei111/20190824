package com.neuedu.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 *获取图片的工具类
 *@version0.1
 *@author songwei 
 *@date 2019.8.19
 */
public class GetImageUtil {
	//URL
	//获取图片的方法
	public static Image getImg(String imgName) {
		//反射
		URL resource = GetImageUtil.class.getClassLoader().getResource("com/neuedu/img/"+imgName);
		BufferedImage bufferedImage = null;
		try {
			bufferedImage = ImageIO.read(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bufferedImage;
	}

}
