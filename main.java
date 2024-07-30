import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        collection collection = new collection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher le nombre de produits en stock");
            System.out.println("3. Supprimer un produits en stock");
            System.out.println("4. Rechercher un produits en stock");
            System.out.println("5. Modifier un produits en stock");
            System.out.println("6. Lister les produits ");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    Produit nouveauProduit = collection.saisirproduit();
                    collection.ajouterProduit(nouveauProduit);
                    System.out.println("Produit ajouté !");
                    break;
                case 2:
                    System.out.println("Nombre de produits en stock : " + collection.getNombreProduitsEnStock());
                    break;
                case 3:
                    System.out.println("Supprimer un produits en stock : " + collection.getNombreProduitsEnStock());
                    break;
                case 4:
                    System.out.println("Rechercher un produits en stock : " + collection.getNombreProduitsEnStock());
                    break;
                case 5:
                    System.out.print("Entrez l'ID du produit à modifier : ");
                    int idModification = scanner.nextInt();
                    System.out.print("Entrez le nouveau nom du produit : ");
                    String nouveauNom = scanner.next();
                    System.out.print("Entrez le nouveau prix du produit : ");
                    double nouveauPrix = scanner.nextDouble();
                    collection.modifierProduit(idModification, nouveauNom, nouveauPrix);
                    System.out.println("Produit modifié !");
                    break;

                case 6:
                    System.out.print("Produits lsistés : ");
                    String nomRecherche = scanner.next();
                    Produit produitRecherche = collection.rechercherProduitParNom(nomRecherche);
                    if (produitRecherche != null) {
                        System.out.println("Produit trouvé : " + produitRecherche.getNom() + " (ID : " + produitRecherche.getId() + ")");
            }
        }
    }
}
}
