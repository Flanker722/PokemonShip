public class MainManTheCharacterStats{
    private String Name;
    private int Hp;
    private int Money;
    private boolean ArmourOn;
    private int Armour;
    
    MainManTheCharacterStats(){
        Name = "UserNoName";
        Hp = 100;
        Money = 0;
        ArmourOn = false;
        if(ArmourOn == false){
            Armour = 0;
        }
    }
    MainManTheCharacterStats(String _Name, int _Hp, int _Money, boolean _ArmourOn, int _Armour){
        _Name = Name;
        _Hp = Hp;
        _Money = Money;
        _ArmourOn = ArmourOn;
        _Armour = Armour;
    }
    
    public void printDetails(int _int){
        if(_int == 0){
            System.out.print(Name);
        } else if(_int == 1){
            System.out.print(Hp);
        } else if(_int == 2){
            System.out.print(Money);
        } else if(_int == 3){
            System.out.print(Armour);
        } else if(_int == 4){
            System.out.print(ArmourOn);
        }
    }
}

/*
TimerTask task = new TimerTask() {
    @Override
    public void run() {
        try{
            System.out.println("lol");
        } catch (Exception e){
            System.out.print(e);
        }
        System.out.print("done");
    }
};
Timer timer = new Timer();
timer.schedule(task,1*1000);
 timer.cancel();
*/
//String[] lines = password.toString().split("");
//for(String s: lines){
//    System.out.println("Content = " + s);
//    System.out.println("Length = " + s.length());
//}
