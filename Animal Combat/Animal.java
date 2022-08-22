import java.util.Random;
public class Animal {
  
  Random random = new Random();
  private Boolean alive=true;
  //private int x;// x-axis motion indicator
  //private int y;//y-axis motion indicator
  private int strenght=100;
  private int velocity;
  private int resistence=50; 
  private int life=100;
  private int stamina=100;
  private int damage;

    public Animal(int velocity, int stamina, int strenght){
    }   
    //______________________________________SET's and GET's_______________________________________________________
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
    //____________________________________________ATTACK FUNCTION______________________________________________________
    public void attack(Animal Tiger){
       
        if(this.stamina>0){ // if stamina is higher then 0 so you can go foward           
        
        if(this.velocity>Tiger.velocity){ // if your velocity is higher then your enemy's so you can go foward
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
    }else{// 
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
   
    }   
//_________________________________________INFORMATION FUNCTION___________________________________________________  
    public void info(){
        System.out.print("-------------------------------------");
        System.out.printf("Animals Stamina is now: %d\n",this.stamina);
        System.out.printf("Animals Life is: %d\n",this.life);
        System.out.printf("Animals resistence is: %d\n",this.resistence);
    }
    
    
}