public class Rodeur extends Classe {

    private String attaqueBasiqueNom = "Tir à l’Arc";
    private String attaqueSpecialeNom = "Concentration";

    /**
     *
     * @param choixAttaque
     * @return
     */
    @Override
    public int attaque(int choixAttaque) {
        System.out.println("Joueur " + this.numeroJoueur + " utilise ");
        if (choixAttaque == 1) {
            System.out.println(attaqueBasiqueNom + " et inflige " + this.agilite + " dommages.");
            return this.intelligence;
        } else {
            int bonus = this.agilite += this.niveau / 2;
            System.out.println(attaqueSpecialeNom + " et gagne " + Integer.toString(bonus) + " en agilité.");
            return 0;
        }
    }
}
