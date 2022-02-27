//Digital root is the recursive sum of all the digits in a number.
//Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

public class DRoot {
  public static int digital_root(int n) {
    String characters = n + "";
    int answer=0;

    if(n<10){
      return n;
    } else{
      String[] array = characters.split(""); 
      for(int i=0; i<array.length;++i){
        answer+=Integer.parseInt(array[i]);
      }
      if(answer<10){
         return answer;
      } else{
        return digital_root(answer);
      }
    } 
  }
}
