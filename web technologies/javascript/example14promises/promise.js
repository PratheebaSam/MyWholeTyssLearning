new Promise(function (resolve, reject) {
  if (10 < 11) {
    resolve("success");
  } else {
    reject("error");
  }
})

  .then(function (data) {
    console.log(data);
  })

  .catch(function (err) {
    console.log(err);
  });
