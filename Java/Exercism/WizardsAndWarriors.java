class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }
    
    boolean isVulnerable(){
        return false;
    }

    int getDamagePoints(Fighter otherPerson){
        if (otherPerson.isVulnerable()){
            return 10;
        }
        return 6;
    }
    
}

// TODO: define the Wizard class

class Wizard extends Fighter {
    boolean spellprepped = false;
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell(){
        spellprepped = true;
    }

    boolean isVulnerable() {
        return !spellprepped;
    }

    int getDamagePoints(Fighter wizard){
        if (spellprepped) {
            return 12;
        }
        return 3;
    }
}