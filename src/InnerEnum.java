/**
 * 
 * @author taburiss
 *
 */
public class InnerEnum {
	
	public static void main(String[] args){
		//这里参考内部类的用法，内部enum类似
		TestInnerEnum.Direction d=TestInnerEnum.Direction.EAST;
		System.out.println(d.direction);
	}

}

class TestInnerEnum{
	public enum Direction{
		NORTH(1), SOUTH(2), EAST(3), WEST(4);
		
		int direction;
		Direction(int i){
			this.direction=i;
		}
	}
}
