package drawing;
import java.awt.Color;
import java.awt.Graphics;
public abstract class Shape {
		ElementType Type;//ͼԪ����
		int OrgX;//ԭ������
		int OrgY;
		Color BorderColor;//�߽���ɫ
		int BorderType;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
		int BorderWidth;//�߽���
		Color FillColor;//�����ɫ
		int FillType;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
		
		abstract void Draw(Graphics c);//����ͼԪ
		abstract boolean IsMatched(int pnt);//�жϵ��Ƿ�����ͼ���ڲ�    
		//abstract void Serialize(Object ar);//���л�
		abstract void SetValue(ElementType t,int x,int y,int width,int height);//�������ݳ�Ա
		abstract void GetValue(ElementType t,int x,int y,int width,int height);//��ȡ���ݳ�Ա��ֵ
		
		void SetPen(Color bcolor,int btype,int bwidth) //����ͼ�ζ������뻭���йص��������ݳ�Ա��ֵ
		{BorderColor=bcolor;BorderType=btype;BorderWidth=bwidth;}
		
		void GetPen(Color bcolor,int btype,int bwidth)//��ȡͼ�ζ������뻭���йص��������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ��
		{  bcolor=BorderColor;btype=BorderType;bwidth=BorderWidth;} 
		
		void SetBrush(Color fcolor,int ftype)//����ͼ�ζ������뻭ˢ�йص��������ݳ�Ա��ֵ
		{FillColor=fcolor; FillType=ftype;}
		
		void GetBrush(Color fcolor,int ftype)//��ȡͼ�ζ������뻭ˢ�йص��������ݳ�Ա��ֵ ��ͨ�����ò�����ֵ����ʵ��
		{  fcolor=FillColor; ftype=FillType;}
		public static void main(String []args) {
		}
}
