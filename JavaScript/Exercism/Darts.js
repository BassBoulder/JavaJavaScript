//
// This is only a SKELETON file for the 'Darts' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const score = (x, y) => {
  let result = Math.hypot(x, y);

  if (result <= 1){
    return 10;
  
  } else if (result <= 5){
    return 5; 
  
  } else if (result <= 10){
    return 1;
  
  } else {
    return 0;
    
  }
};