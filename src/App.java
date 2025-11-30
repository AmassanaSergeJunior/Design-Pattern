public class App {
  public static void main(String[] args) {

        FabriqueProduit fabrique = new FabriqueProduit();

        Produit pa = fabrique.createProduit("A");
        pa.methodeproduit();

        Produit pb = fabrique.createProduit("B");
        pb.methodeproduit();

        Produit pc = fabrique.createProduit("C");
        pc.methodeproduit();
    }
}
