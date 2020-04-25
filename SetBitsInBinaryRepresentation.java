//In this i gives the how many 1's exists in any binary number
import java.util.*;
public class SetBitsInBinaryRepresentation{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			firstMethod(n);
			secondMethod(n);
		}
	}
	/*
	In FirstMethod
	we take the digit one by one 
		ans+=n&1
	and with the of this we go through all the digits one by one
		n=n>>1
	Time Complexity:-   O(log n)
	*/
	public static void firstMethod(int n){
		int ans=0;
		while(n>0){
			ans+=n&1;
			n=n>>1;
		}
		System.out.println("firstMethod :- "+ans);
	}
	/*
	In Second Method
	we remove the last one from the digit by using
		n=n&(n-1)
	Time Complexity:-O(the set bits in binary number)
	*/
	public static void secondMethod(int n){
		int ans=0;
		while(n>0){
			n=n&(n-1);
			ans++;
		}
		System.out.println("secondMethod  ;- "+ans);
	}
}