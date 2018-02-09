public class trangle {

  public int size;

  public trangle(int s){
    size = s;
  }

  public void draw (){
    for (int i = 0; i < size; i = i + 1){
        for(int j = 0; j < i; j = j + 1){
          System.out.print('*');
        }
        System.out.println('*');
      }
    }

  public static void draw(int size){
    for (int i = 0; i < size; i = i + 1){
        for(int j = 0; j < i; j = j + 1){
          System.out.print('*');
        }
        System.out.println('*');
      }
  }
}
