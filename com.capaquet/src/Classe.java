abstract class Classe {
    protected int numeroJoueur;
    protected int niveau;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected int vieMax;
    protected int vieManquante = 0;


    public int attaque(int choixAttaque) {
        return 0;
    };

    public void encaisseDegats(int degats) {
        this.vieManquante += degats;
        System.out.println("Joueur " + this.numeroJoueur + " perd " + Integer.toString(degats) + " points de vie.");
    }

    public int getVieRestante(){
        return this.vieMax - this.vieManquante;
    }


    /**
     *Getteurs & Setteurs
     */
    public void setNumeroJoueur(int numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
        this.vieMax = this.niveau * 5;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

}
