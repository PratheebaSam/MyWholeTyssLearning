// getName(3, 5);
// named function
function getName() {
  console.log(3 + 4);
}
//getName(3, 5);
getName();
get;
//annonymous function
var get = function (a, b) {
  console.log(a - b);
};
get(3, 5);

//immmediately invoked function
var getValue = (function () {
  console.log(26);
})();

//asyncronous function
(function hello() {
  console.log("hello");
})();
