function sortIntegerDesc(arr) {
    if (arr.length <= 1) {
      return arr;
    }
  
    // Split the array into two halves
    const middle = Math.floor(arr.length / 2);
    const left = arr.slice(0, middle);
    const right = arr.slice(middle);
  
    //merge sort the two halves again & again using recursion
    const leftSorted = sortIntegerDesc(left);
    const rightSorted = sortIntegerDesc(right);
  
    // Merging the sorted halves
    return merge(leftSorted, rightSorted);
  }
  
  function merge(left, right) {
    let result = [];
    let leftIndex = 0;
    let rightIndex = 0;
  
    while (leftIndex < left.length && rightIndex < right.length) {
      if (right[rightIndex] < left[leftIndex]) {
        result.push(left[leftIndex]);
        leftIndex++;
      } else {
        result.push(right[rightIndex]);
        rightIndex++;
      }
    }
    // adding any remaining elements from both arrays
    return result.concat(left.slice(leftIndex), right.slice(rightIndex));
  }

  const numbers = [23, 24, 5, 2, 9, 1, 424, 53,5, 6, 355];
   const sortedNumbers = sortIntegerDesc(numbers);
 console.log(sortedNumbers); // Output: [1, 2, 5, 5, 6, 9]