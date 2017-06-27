import java.util.Scanner;
import java.io.IOException;
public class aliquot {

	public static void main(String[] args){
		 long sum=0;
		for(long num=1;num<100;num++){
			//System.out.println("Factors for "+num);
		for(long i=1;i<=num/2;i++){
			
			if(num%i==0){
				//System.out.println(i);
				sum=sum+i;
			}
		}
		//System.out.println("sum is "+sum);
		if(num==sum){
			 System.out.println(num+" is a perfect number");
			 sum=0;
		}
		else{
			sum=0;
		}
		//System.out.println("===============================================");
		}
	}
}

