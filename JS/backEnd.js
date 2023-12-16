var modal = document.getElementById('id01');


window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

let userName = ["admin"];
let passWord = ["12345"];

function logIn() {
    let uName = document.getElementsByName("uname")[0].value;
    let pWord = document.getElementsByName("psw")[0].value;

    let found = false;

    for (let i = 0; i < userName.length; i++) {
        for (let j = 0; j < passWord.length; j++) {
            if (uName == userName[i] && pWord == passWord[j]) {
                document.getElementsByName("uname")[0].value = "";
                document.getElementsByName("psw")[0].value = "";
                found = true;
                break; 
            }
        }
    }

    if (found) {
        alert("Log in Success");
        window.location.href = "HomePage.html";
    } else {
        document.getElementsByName("uname")[0].value = "";
        document.getElementsByName("psw")[0].value = "";
        alert("Log in Failed");
    }
}


function Register() {
  let uName = document.getElementsByName("userReg")[0].value;
  let pWord = document.getElementsByName("pswReg")[0].value;

  
  if (userName.includes(uName)) {
      alert( "Username already exists. Please choose another one.");
  } else {
      userName.push(uName);
      passWord.push(pWord);
      document.getElementsByName("userReg")[0].value = "";
      document.getElementsByName("pswReg")[0].value = "";
      alert("Registration Successful");
      
  }
  
}
