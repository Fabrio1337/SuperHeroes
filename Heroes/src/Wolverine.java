public class Wolverine extends FabricHero{


    Wolverine(int s, int h){

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
        super.name = "Wolverine";
        super.strength = s;
        super.label = "dc";
        super.Abil = super.strength + 2;
    }


    public void Ability(int k) {
        super.Ability(k);
        int s = 0;
        if(super.Abil == super.strength){
            s = super.strength - 2;
        }
        else{
            s = super.strength;
        }
        if(k % 3 == 0){
            s = super.strength;
            super.strength = super.Abil;
        }
        else{
            super.strength = s;
        }
    }

    //При использовании супер-способности у противника начинается кровотечение, противник кровоточит 3 хода
        //кровотечение наносит 2 урона
        //супер-способность активируется раз в 7 ходов
}
