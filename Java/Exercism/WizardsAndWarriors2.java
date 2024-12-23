public class WizardsAndWarriors2 {
    
    public class GameMaster {

        // TODO: define a 'describe' method that returns a description of a Character
    
        public String describe(Character character){
            String description = String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
            return description;
        }
        
        // TODO: define a 'describe' method that returns a description of a Destination
    
        public String describe(Destination destination){
            String description = String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
            return description;
        }
        
        // TODO: define a 'describe' method that returns a description of a TravelMethod
    
        public String describe(TravelMethod travelMethod){
            String descriptionHorse = "You're traveling to your destination on horseback.";
            String descriptionWalk = "You're traveling to your destination by walking.";
            return (travelMethod.equals(travelMethod.HORSEBACK)) ? descriptionHorse : descriptionWalk;
        }
        
        // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    
        public String describe(Character character, Destination destination, TravelMethod travelMethod){
            String descriptionCharacter = String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
            String descriptionDestination = String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
            String descriptionHorse = "You're traveling to your destination on horseback.";
            String descriptionWalk = "You're traveling to your destination by walking.";  
            return String.format("%s %s %s", descriptionCharacter, travelMethod.equals(travelMethod.HORSEBACK) ? descriptionHorse : descriptionWalk, descriptionDestination);
        }
        
        // TODO: define a 'describe' method that returns a description of a Character and Destination
        
        public String describe(Character character, Destination destination){
            String descriptionCharacter = String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
            String descriptionDestination = String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
            String descriptionWalk = "You're traveling to your destination by walking."; 
            return String.format("%s %s %s", descriptionCharacter, descriptionWalk, descriptionDestination);
        }
    }
}