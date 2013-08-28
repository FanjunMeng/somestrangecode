/**
 * 
 * @author taburiss
 *
 * 在线程中抛出runtime异常不会对main方法造成影响
 * 在抛出runtime之后的代码是不会被执行到的，如果写在后面，编译会报错
 */

public class ThrowRuntimeExceptionInThread implements Runnable{

	@Override
	public void run() {
		System.out.println("run");
		throw new RuntimeException("problem");
	}
	
	public static void main(String[] args){
		Thread t=new Thread(new ThrowRuntimeExceptionInThread());
		t.start();
		System.out.println("end of method");
	}

}
