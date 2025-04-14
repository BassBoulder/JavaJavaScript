//
// This is only a SKELETON file for the 'Hamming' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const compute = (Fham, Sham) => {
    let difference_count = 0;
  
    if (Fham.length != Sham.length){
       throw new Error("strands must be of equal length");
    }
    
    for (let i = 0; i <= Fham.length; i++){
      if (Fham[i] != Sham[i]){
        difference_count++
      }
    }
    return difference_count;
  };
  