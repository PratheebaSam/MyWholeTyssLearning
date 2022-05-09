function greeting(a) {
  console.log(a);
}
//if we have the name is same as the function the function gets more priority than variable.
//var welcome = "prathi";
function welcome() {
  console.log("hello");
}
greeting(welcome); //function welcome
greeting(welcome()); // hello and undefined

function greeting1(a) {
  a();
}
greeting1(welcome); //hello

// //if we declare the variable as same as function name and passing the variable into the function parameter
// //inside the function if we call welcome function then the function is not present amd it throws an error
// function check(welcome) {
//   welcome(ram);
// }

console.log("start");
function get() {
  console.log("welcome");
}
setTimeout(() => {
  console.log("hello");
}, 1000);
console.log("end");
console.log("jhvhvGWV");
console.log("EWNEHGGH");
console.log("jbbywfwg");
console.log("jegfyb");
