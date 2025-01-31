// @ts-check

/**
 * Given a certain command, help the chatbot recognize whether the command is valid or not.
 *
 * @param {string} command
 * @returns {boolean} whether or not is the command valid
 */

export function isValidCommand(command) {
    return /^chatbot/gi.test(command);
  }
  
  /**
   * Given a certain message, help the chatbot get rid of all the emoji's encryption through the message.
   *
   * @param {string} message
   * @returns {string} The message without the emojis encryption
   */
  export function removeEmoji(message) {
    return message.replace(/emoji[0-9]+/g, '');
  }
  
  /**
   * Given a certain phone number, help the chatbot recognize whether it is in the correct format.
   *
   * @param {string} number
   * @returns {string} the Chatbot response to the phone Validation
   */
  export function checkPhoneNumber(number) {
    let goodResponse = "Thanks! You can now download me to your phone.";
    let badResponse = "Oops, it seems like I can't reach out to ";
    return (number.match(/^\(\+\d{2}\) \d{3}-\d{3}-\d{3}$/)) ? goodResponse : badResponse + number;
  }
  
  /**
   * Given a certain response from the user, help the chatbot get only the URL.
   *
   * @param {string} userInput
   * @returns {string[] | null} all the possible URL's that the user may have answered
   */
  export function getURL(userInput) {
    return userInput.match(/\w+\.\w+/g);
  }
  
  /**
   * Greet the user using the full name data from the profile.
   *
   * @param {string} fullName
   * @returns {string} Greeting from the chatbot
   */
  export function niceToMeetYou(fullName) {
    let message = "Nice to meet you, ";
    let nameSwapped = fullName.replace(/([a-z]+), ([a-z]+)/i, '$2 $1');
    return message + nameSwapped;
  }
  