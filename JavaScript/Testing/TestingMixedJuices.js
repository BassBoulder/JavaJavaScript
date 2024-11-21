export function limesToCut(wedgesNeeded, limes) {
  
    let limeCounter = 0;

    for (let lime in limes) {
        if (wedgesNeeded <= 0) break;

        switch (lime) {
            case 'small':
                wedgesNeeded -= 6;
                break;

            case 'medium':
                wedgesNeeded -= 8;
                break;

            case 'large':
                wedgesNeeded -= 10;
                break;
        }
        limeCounter++
    }
    return limeCounter;
}  

limesToCut(25, ['small', 'small', 'large', 'medium', 'small'])