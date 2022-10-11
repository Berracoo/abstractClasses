public abstract class GameCalculator {
    // we need to calculate every point no matter what the gamer is so we need a base.
    // this the base that we are going to use.
    // bu sınıfı kim inherite ediyorsa kendi hesaplasını yazmak zorunda
    // u don't have to add abstract func. to the abstract class u can just put a completed method
    // abstract class lar asla newlenmez kullanılabilmesi için override etmemiz gerekir.
    public abstract void hesapla(); // if we don't want any default.
    // if you are gonna use hesapla u have to override and implement it that means you have to use their own hesapla for every class.
    public final void gameOver(){ // if you are using game c u have to use it as it is.
        System.out.println("Oyun bitti.");
    }
}
