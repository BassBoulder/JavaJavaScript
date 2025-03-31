//
// This is only a SKELETON file for the 'Reverse String' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const reverseString = word => {
    let split = word.split("");
    let reverseSplit = split.reverse();
    let reversedWord = reverseSplit.join("");
  
    return reversedWord;
  };
  