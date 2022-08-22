public class Animal {
    
  private Boolean vivo;
  private int massa;
  private int x;// x-axis motion indicator
  private int y;//y-axis motion indicator
  private int vel;
  private int forca;
  private int vida;
    public Animal(int vel, int massa, int forca){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.vel=vel;
        this.forca=forca;
        this.vida=100;
    }
    public int getMassa(){
        return this.massa;
    }
    public void setMassa(int massa){
        this.massa=massa;
    }
    public int getForca(){
        return this.forca;
    }
    public void setForca(int forca){
        this.forca=forca;
    }
    public int getVel(){
        return this.vel;
    }
    public void setvel(int vel){
        this.vel=vel;
    }
    
    public void atacar(){
        
    }
    public void mover(){
        if(this.vivo){
            this.x+=this.vel;
            this.y+=this.vel;

        }
    }
    public void comer(int massa){}
    public void info(){
        System.out.print("-------------------------------------");
        System.out.printf("A Vida do animal é: %d",this.vida);
        System.out.printf("A Velocidade do animal é: %d",this.vel);
        System.out.printf("A Força do animal é: %d",this.forca);

    }
    

}