package lab3.Kucha_mala;

public class MyEndingInKuchaMala implements Event {
    protected KuchaMala kucha;

    public MyEndingInKuchaMala(KuchaMala kucha) {
        this.kucha=kucha;
    }

    public void happen() {
        System.out.println("At the bottom was, of course, " + kucha.getEnd().getName());
    }

    @Override
    public String toString() {
        return "my ending in kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
