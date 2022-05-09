console.log(window);

var a = 8;
window.alert("hi prathi you have to learn window object");

console.log(window.document);

console.log(window.history);

console.log(window.navigator);

navigator.geolocation.getCurrentPosition((loc) => {
  console.log("location:", loc);
});

//this is a keyword of the object of window
console.log(this === window); //true
