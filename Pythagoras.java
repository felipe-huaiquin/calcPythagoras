public class Pythagoras{
    public double calcHyp(int catA, int catB){
        double catSum = (catA*catA) + (catB*catB);
        double hyp = Math.sqrt(catSum);
        return hyp;
    }
}