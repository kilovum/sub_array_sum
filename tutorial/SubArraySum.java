public class SubArraySum{
	public static void main(String args[]){
		int A[] = {1,0,0,7};
		int X = 7;
		System.out.println(new SubArraySum().count1(A,X));
		System.out.println(new SubArraySum().count2(A,X));
	}
	//O(N^3) solution
	int count1(int A[],int X){
		int count = 0;
		int sum = 0;
		int N = A.length;
		for(int i = 0;i < N;i++){
			for(int j = i;j < N;j++){
				sum = 0;
				for(int k = i;k <= j;k++){
					sum += A[k];
				}
				if(sum == X){
					count++;
				}
			}
		} 
		return count;
	}

	//O(N^2) solution
	int count2(int A[],int X){
		int count = 0;
		int sum = 0;
		int N = A.length;
		for(int i = 0;i < N;i++){
			sum = 0;
			for(int j = i;j < N;j++){
				sum += A[j];
				if(sum == X){
					count++;
				}
			}
		} 
		return count;
	}
}
