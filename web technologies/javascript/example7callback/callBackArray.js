var arr = ["a", 1, true];
console.log(arr);
//for loop
console.log("for loop");
for (let index = 0; index < arr.length; index++) {
  const element = arr[index];
  console.log(element);
}

var array = [10, 20, 30, 40];
for (let index = 0; index < array.length; index++) {
  array[index] = array[index] + 10;
  console.log(array[index]);
}

//for of loop  here this i takes the value of array instead of getting index
console.log("forof loop");
for (const i of array) {
  console.log(i);
}

//for in loop
console.log("forin loop");
for (const i in array) {
  if (Object.hasOwnProperty.call(array, i)) {
    console.log(array[i]);
  }
}
