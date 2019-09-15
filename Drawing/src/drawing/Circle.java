package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Circle extends Shape{
	
	int radius;
	
	Circle() {
			Type = ElementType.CIRCLE;//图元类型
			OrgX = 550;//原点坐标
			OrgY = 100;
			new Chushihua();
			radius = 100;
		}
	
	Circle(int x, int y, int r){
			Type = ElementType.CIRCLE;//图元类型
			OrgX = x;//原点坐标
			OrgY = y;
			new Chushihua();
			radius = r;
		}
	
	void Draw(Graphics c) {//绘制圆   
			// 绘制一个椭圆
			c.drawOval(OrgX, OrgY, radius, radius);
			// 填充一个椭圆
			c.fillOval(OrgX, OrgY, radius, radius);
			c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
		{
			if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
				return true;
			else
				return false;
		}
	
		//virtual void Serialize(CArchive& ar);
		//序列化圆图元
	
	void SetValue(ElementType t,int x,int y,int w,int height)//设置长方形对象中的部分数据成员（与画笔和画刷无关的）的值
		{
			Type=t; OrgX=x;OrgY=y;radius=w;
		}
	
	void GetValue(ElementType t,int x,int y,int w,int height)//获取长方形对象中部分数据成员的值，通过引用参数将值传到实在参数
		{
			t=Type;x=OrgX;y=OrgY;w=radius;
		}

	//DECLARE_SERIAL(CCircle)//声明类CCircle支持序列化
}
