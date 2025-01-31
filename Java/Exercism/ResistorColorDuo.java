class ResistorColorDuo {
    int value(String[] colors) {
        
        String result = "";
        int iter = 0; 
        int maxIter = 2; //Two goes round

        for (String color : colors){
            if (iter < maxIter){
                switch(color){
                    case "black":
                        result += '0';
                        iter++;
                        break;
                    case "brown":
                        result += '1';
                        iter++;
                        break;
                    case "red":
                        result += '2';
                        iter++;
                        break;
                    case "orange":
                        result += '3';
                        iter++;
                        break;
                    case "yellow":
                        result += '4';
                        iter++;
                        break;
                    case "green":
                        result += '5';
                        iter++;
                        break;
                    case "blue":
                        result += '6';
                        iter++;
                        break;
                    case "violet":
                        result += '7';
                        iter++;
                        break;
                    case "grey":
                        result += '8';
                        iter++;
                        break;
                    case "white":
                        result += '9';
                        iter++;
                        break;
                }
            } else{ break; }
        }
        return Integer.parseInt(result); //Turn String to an Int
    }
}