package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Ellipse extends Shape{
	
	int radiusa;
	int radiusb;
	
	Ellipse(){
		Type = ElementType.ELLIPSE;//ͼԪ����
		OrgX = 200;//ԭ������
		OrgY = 200;
		new Chushihua();
		radiusa = 25;
		radiusb = 50;
	}
	
	Ellipse(int x, int y, int sa, int sb){
		Type = ElementType.ELLIPSE;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		new Chushihua();
		radiusa = sa;
		radiusb = sb;
	}
	
	void Draw(Graphics c) {//������Բ   
		// ����һ����Բ
		c.drawOval(OrgX, OrgY, radiusa, radiusb);
		// ���һ����Բ
		c.fillOval(OrgX, OrgY, radiusa, radiusb);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//���أ���pnt�Ƿ�����ͼԪ��
		if ((pnt.x >= OrgX - radiusa / 2) && (pnt.x <= OrgX + radiusa / 2) && (pnt.y >= OrgY - radiusb / 2) && (pnt.y <= OrgY + radiusb / 2))
			return true;
		else
			return false;
	}
	
	//virtual void Serialize(CArchive& ar);
	//���л���ԲͼԪ
	
	void SetValue(ElementType t,int x,int y,int w,int h){//���ó����ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
		Type=t; OrgX=x;OrgY=y;radiusa=w;radiusb=h;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int h)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
	{
		t=Type;x=OrgX;y=OrgY;w=radiusa;h=radiusb;
	}

	//DECLARE_SERIAL(CEllipse)//������CEllipse֧�����л�
}
