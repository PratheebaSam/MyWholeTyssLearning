//copy by value
let num = 56;
let num1 = num;
console.log(num, num1 + 10);

//copy by reference there is one disadvantage that is if we push value in ref then it reflects in both
let arr = [3, 2, 4, 2, 4, 3, 6];
let array = arr;
array.push(89);
console.log("arr value:", arr, "array value:", array);

//to overcome the above disadvantage we are moving to shallow copy and deep copy.these are introduced in ecma script 6.
//shallow copy
let array1 = [95, 65, 32];
let array1copy = [...array1];
array1copy.push(76);
console.log("array1:", array1);
console.log("array1copy:", array1copy);

//object in shallow copy
let person = {
  pname: "prathi",
  age: 22,
  percentage: "99%",
};
let personcopy = { ...person };
person.pname = "prathisam";
personcopy.phNumber = "9344045340";
console.log(person);
console.log(personcopy);

const movie = {
  movieName: "Spiderman",
  actors: {
    hero: "tom holland",
    heroine: "Zendaya",
  },
};
let moviecopy = { ...movie };
movie.actors.salary = 20000;
console.log(movie);
console.log(moviecopy);

//deep copy of an object
let deepcopy = { ...movie, actors: { ...movie.actors } };
