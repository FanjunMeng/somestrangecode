/**
 * 
 * @author taburiss
 * 
 */
public class NewInnerClass {

	public static void main(String[] args) {
		// 可以这样new static的静态内部类
		TestNewInnerClass.StaticInnerClass a = new TestNewInnerClass.StaticInnerClass();

		// 不能像上面那样创建非静态内部类，必须首先实例化外部类
		TestNewInnerClass nic = new TestNewInnerClass();
		TestNewInnerClass.InnerClass b = nic.new InnerClass();
	}

}

class TestNewInnerClass {

	public class InnerClass {
	}

	public static class StaticInnerClass {
	}

}
