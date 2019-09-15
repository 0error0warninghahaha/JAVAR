package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Square extends Shape{
	int width;
		Square(){
			Type=ElementType.SQUARE;
			OrgX=100;//原点坐标
			OrgY=100;
			new Chushihua();
			width=100;}
		
		Square(int x,int y,int w)//构造函数
			{Type=ElementType.SQUARE;
			OrgX=x;//原点坐标
			OrgY=y;
			new Chushihua();
			width=w;}
		
		void Draw(Graphics c)//绘制正方形    
		{
			// 绘制一个矩形（空心）
			c.drawRect(OrgX, OrgY, width, width);
			// 填充一个矩形（实心）
			c.fillRect(OrgX, OrgY, width, width);
			c.setColor(BorderColor);
		}
		
		boolean IsMatched(Point pnt)//重载，点pnt是否落在图元内
		{if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY-width/2)&&(pnt.y <=OrgY+width/2))
			return true;
			else	
				return false;
		}
		
		//void Serialize(CArchive& ar);//序列化正方形图元
		
		void SetValue(ElementType t,int x,int y,int w,int height){
			Type=t; OrgX=x;OrgY=y;width=w;
		}
		
		void GetValue(ElementType t,int x,int y,int w,int h){
			t=Type;x=OrgX;y=OrgY;w=width;h=0;
		}
}
