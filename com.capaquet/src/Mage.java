public class Mage extends Classe {

    private String attaqueBasiqueNom = "Boule de Feu";
    private String attaqueSpecialeNom = "Soin";

    /**
     *
     * @param choixAttaque
     * @return
     */
    @Override
    public int attaque(int choixAttaque) {
        System.out.println("Joueur " + this.numeroJoueur);
        if (choixAttaque == 1) {
            System.out.println(attaqueBasiqueNom + " et inflige " + this.intelligence + " dommages.");
            return this.intelligence;
        } else {
            int soin = 0;
            if (this.vieManquante > this.intelligence * 2)
                soin = this.intelligence * 2;
            else if (this.vieManquante < this.intelligence * 2)
                soin = vieManquante;
            this.vieManquante -= soin;
            System.out.println(attaqueSpecialeNom + " et gagne " + Integer.toString(soin) + " en vitalité.");
            return 0;
        }
    }

}
