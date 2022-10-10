import java.util.Scanner;
public class ttt {
  public static void main(String[] args) {
        
    
    Slot[][]ttt = new Slot[3][3];
    
    char symbolver = 'X';
    Boolean Game = true;
    String Win = "";
    Scanner input = new Scanner(System.in);

    initGame(ttt);

    while(Game){
        Redraw(ttt);
        Win = winVerify(ttt);
        if(!Win.equals("")){
            System.out.println("Player %s Wins");
            break;
        }
        try{
            if(playVerify(ttt, Play(input, symbolver), symbolver)){
                if(symbolver == 'X'){
                    symbolver = 'O';
                }else{
                    symbolver = 'X';
                }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
        System.out.println("Game Over!");
  }
  
  public static void Redraw(Slot[][] ttt){
        Cls();
        System.out.println("    0    1    2");
        System.out.printf("0  %c  |  %c  |  %c \n",ttt[0][0].getSymbol(),ttt[0][1].getSymbol(),ttt[0][2].getSymbol()); 
        System.out.println("___________________");           
        System.out.printf("1  %c  |  %c  |  %c \n",ttt[1][0].getSymbol(),ttt[1][1].getSymbol(),ttt[1][2].getSymbol());  
        System.out.println("___________________"); 
        System.out.printf("2  %c  |  %c  |  %c \n",ttt[2][0].getSymbol(),ttt[2][1].getSymbol(),ttt[2][2].getSymbol());                  
    
  }
  public static void Cls(){
    for(int i =0; i<200;i++){
        System.out.println(" ");
    }    
  }
  public static int[] Play(Scanner input, char symbolver){
    int[] p = new int[2];
    System.out.printf("%s %c%n","Who plays: ", symbolver);
    System.out.println("Report line");
    p[0] = input.nextInt();
    System.out.println("Report Column");
    p[1] = input.nextInt();
    return p;
  }

  public static Boolean playVerify(Slot[][] ttt, int[] p , char symbolver){
    if(ttt[p[0]][p[1]].getSymbol() == ' ' ){
        ttt[p[0]][p[1]].setSymbol(symbolver);
        return true;
    }else{
        return false;
    }
  }
  public static void initGame(Slot[][] ttt){
    for(int l=0;l<3;l++){
        for(int c=0;c<3;c++){
          ttt[l][c]=new Slot();
        }
    }
  }
  public static String winVerify(Slot[][] ttt){// Verificador de vitória
    return "";
  }
}
