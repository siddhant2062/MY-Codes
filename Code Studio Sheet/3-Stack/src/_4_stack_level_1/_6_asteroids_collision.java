package _4_stack_level_1;
import java.util.*;
public class _6_asteroids_collision {
	
	public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
      
        for(int i=0;i<asteroids.length;i++){
            while(!stack.isEmpty()&&i!=asteroids.length&&asteroids[i]<0&&stack.peek()>0){
                           
                if(asteroids[i]+stack.peek()==0) {
                	stack.pop();
                	i++;
                }else {
                	if(Math.abs(asteroids[i])>Math.abs(stack.peek())) {
                		stack.pop();
                	}else {
                		i++;
                	}
                }
            }
            if(i!=asteroids.length){
                    stack.push(asteroids[i]);
                }

        }
        
        int ans[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;

    }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(asteroidCollision(arr)));
		
	}
}
