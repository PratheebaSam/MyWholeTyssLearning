// localStorage.setItem("email", "sam@gmail.com");
// document.write(localStorage.getItem("email"));

// sessionStorage.setItem("email", "sam1@gmail.com");
// document.write(sessionStorage.getItem("email"));
// localStorage.clear();
let a;
function login() {
  const val = localStorage.getItem("a");
  sessionStorage.setItem("sessionId", 123);
  console.log("a before click", a);
  if (val) {
    a = Number(val);
  } else {
    a = 10;
    localStorage.setItem("a", a);
  }
}

function increment() {
  a += 10;
  console.log("a click after", a);
  localStorage.setItem("a", a);
}

function logout() {
  localStorage.clear();
  sessionStorage.clear();
}

sessionStorage.getItem("sessonId");
