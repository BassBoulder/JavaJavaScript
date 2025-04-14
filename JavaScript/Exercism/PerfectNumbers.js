//
// This is only a SKELETON file for the 'Perfect Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const classify = number => {

    let answer = 0;
  
    if (number < 1){
      throw new Error('Classification is only possible for natural numbers.');
    }
    
    for (let i = 1; i < number; i++){ 
      if (number % i == 0){
        answer += i;
      }
    }
  
    if (answer > number){
      return "abundant";
    }
    else if (answer == number){
      return "perfect";
    }
    else {
      return "deficient";
    }
    
    // split it in half
    // start i at 1
    // don't halve 2
    // for value in range(1, half_value: value + value
    // output string answer
  
  };
  