
public class Array1 {

	public static void main(String[] args) {

		Integer[] data = { 100, 200, 300, 400, null };
		shiftToTheRight(data);
		for( int i : data) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//shiftToTheLeft(data);
		for( int i : data) {
		System.out.println(i);
		}
		
		
	}


	   public static Integer[] shiftToTheRight(Integer[] array){
	        int i = array.length - 1 ;
	        while( i > 0 ){
	            array[i--] = array[i];
	        }
	        array[i] = null;
	        return array;
	    }
	   
	    //Integer[] data = { 100, 200, 300, 400, null };	
	    public static Integer[] shiftToTheLeft(Integer[] array){
	        int i = 0;
	        while( i < array.length -1 ){
	            array[i++] = array[i];
	        }
	       array[i] = null;
	        return array;
	    }
}
