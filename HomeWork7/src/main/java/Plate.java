public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean eatFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }
    public void inInfo() {

        System.out.println("В тарелку насыпали " + food + " грамм корма.\nПосле чего решили покормить котов:");
    }

    public void offInfo() {

        System.out.println("\nВ тарелке осталось " + food + " грамм корма.");
    }


    public void addFood(int addFood) {

        this.food += addFood;
    }


}
