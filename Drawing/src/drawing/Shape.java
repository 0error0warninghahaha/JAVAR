package drawing;
import java.awt.Color;
import java.awt.Graphics;
public abstract class Shape {
		ElementType Type;//图元类型
		int OrgX;//原点坐标
		int OrgY;
		Color BorderColor;//边界颜色
		int BorderType;//边界线型--实线、虚线、虚点线等
		int BorderWidth;//边界宽度
		Color FillColor;//填充颜色
		int FillType;//填充类型--实心、双对角、十字交叉等
		
		abstract void Draw(Graphics c);//绘制图元
		abstract boolean IsMatched(int pnt);//判断点是否落在图形内部    
		//abstract void Serialize(Object ar);//序列化
		abstract void SetValue(ElementType t,int x,int y,int width,int height);//设置数据成员
		abstract void GetValue(ElementType t,int x,int y,int width,int height);//获取数据成员的值
		
		void SetPen(Color bcolor,int btype,int bwidth) //设置图形对象中与画笔有关的三个数据成员的值
		{BorderColor=bcolor;BorderType=btype;BorderWidth=bwidth;}
		
		void GetPen(Color bcolor,int btype,int bwidth)//获取图形对象中与画笔有关的三个数据成员的值，通过引用参数将值传给实参
		{  bcolor=BorderColor;btype=BorderType;bwidth=BorderWidth;} 
		
		void SetBrush(Color fcolor,int ftype)//设置图形对象中与画刷有关的两个数据成员的值
		{FillColor=fcolor; FillType=ftype;}
		
		void GetBrush(Color fcolor,int ftype)//获取图形对象中与画刷有关的两个数据成员的值 ，通过引用参数将值传给实参
		{  fcolor=FillColor; ftype=FillType;}
		public static void main(String []args) {
		}
}
