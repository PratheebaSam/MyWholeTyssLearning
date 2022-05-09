console.log(this === window);
function add() {
  //this refers to the window object
  console.log(this);
}
add();

let person = {
  name: "prathi",
  age: 22,
  sal: function add() {
    //this refers  to the current object
    console.log(this);
  },
};

console.log(person.sal);
