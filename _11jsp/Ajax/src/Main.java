import java.util.Scanner;

public class Main {

	private int top;
	private static int[] stackArray;
	private static String[] ansArray;
	
	public Main() {
		this.top = -1;
		stackArray = new int[100000];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		System.out.print("숫자를 입력하시오 : ");
		int orderNum = 6; 
				//sc.nextInt();
		ansArray = new String[orderNum];
		
		for(int i=0; i<orderNum; ++i){
			ansArray[i] = sc.next();
		}
		
		for(int i=0; i<orderNum; ++i){
			if(m.isVPS(ansArray[i])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
		sc.close();
		
	}
	
	public boolean isVPS(String str){
		for(int i=0; i<str.length(); ++i){
			if(str.charAt(i) == '('){
				push(1);
			}else{
				pop();
			}
		}
		
		return top==-1 ? true : false;
	}
	
	public int empty(){
		if(top == -1){
			return 1;
		}else{
			return 0;
		}
	}
	
	public void push(int item){
        
        stackArray[++top] = item;
    }
	
	public int top(){
	    
		if(top == -1){
			//System.out.println(-1);
			return -1;
		}else{
			//System.out.println(stackArray[top]);
			return stackArray[top];
		}
	        
		
	}
	
	public int size(){
		System.out.println(top+1);
		return top+1;
	}
	 
	public int pop(){
        
		if(top == -1){
			return -1;
		}else{
			int item = stackArray[top];
			top--;
			return item;
		}
        
       
    }


}
