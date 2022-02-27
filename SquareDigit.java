// In this kata, you are asked to square every digit of a number and concatenate them.
// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

public class SquareDigit {
  public int squareDigits(int n) {
    String[] array = (n+"").split("");
    String answer = "";
    
    for(int i=0; i<array.length;++i){
      int square = Integer.parseInt(array[i])*Integer.parseInt(array[i]);
      answer+=square;
    }
    return Integer.valueOf(answer);
  }
}
