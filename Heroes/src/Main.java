import java.lang.reflect.Array;

public class Main {
    static FabricHero[] fabricHeroes = new FabricHero[6];


    public static void main(String[] args) {
        int[] winners = {0, 0, 0, 0, 0, 0};
        String[] winners1 = {"Бетмена", "Аквамена", "Халка", "Человек-Паука", "Супермена", "Росомахи"};

        fabricHeroes[0] = new Batman(10, 200); // 0
        fabricHeroes[1] = new Aquaman(9, 175); // 1
        fabricHeroes[2] = new Hulk(8, 160); // 2
        fabricHeroes[3] = new Superman(7, 150); // 3
        fabricHeroes[4] = new Spiderman(6, 120); // 4
        fabricHeroes[5] = new Wolverine(10, 200); // 5


        for(int i = 0; i < 6; i++){

            for(int j = i; j < 6;j++){

                int count = 0;

                while((fabricHeroes[i].hp >= 0) || (fabricHeroes[j].hp >= 0)){

                    count = count + 1;

                    if(fabricHeroes[i].strength > fabricHeroes[j].strength){

                        fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                        fabricHeroes[i].Ability(count);

                        fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                        fabricHeroes[j].Ability(count);

                    }

                    if(fabricHeroes[j].strength > fabricHeroes[i].strength){

                        fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                        fabricHeroes[j].Ability(count);

                        fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                        fabricHeroes[i].Ability(count);

                    }

                    if(fabricHeroes[j].strength == fabricHeroes[j].strength){

                        if(fabricHeroes[i].hp > fabricHeroes[j].hp){

                            fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                            fabricHeroes[i].Ability(count);

                            fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                            fabricHeroes[j].Ability(count);

                        }

                        if(fabricHeroes[j].hp > fabricHeroes[i].hp){

                            fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                            fabricHeroes[j].Ability(count);

                            fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                            fabricHeroes[i].Ability(count);

                        }

                        if(fabricHeroes[j].hp == fabricHeroes[i].hp){

                            if(fabricHeroes[j].label == "dc"){

                                fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                                fabricHeroes[j].Ability(count);

                                fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                                fabricHeroes[i].Ability(count);

                            }
                            else{

                                fabricHeroes[j].hp = fabricHeroes[j].hp - fabricHeroes[i].strength;
                                fabricHeroes[i].Ability(count);

                                fabricHeroes[i].hp = fabricHeroes[i].hp - fabricHeroes[j].strength;
                                fabricHeroes[j].Ability(count);

                            }

                        }

                    }

                    if(fabricHeroes[i].hp <= 0){
                        winners[j] = winners[j] + 1;
                    }

                    if(fabricHeroes[j].hp <= 0){
                        winners[i] = winners[i] + 1;
                    }

                }

            }

        }

        for(int i = 0; i < 6; i++){
            System.out.println("Количество побед " + winners1[i] + ": " + winners[i]);
        }


    }
}