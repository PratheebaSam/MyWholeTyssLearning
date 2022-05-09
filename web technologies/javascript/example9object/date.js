let date = new Date();
const array = [
  "janauary",
  "feburary",
  "march",
  "april",
  "may",
  "june",
  "july",
  "august",
  "september",
  "october",
  "nov",
  "dec",
];
console.log(date);
console.log("date:", date.getDate());
console.log("day:", date.getDay());
console.log("year:", date.getFullYear());
console.log("month:", date.getMonth());
console.log("hours:", date.getHours());
console.log("time:", date.getTime());
console.log("seconds:", date.getSeconds());
console.log("minutes:", date.getMinutes());
console.log("milliseconds:", date.getMilliseconds());
console.log(date.getMonth(), "/", date.getDate(), "/", date.getFullYear());
console.log(date.toDateString());
console.log(date.toISOString());
console.log(date.toLocaleDateString());

var fullDate = `${date.getMonth()}/${date.getDate()}/${date.getFullYear()}`;
console.log("fulldate:", fullDate);

let month = date.getMonth();
console.log(`${array[month]}/${date.getDate()}/${date.getFullYear()}`);
