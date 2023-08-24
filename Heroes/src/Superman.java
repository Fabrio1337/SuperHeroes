public class Superman extends FabricHero{


    Superman(int s, int h){

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
        super.StartHp = h;
        super.name = "Superman";
        super.strength = s;
        super.label = "dc";
        super.count = 0;
    //    super.Abil = "ТУДУДУ";
    }

    public void Ability(int k) {
        super.Ability(k);
        int h = super.StartHp;
        int l = k - 1;

        if(l == 0){
            l = 1;
        }

        int difference = (h - super.hp) / l;

        if(k < 5){
            super.count = difference;
        }
        else{
            difference = super.count;
        }


        if(k % 5 == 0){
            super.hp = super.hp + (difference - 1);
        }

    }

    //При использовании супер-способности снижает любой получаемый урон до 1
    //супер-способность активируется раз в 5 ходов


}
