function first(a) {
  setTimeout(() => {
    console.log("hello");
    console.log(a);
    a();
  }, 5000);
}
function second() {
  setTimeout(() => {
    console.log("hi");
  }, 2000);
}

first(second);
