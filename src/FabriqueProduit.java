public class FabriqueProduit {
    public Produit createProduit(String categorie) {

        if (categorie.equalsIgnoreCase("A")) {
            return new ProduitA();
        }
        else if (categorie.equalsIgnoreCase("B")) {
            return new ProduitB();
        }
        else if (categorie.equalsIgnoreCase("C")) {
            return new ProduitC();
        }
        else if (categorie.equalsIgnoreCase("D")){
            return  new ProduitD();
        }
        return null;
    }

}
