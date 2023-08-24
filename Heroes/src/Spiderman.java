public class Spiderman extends FabricHero{

    Spiderman(int s, int h){

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
        super.name = "Spider-man";
        super.strength = s;
        super.label = "marvel";
      //  super.Abil = "ТУК ТУК ТУК, Я ЧЕЛОВЕК ПАУК!";

    }

    public void Ability(int k) {
        super.Ability(k);

        int h = super.StartHp;
        int l = k - 1;

        if(l == 0){
            l = 1;
        }

        int difference = (h - super.hp) / l;

        if(k % 4 == 0){
            super.hp = super.hp + difference;
        }

    }

    //При использовании супер-способности противник промахивается следующим ударом
    //супер-способность активируется раз в 4 хода


}
