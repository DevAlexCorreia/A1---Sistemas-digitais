import java.util.Random;
public class Animal {
  
  Random random = new Random();
  private Boolean alive;
  private int x;// x-axis motion indicator
  private int y;//y-axis motion indicator
  private int strenght;
  private int velocity;
  private int resistence=100; 
  private int life=100;
  private int stamina=100;
  private int damage;

    public Animal(int velocity, int mass, int strenght){
        this.alive=true;
        this.x=0;
        this.y=0;
        this.strenght=strenght;
        this.velocity=velocity;
        this.resistence=resistence;
        this.life=100;
        this.stamina=stamina;
        this.damage=damage;
    }
    
    public int getstrenght(){
        return this.strenght;
    }
    public void setStrenght(int strenght){
        this.strenght=strenght;
    }
    public int getVelocity(){
        return this.velocity;
    }
    public void setVelocity(int velocity){
        this.velocity=velocity;
    }
    
    public void attack(Animal Tiger){
       do{
        if(this.stamina>0){            
        
        if(this.velocity>Tiger.velocity){
            this.strenght+=5;
    }else{
            Tiger.resistence+=10;
        }
        if(this.strenght>Tiger.resistence){
            Tiger.resistence-=10;
            this.damage=random.nextInt(40);
            Tiger.life-=this.damage;
            this.stamina-=5;
            Tiger.stamina-=20;
            if(Tiger.life==0){
                Tiger.alive=false;
                System.out.println("Tiger was fainted");

            }
        }
    }else{
        Tiger.resistence+=10;
            this.damage=random.nextInt(15);
            Tiger.life-=this.damage;
            this.stamina-=15;
            Tiger.stamina-=15;
            if(Tiger.life==0){
                Tiger.alive=false;
                System.out.println("Tiger was fainted");
    }
}
       
}while(this.stamina==0 || Tiger.stamina==0);
    }   
    public void comer(int mass){}
    public void info(){
        System.out.print("-------------------------------------");
        System.out.printf("The Animals life is now: %d",this.life);
        System.out.printf("A Velocidade do animal é: %d",this.velocity);
        System.out.printf("A Força do animal é: %d",this.strenght);

    }
    
    
}