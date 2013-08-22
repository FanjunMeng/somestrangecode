
/**
 * 
 * @author taburiss
 * 
 * 计算二进制数字1的个数
 *
 */
public class CountNumberOf1 {
	
	public static void main(String[] args){
		System.out.println(countNumberOf1(5));
	}
	
	private static int countNumberOf1(int x){
		int count=0;
		while(x>0){
			x=x&(x-1);
			count++;
		}
		return count;
	}

}
