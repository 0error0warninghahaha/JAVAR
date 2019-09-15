package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Rectangle extends Shape{
	int width;
	int height;
	
	//DECLARE_SERIAL(CRectangle)//������CRectangle֧�����л�
	
	Rectangle(){
		Type=ElementType.RECTANGLE;
		OrgX=100;//ԭ������
		OrgY=100;
		new Chushihua();
		width=100;
		height=50;
	}
	
	Rectangle(int x, int y, int w, int h){
		Type=ElementType.RECTANGLE;
		OrgX=x;//ԭ������
		OrgY=y;	
		new Chushihua();
		width=w;height=h;
	}
	
	void Draw(Graphics c){//���Ƴ�����
		// ����һ�����Σ����ģ�
		c.drawRect(OrgX, OrgY, width, width);	
		// ���һ�����Σ�ʵ�ģ�
		c.fillRect(OrgX, OrgY, width, width);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//���أ���pnt�Ƿ�����ͼԪ��
		if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY- height/2)&&(pnt.y <=OrgY+height/2))
			return true;
			else	
				return false;
	}
	
	//virtual void Serialize(CArchive& ar);//���л�������ͼԪ
	
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t; OrgX=x;OrgY=y;width=w;height=h;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;x=OrgX;y=OrgY;w=width;h=height;
	}

}
