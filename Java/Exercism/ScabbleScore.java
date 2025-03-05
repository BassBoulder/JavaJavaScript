class Scrabble {
    
    private int score;

    Scrabble(String word) {

        score = 0;
        word = word.toUpperCase();

        for (char c : word.toCharArray()) {
            
            switch(c){
                    
                case 'D' , 'G':
                score += 2;
                break;
                    
                case 'B' , 'C' , 'M' , 'P':
                score += 3;
                break;
                    
                case 'F' , 'H' , 'V' , 'W' , 'Y':
                score += 4;
                break;
                    
                case 'K':
                score += 5;
                break;
                    
                case 'J' , 'X':
                score += 8;
                break;
                    
                case 'Q' , 'Z':
                score += 10;
                break;

                default:
                score += 1;
                break;
            }
        }
    }
    int getScore() {
        return score;
    }
}