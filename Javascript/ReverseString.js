function reverseWordsInSentence(sentence) {
      // This reverseWord(word ) helper Function will take each word and then reverse it and store it in reversedWord and at last return it.
    function reverseWord(word) {
      let reversedWord = '';
      for (let i = word.length - 1; i >= 0; i--) {
        reversedWord += word[i];
      }
      return reversedWord;
    }
    // This empty array will hold all the reverse value of input string
    let words = [];
    // 'word' will hold single word split by " "(space)
    let word = '';
    
    for (let i = 0; i < sentence.length; i++) {
      if (sentence[i] !== ' ') {
        word += sentence[i];
      } else {
        // After reversing the word I just pushed the reversed word into the 'Words[]'.
        words.push(reverseWord(word));
        word = '';
      }
    }

    // This will run at the end when my for loop will not break but we are remaining with one/last word. then we just called the reverseWord method with particular this words and reverse it and Pushed it into the 'words[]'
    words.push(reverseWord(word));
  

    //At end we will just join all the array value
    let reversedSentence = words.join(' ');
    return reversedSentence;
  }

  let inputSentence = "This is a sunny day";
  let reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);