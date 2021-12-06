package java211129;

class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() { //ObjectŬ������ toString() �޼��带 �������̵�.
		return this.x+", "+this.y;
	}
	public boolean equals(Object obj) {//ObjectŬ������ equals() �޼��带 �������̵�.
		Point p=(Point)obj;	//�Է¹��� obj�� Point�� �ٿ�ĳ����
		if(x==p.x&&y==p.y)return true; //ȣ���� ��ü�� x�� �Է¹��� ��ü�� x�� ���� ȣ���� ��ü�� y�� �Է¹��� ��ü�� y�� ���ٸ� true;
		else return false;	//�ƴ϶�� false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());//PointŬ������ �������̵� ���� �ʾҴٸ� ObjectŬ�������� ���ǵ� �Լ� ȣ��.
		System.out.println(obj);			//=>java211129.Point@15db9742
	}
	public static void main(String[] args) {
		Point p= new Point(2,3);
		print(p);
		Point a=new Point(2,3);
		Point b=new Point(3,4);
		if(a==b) System.out.println("a==b");//false
		if(a.equals(p)) System.out.println("a equals p");//true
		if(a.equals(b)) System.out.println("a equals b");//false
		System.out.println("--------------------------");
		a=b;
		if(a.equals(b)) System.out.println("a equals b");//true
	}

}
