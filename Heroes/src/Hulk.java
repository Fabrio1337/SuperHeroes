public class Hulk extends FabricHero{


    Hulk(int s, int h){

        if(s > 10){
            s = 10;
        }

        if(h > 200){
            h = 200;
        }

        if(s < 0){
            s = 1;
        }

        if(h < 0){
            h = 20;
        }

        super.hp = h;
        super.name = "Hulk";
        super.strength = s;
        super.label = "marvel";
    //    super.Abil = "ААААААРРГХХ!!";
    }


    public void Ability(int k) {
        super.Ability(k);
        if(super.hp < 20){
            super.strength = super.strength * 3;
        }
    }

    //супер-способность активируется если у халка меньше 20 хп, если супер-способность активна, то его урон увеличивается в 3 раза

}
