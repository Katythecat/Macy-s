public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Macy's");


        WomanShoes shoes=new WomanShoes();
        shoes.stock="200";
        shoes.color="black";
        shoes.price="129";

        WomanBag bag=new WomanBag();
        bag.type="crossBody";
        bag.color="white";
        bag.price="99";

        Cosmetic metic=new Cosmetic();
        metic.brand="Rare Beauty";
        metic.price="200";
        metic.totalInStock="300";
        metic.type="Gross";



    }
}