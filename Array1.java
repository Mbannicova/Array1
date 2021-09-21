public class Array1 {

 public static void main(String[] args) {
  Integer[] data = { 100, 200, 300, 400, null };

  shiftToTheRight(data);
  for( Object i : data) {
   System.out.println(i);
  }

        System.out.println("------------------");
  
  shiftToTheLeft(data);
  for( Object i : data) {
      System.out.println(i);
  }  
 }
	
// 1. Создается метод с массивом, принимающим значения массива типа integer/
// 2. Создается цикл, в котором переменной i присваивается длина массива - 1, при этом i не должно быть равно нулю.  
// 3. i шагает в начало массива и заменяет значение ячейки ранее стоящей на значение ячейки впереди стоящей.
// 4. Последней ячейке с индексом [0] присваивается значение null;
// 5. Измененный массив возвращается в main.
	
	
 public static Integer[] shiftToTheRight(Integer[] array){
     for ( int i = array.length - 1; i > 0; i-- ){
         array[i] = array[i - 1];
     }
     array[0] = null;
     return array;
 }

    public static Integer[] shiftToTheLeft (Integer[] array){
        for ( int i = 1; i < array.length; i++ ){
            array[i -1] = array[i];
        }
        array[array.length - 1] = null;
        return array;
    }
    
   
}
//Примитивные целые числа Java не могут быть null , но класс Integer ,
//который обертывает примитив int , может быть  с null.
