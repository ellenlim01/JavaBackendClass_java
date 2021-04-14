package sec06.ch07;

public interface MyList {
	public abstract void add (int a);
	int size();//public abstract을 안적어줘도 자동으로 들어감
	int get(int b);
	int remove();
}
