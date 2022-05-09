//creating object by using object literals
var object = { myName: "prathi", id: 01 };

for (const key in object) {
  if (Object.hasOwnProperty.call(object, key)) {
    console.log(object[key]);
  }
}

//creating object by using new key word
var object1 = new Object();
object1.ename = "prathi";
object1.id = 01;

for (const key in object1) {
  if (Object.hasOwnProperty.call(object1, key)) {
    console.log(object1[key]);
  }
}
