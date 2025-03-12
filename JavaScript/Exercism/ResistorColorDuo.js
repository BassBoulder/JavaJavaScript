//
// This is only a SKELETON file for the 'Resistor Color Duo' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const decodedValue = colour => {

    let resistorColourDuoValue = '';
    
    for (let i = 0; i < Math.min(2, colour.length); i++)
    {
      switch (colour[i])
      {
        case 'black':
          resistorColourDuoValue += '0';
          break;
        case 'brown':
          resistorColourDuoValue += '1';
          break;
        case 'red':
          resistorColourDuoValue += '2';
          break;
        case 'orange':
          resistorColourDuoValue += '3';
          break;
        case 'yellow':
          resistorColourDuoValue += '4';
          break;
        case 'green':
          resistorColourDuoValue += '5';
          break;
        case 'blue':
          resistorColourDuoValue += '6';
          break;
        case 'violet':
          resistorColourDuoValue += '7';
          break;
        case 'grey':
          resistorColourDuoValue += '8';
          break;
        case 'white':
          resistorColourDuoValue += '9';
          break;
      }
    }
    return Number(resistorColourDuoValue);
  };
  