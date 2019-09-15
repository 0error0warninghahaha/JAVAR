package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Triangle extends Shape{

	int width;
	
	Triangle(){
		Type = ElementType.TRIANGLE;//ͼԪ����
		OrgX = 100;//ԭ������
		OrgY = 100;
		new Chushihua();
		width = 100;
	}
	
	Triangle(int x, int y, int w){

		Type = ElementType.TRIANGLE;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		new Chushihua();
		width = w;
	}
	
	void Draw(Graphics c) {//����������   
		int px1[]={100,500,650};
		int py1[]={100,200,300};
		// ���ݸ����Ķ�����������һ������Σ���β������
		c.drawPolygon(px1,py1,3);
		// ���ݸ����Ķ�����������һ������Σ���β������
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//���أ���pnt�Ƿ�����ͼԪ��
		if ((pnt.x >= OrgX - width / 2) && (pnt.x <= OrgX + width / 2) && (pnt.y >= OrgY - width / 2) && (pnt.y <= OrgY + width / 2))
			return true;
		else
			return false;
	}
	
//	virtual void Serialize(CArchive& ar);

	void SetValue(ElementType t,int x,int y,int w,int height){ //���ó����ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
		Type=t; OrgX=x;OrgY=y;width=w;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int height){ //��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
		t=Type;x=OrgX;y=OrgY;w=width;
	}

	//DECLARE_SERIAL(CTriangle)//������CTriangle֧�����л�
}
