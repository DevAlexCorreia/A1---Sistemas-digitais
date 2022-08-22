import java.util.Random;
public class Animal {
  
  Random random = new Random();
  private Boolean alive;
  //private int x;// x-axis motion indicator
  //private int y;//y-axis motion indicator
  private int strenght;
  private int velocity;
  private int resistence=100; 
  private int life=100;
  private int stamina=100;
  private int damage;

    public Animal(int velocity, int stamina, int strenght){
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
    public int getResistence(){
        return this.resistence;
    }
    public void setResistence(int resistence){
        this.resistence=resistence;
    }
    public int getLife(){
        return this.life;
    }
    public void setLife(int life){
        this.life=life;
    }
    public int getStamina(){
        return this.stamina;
    }
    public void setStamina(int stamina){
        this.stamina=stamina;
    }
    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
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
        System.out.printf("The Animals life is now: %d\n",this.alive);
        System.out.printf("A Velocidade do animal é: %d\n",this.stamina);
        System.out.printf("A Força do animal é: %d\n",this.life);

    }
    
    
}