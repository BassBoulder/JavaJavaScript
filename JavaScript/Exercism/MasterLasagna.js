/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */
export function cookingStatus(minutesRemaining) {
    if (minutesRemaining === undefined){
      return 'You forgot to set the timer.'; 
    }
    else if (minutesRemaining === 0){
      return 'Lasagna is done.';
    } 
    else if (minutesRemaining > 0){  
      return 'Not done, please wait.';
    }
  }
  
  export function preparationTime(layers, avgMinutesPerLayer = 2){
    return layers.length  * avgMinutesPerLayer;
  }
  
  export function quantities(layers){
    let noodles = 0;
    let sauce = 0;
  
    for (let item of layers){
      if (item === "noodles"){
        noodles += 50;
      } else if (item === "sauce"){
        sauce += 0.2;
      }
    }
    return { noodles, sauce };
  }
  
  export function addSecretIngredient(friendsList, myList){
    let friendsListLastItem = friendsList.length - 1;
  
    //.concat() for array + array
    //.push() for array + single variable
    myList.push(friendsList[friendsListLastItem]);
  }
  
  export function scaleRecipe(recipe, portions){
    let newRecipe = {};
    
    for (let item in recipe){
      newRecipe[item] = recipe[item] * portions / 2
    }
    return newRecipe;
  }
  