//
// This is only a SKELETON file for the 'Eliud's Eggs' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const eggCount = (displayValue) => {
  return ((displayValue >>> 0).toString(2).match(/1/g) || []).length;
};
