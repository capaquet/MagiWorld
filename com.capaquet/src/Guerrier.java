public class Guerrier extends Classe {

    private String attaqueBasiqueNom = "Coup d’Épée";
    private String attaqueSpecialeNom = "Coup de Rage";

    /**
     *
     * @param choixAttaque
     * @return
     */
    @Override
    public int attaque(int choixAttaque) {
        System.out.println("Joueur " + this.numeroJoueur + " utilise ");
        if (choixAttaque == 1) {
            System.out.println(attaqueBasiqueNom + " et inflige " + this.force + " dommages.");
            return this.force;
        } else {
            System.out.println(attaqueBasiqueNom + " et inflige " + this.force * 2 + " dommages.");
            this.encaisseDegats(this.force);
            return this.force * 2;
        }
    }
}
