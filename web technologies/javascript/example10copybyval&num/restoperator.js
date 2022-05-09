//rest opeartor

function addNumbers(...nums) {
  let sum = 0;
  console.log(typeof nums);
  for (let index = 0; index < nums.length; index++) {
    sum += nums[index];
  }
  console.log("sum:", sum);
}

addNumbers(10, 20, 30);
addNumbers(10, 20);
addNumbers(40, 30, 20, 10);
