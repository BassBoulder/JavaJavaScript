//
// This is only a SKELETON file for the 'Raindrops' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const convert = (rain) => 
    (rain % 3 === 0 ? "Pling" : "") +
    (rain % 5 === 0 ? "Plang" : "") +
    (rain % 7 === 0 ? "Plong" : "") || rain.toString();