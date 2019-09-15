package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Square extends Shape{
	int width;
		Square(){
			Type=ElementType.SQUARE;
			OrgX=100;//ԭ������
			OrgY=100;
			new Chushihua();
			width=100;}
		
		Square(int x,int y,int w)//���캯��
			{Type=ElementType.SQUARE;
			OrgX=x;//ԭ������
			OrgY=y;
			new Chushihua();
			width=w;}
		
		void Draw(Graphics c)//����������    
		{
			// ����һ�����Σ����ģ�
			c.drawRect(OrgX, OrgY, width, width);
			// ���һ�����Σ�ʵ�ģ�
			c.fillRect(OrgX, OrgY, width, width);
			c.setColor(BorderColor);
		}
		
		boolean IsMatched(Point pnt)//���أ���pnt�Ƿ�����ͼԪ��
		{if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY-width/2)&&(pnt.y <=OrgY+width/2))
			return true;
			else	
				return false;
		}
		
		//void Serialize(CArchive& ar);//���л�������ͼԪ
		
		void SetValue(ElementType t,int x,int y,int w,int height){
			Type=t; OrgX=x;OrgY=y;width=w;
		}
		
		void GetValue(ElementType t,int x,int y,int w,int h){
			t=Type;x=OrgX;y=OrgY;w=width;h=0;
		}
}
