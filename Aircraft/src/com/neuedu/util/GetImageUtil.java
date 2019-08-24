package com.neuedu.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 *��ȡͼƬ�Ĺ�����
 *@version0.1
 *@author songwei 
 *@date 2019.8.19
 */
public class GetImageUtil {
	//URL
	//��ȡͼƬ�ķ���
	public static Image getImg(String imgName) {
		//����
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
