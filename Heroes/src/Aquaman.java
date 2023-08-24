public class Aquaman extends FabricHero{

    Aquaman(int s, int h){

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
        super.name = "Aquaman";
        super.strength = s;
        super.label = "dc";
    //    super.Abil = "АКВАМЕЕЕЕН!!!";
    }


    public void Ability(int k) {
        super.Ability(k);
        if(k % 4 == 0){
            super.hp = super.hp + super.strength;
        }
    }
    //При использовании супер-способности лечит себе столько хп сколько наносит противнику
        //супер-способность активируется раз в 4 хода

}
