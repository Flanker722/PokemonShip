public class ThePokemans{
    private String Name;
    private int Hp;
    private float ArmourPenetration;
    private int Damage;
    private int DropValue;
    public enum PokemanStyle {Fire, Air, Ground, Water}
    PokemanStyle VeryNaceStyle;
    
    ThePokemans(){
        VeryNaceStyle = PokemanStyle.Fire;
        Name = "PhreeKhil";
        Hp = 20;
        Damage = 5;
        ArmourPenetration = 0.0;
        DropValue = 5;
    }
    
    ThePokemans(String _Name, int _Hp, float _ArmourPenetration, int _Damage, int _DropValue, PokemanStyle _VeryNaceStyle){
        VeryNaceStyle = _VeryNaceStyle;
        Name = _Name;
        Hp = _Hp;
        Damage = _Damage;
        ArmourPenetration = _ArmourPenetration;
        DropValue = _DropValue;
    }
}
