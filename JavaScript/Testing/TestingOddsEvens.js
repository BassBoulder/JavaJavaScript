export function determineOddEvenCards(stack, type) {
    let even, odd = 0;
    
    for (let i = 0; i < stack.length; i++){
      if (stack[i] % 2 == 0){
        even += 1;
      } else {
        odd += 1;
      }
    }
    return type == true ? even : odd;
  }


  determineOddEvenCards([1,3,5], false)