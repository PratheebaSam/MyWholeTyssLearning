var number = Math.min(10, 32, 67, 332, 4, 56, 231);
console.log("minimum number:", number);

var num1 = Math.max(10, 32, 67, 332, 4, 56, 231);
console.log("Maximum number:", num1);

var num2 = Math.random();
console.log("Random number:", num2);

var num3 = Math.floor(4.67);
console.log("floor:", num3);

var num4 = Math.ceil(4.67);
console.log("ceiling number:", num4);

//random value from array
var array = ["prathi", "sam", "chakkarai"];
var num5 = Math.random() * array.length;
console.log(num5);
var value = Math.floor(num5);
console.log("random value from array:", array[value]);

console.log(array[Math.floor(Math.random() * array.length)]);
