//string mathods

var str = "hello";
str.toUpperCase();
//the changes are not reflected because premitive datatypes are immutable
console.log(str);
var res = str.toUpperCase();
console.log(res);
var lower = str.toLowerCase();
console.log(lower);

console.log(str.charAt(3));

var value = " good noon";

console.log("index of:", value.indexOf(2));
console.log("includes", value.includes("noon"));
console.log("replace", value.replace("noon", "afternoon"));
console.log("search", value.search("noon"));

//to string functionality
console.log("to string");
var i = 2;
var ex = i.toString();
console.log(ex, i, typeof ex);

//trim the white space in the begining and end of the program
console.log("trim:", value.trim());
console.log("trim from start:", value.trimStart());
console.log("trim from end:", value.trimEnd());

// value.toFixed
