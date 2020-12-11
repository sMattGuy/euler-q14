
public class Collatz{
	public static void main(String[] args){
		int maxChain=0;
		int maxNumber=0;
		for(int i=1000000;i>500000;i--){
			int chain = 0;
			long working = i;
			while(working!=1){
				if(working%2==0){
					working = working/2;
					chain++;
					if(working<0){
						System.out.println("Overflow:"+working);
						return;
					}
				}
				else{
					working = (working*3)+1;
					chain++;
				}
			}
			if(chain>maxChain){
				maxChain = chain;
				maxNumber=i;
			}
			System.out.print("Progress:500000/"+i+"\r");
		}
		System.out.println("\nAnswer:"+maxNumber+"\nChain Length:"+maxChain);
	}
}