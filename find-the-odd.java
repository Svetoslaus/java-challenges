public class FindOdd {

  public static int findIt(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int number = arr[i];
			int cases = 0;
			
			for (int j = 0; j < arr.length; j++){
				if (arr[j] == number){
					cases++;
				}
			} 
			
			if (cases % 2 != 0){
				return number;
			}
		
		}
		
		return 0;
	  }
  }
