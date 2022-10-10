public class Slot {
    private char symbol;

    public Slot(){// Constructor
    this.symbol = ' ';
    }
    public char getSymbol(){
        return this.symbol;
    }
    public void setSymbol(char symbol){
        if(this.symbol == ' '){
            this.symbol=symbol;
        }else{
            System.out.println("Occupied Space !");
        }
    }
}
