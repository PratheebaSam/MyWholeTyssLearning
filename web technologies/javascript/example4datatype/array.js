var myArray = [
  "Prathi",
  01,
  true,
  undefined,
  null,
  { color: "black" },
  ["black", "blue", "red"],
];
console.log(myArray[2]);
console.log(myArray[4]);
console.log(typeof myArray[3]);
console.log(myArray[5].length);
console.log(myArray[5].color);
console.log(myArray[5]["color"]);
console.log(myArray[5]["co  lor"]);
console.log(myArray.length);
console.log(myArray[6].length);
console.log(myArray[6][0]);
console.log(myArray[6][2 - 1]);

//array looping by using map
console.log("array mapping");
var array = [10, 20, 30, 40, 50, 60];
var mapMethod = array.map((value, index, arr) => {
  console.log("value:", value + 10);
  console.log("index:", index);
  //console.log("arr:", arr);
});

var books = [
  {
    author: "anni frank",
    bookname: "dairy of a young girl",
    price: 300,
    publication: "ajay",
  },
  {
    author: "vyasar",
    bookname: "mahabharatham",
    price: 1000,
    publication: "prathi",
  },
  {
    author: "pratheeba",
    bookname: "biography",
    price: 100000,
    publication: "oxford publication",
  },
];

console.log("mapping:");
var mapping = books.map((value, index, array) => {
  console.log(value.author);
});
var mapping = books.filter((value, index, array) => {
  console.log(value.author);
});

var age = [23, 4, 32, 56, 43, 12, 15, 56, 17];
//filter method
console.log("filter:");
age.filter((value, index, array) => {
  if (value > 18) {
    console.log(value);
  }
});
age.map((value, index, array) => {
  if (value > 18) {
    console.log(value);
  }
});

//diff between map and filter
console.log("diff bw map and filter");
var a = [1, 2, 3, 4, 5];
var ex = a.filter((value, index, array) => {
  return value < 3;
});
console.log(ex);

var ex1 = a.map((value, index, array) => {
  return value < 3;
});
console.log(ex1);

//where we using map
console.log("where we use map");
var ex2 = a.map((value, index, array) => {
  return value + 10;
});
console.log(ex2);
console.log("where we use map");
var ex3 = a.filter((value, index, array) => {
  return value + 10;
});
console.log(ex3);
