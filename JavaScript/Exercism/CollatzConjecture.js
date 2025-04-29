//
// This is only a SKELETON file for the 'Collatz Conjecture' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const steps = num => {

    let numberSoFar = num;
    let steppySteps = 0;
    
    if (numberSoFar < 1) {
      throw new Error('Only positive integers are allowed');
    }
    
    while (numberSoFar > 1){
      if (numberSoFar % 2 == 0){
        numberSoFar /= 2;
      } else {
        numberSoFar = numberSoFar * 3 + 1;
      }
      steppySteps += 1;
      }
    
    return steppySteps;
  };