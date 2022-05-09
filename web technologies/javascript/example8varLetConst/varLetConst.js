//var

var a = 10;
console.log(a);
//redeclaration is possible in var
var a = 56;

//redeclaration is not possible in both let and const

//const
// console.log(b); //Uncaught ReferenceError: can't access lexical declaration 'b' before initialization
const b = 100;
//const b = 43;
// b = 34;//Uncaught TypeError: invalid assignment to const 'b'

//let
// console.log(c);
let c = 1000;
// let c = "6bh";//Uncaught SyntaxError: redeclaration of let c
