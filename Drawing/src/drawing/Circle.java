package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Circle extends Shape{
	
	int radius;
	
	Circle() {
			Type = ElementType.CIRCLE;//ͼԪ����
			OrgX = 550;//ԭ������
			OrgY = 100;
			new Chushihua();
			radius = 100;
		}
	
	Circle(int x, int y, int r){
			Type = ElementType.CIRCLE;//ͼԪ����
			OrgX = x;//ԭ������
			OrgY = y;
			new Chushihua();
			radius = r;
		}
	
	void Draw(Graphics c) {//����Բ   
			// ����һ����Բ
			c.drawOval(OrgX, OrgY, radius, radius);
			// ���һ����Բ
			c.fillOval(OrgX, OrgY, radius, radius);
			c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
		{
			if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
				return true;
			else
				return false;
		}
	
		//virtual void Serialize(CArchive& ar);
		//���л�ԲͼԪ
	
	void SetValue(ElementType t,int x,int y,int w,int height)//���ó����ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
		{
			Type=t; OrgX=x;OrgY=y;radius=w;
		}
	
	void GetValue(ElementType t,int x,int y,int w,int height)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
		{
			t=Type;x=OrgX;y=OrgY;w=radius;
		}

	//DECLARE_SERIAL(CCircle)//������CCircle֧�����л�
}
