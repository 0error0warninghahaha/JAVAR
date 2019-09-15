package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Rectangle extends Shape{
	int width;
	int height;
	
	//DECLARE_SERIAL(CRectangle)//声明类CRectangle支持序列化
	
	Rectangle(){
		Type=ElementType.RECTANGLE;
		OrgX=100;//原点坐标
		OrgY=100;
		new Chushihua();
		width=100;
		height=50;
	}
	
	Rectangle(int x, int y, int w, int h){
		Type=ElementType.RECTANGLE;
		OrgX=x;//原点坐标
		OrgY=y;	
		new Chushihua();
		width=w;height=h;
	}
	
	void Draw(Graphics c){//绘制长方形
		// 绘制一个矩形（空心）
		c.drawRect(OrgX, OrgY, width, width);	
		// 填充一个矩形（实心）
		c.fillRect(OrgX, OrgY, width, width);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//重载，点pnt是否落在图元内
		if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY- height/2)&&(pnt.y <=OrgY+height/2))
			return true;
			else	
				return false;
	}
	
	//virtual void Serialize(CArchive& ar);//序列化长方形图元
	
	void SetValue(ElementType t,int x,int y,int w,int h) {
		Type=t; OrgX=x;OrgY=y;width=w;height=h;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int h) {
		t=Type;x=OrgX;y=OrgY;w=width;h=height;
	}

}
