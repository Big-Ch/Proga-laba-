package lab3;

import lab3.Characters.*;
import lab3.Kucha_mala.*;
import lab3.Sounds.*;

public class Main {

    public static void main(String[] args) {

        NormalCharacter christoferRobin = new NormalCharacter("Christofer Robin");
        NormalCharacter puh = new NormalCharacter("Puh");
        NormalCharacter piglet = new NormalCharacter("Piglet");
        NormalExtendedSensitiveSwimmingCharacter tigra =
                new  NormalExtendedSensitiveSwimmingCharacter("Tigra");
        NormalCharacter iaIa = new NormalCharacter("Ia Ia");

        tigra.holdOnTo("branch", tigra.getMaxPowerOfHolding());

        NormalExtendedSensitiveCharacter.Mind tigrasMind = tigra.new Mind();

        OpinionPrinter opinionPrinter = new MyOpinionPrinter();

        opinionPrinter.print(tigrasMind,"it", true, new JumpingBeast() {

            @Override
            public String toString() {
                return "a jumping animal like Kenga";
            }
        });

        opinionPrinter.print(tigrasMind,"it", false, new SwimmingBeast() {

            @Override
            public String toString() {
                return "a swimming animal like Tiger";
            }

        });

        tigrasMind.thinkAboutEvent(new Event() {
            @java.lang.Override
            public void happen() {
                River.Flow flow = new River.Flow(false);
                tigra.swimOnTheBack(flow);
            }
        }, new Event() {
            @java.lang.Override
            public void happen() {
                River.Moisture moisture = new River.Moisture(River.Moisture.TemperatureOfMoisture.cool);
                tigra.dive(moisture);
            }
        });

        christoferRobin.shout("Come on, come on! Do not be afraid.");

        tigra.say("Now, wait a minute, I got something in my eye!");

        tigra.crawl(CharacterWithLegsAndHands.SpeedOfCrawling.slowly_slowly);

        tigra.feel(Feellings.easy);

        Sounds sound1 = new Knock(10);
        Sounds sound2 = new Crackle("torn fabric");
        sound1.sound();
        sound2.sound();

        KuchaMalaMaker kuchaMalaMaker= new MyKuchaMalaMaker();
        KuchaMala kucha = kuchaMalaMaker.make("ground", iaIa,tigra,piglet,puh,christoferRobin);


        KuchaMalaPositioner kuchaMalaPositioner= new MyKuchaMalaPositioner();


        Event stand_upping_from_kucha_mala= new MyStandUppingFromKuchaMala(kucha,3,true);
        stand_upping_from_kucha_mala.happen();


        Event pick_upping_in_kucha_mala = new MyPickUppingFromKuchaMala(kucha,1,false, christoferRobin,puh,piglet);
        pick_upping_in_kucha_mala.happen();


        Event ending_in_kucha_mala= new MyEndingInKuchaMala(kucha);
        ending_in_kucha_mala.happen();

        christoferRobin.shout("Oh, Eeyore! Does it hurt you?");

        christoferRobin.grope(iaIa, true);
        try {
            christoferRobin.shakeOff(iaIa);
        }
        catch (AlreadyClearException e) {
            System.out.println(e.getMessage());

            System.out.println(iaIa.getName()+(iaIa.getStand() ? " stand" : " not stand"));
        }
        christoferRobin.helpToStandUp(iaIa);

        iaIa.beSilent();
        iaIa.ask("");


        
    }
}
