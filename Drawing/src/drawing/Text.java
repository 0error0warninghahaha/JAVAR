package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Text extends Shape{

	int height;
	int angle;
	String text;
	
	Text(){
		Type = ElementType.TEXT;//ͼԪ����
		OrgX = 100;//ԭ������
		OrgY = 100;
		new Chushihua();
		height = 50;
		angle = 30;
	}
	
	Text(int x, int y, int h, int a, String t){
		Type = ElementType.TEXT;//ͼԪ����
		OrgX = x;//ԭ������
		OrgY = y;
		height = 100;
		angle = 30;
		new Chushihua();

	}
	
	void Draw(Graphics c) {//�����ĵ�   
		// ����һ���ı������� (x, y) ����ָ�����ı����е� ���½� ��λ��
		c.drawString(text, OrgX, OrgY);
	}
	
	boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
	{
		if ((pnt.x >= OrgX /*- radiusa / 2) && (pnt.x <= OrgX + radiusa / 2*/) && (pnt.y >= OrgY /*- radiusb / 2) && (pnt.y <= OrgY + radiusb / 2*/))
			return true;
		else
			return false;
	}
	
	//virtual void Serialize(CArchive& ar);
	//���л��ĵ�ͼԪ
	
	void SetValue(ElementType t,int x,int y,int w,int h){
		Type=t;
		OrgX = x;
		OrgY = y;
		angle = w;
		height = h;
	}
	
	void GetValue(ElementType t, int x, int y, int w, int h){
		t = Type;
		x = OrgX;
		y = OrgY;
		w = angle;
		h = height;
	}
	
	void SetText(String a){
		text=a;
	}
	
	void GetText(String a){
		a=text;
	}

	//DECLARE_SERIAL(CText)//������CText֧�����л�
}
