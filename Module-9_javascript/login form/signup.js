var user=document.getElementById('txtuser');
var email=document.getElementById('txtemail');
email.addEventListener('focusout',validateemail);
var pwd=document.getElementById('txtpass');
var confirmpwd = document.getElementById('txtconfirmpass');

function validate(){

    if(user.value==''){
        document.getElementById('error1').innerHTML='username cannot empty';
        user.focus();
        return false;
    }
    else{
        document.getElementById('error1').innerHTML='';
    }

    if(email.value==''){
        document.getElementById('error2').innerHTML='email cannot empty';
        email.focus();
        return false;
    }
    else{
        document.getElementById('error1').innerHTML='';
    }

    if(pwd.value!=''){
        if(pwd.value,length<7){
            document.getElementById('error3').innerHTML='Password require minimum 8 characters';
            pwd.focus();
            return false;
        }
        else{
            document.getElementById('error3').innerHTML='';
        }
    }
    else{
        document.getElementById("error3").innerHTML='Password cannot Empty'; 
        pwd.focus();
        return false;
    }

    if(confirmpwd.value!=''){
        if(confirmpwd.value.length<7){
        document.getElementById("error4").innerHTML='confirm Password require minimum 8 characters'; 
        pwd.focus();
        return false;
        }
        else{
            document.getElementById('error4').innerHTML='';
        }
    }
    else{
        document.getElementById("error3").innerHTML='confirm Password cannot Empty'; 
        pwd.focus();
        return false;
    }

    if (pwd.value != confirmpwd.value) {
        document.getElementById("error3").innerHTML = 'password mismatch';
        document.getElementById("error4").innerHTML = 'confirm password mismatch';
        pwd.focus();
        return false;
    } else {
        document.getElementById('error3').innerHTML = '';
        document.getElementById('error4').innerHTML = '';
    }

    alert('success');
    return true;
}

function validateemail(){
    emailid=email.value;
    atpos=emailid.indexOf('@');
    dotpos=email.lastindexOf(",");

    if(atpos<1|| (dotpos-atpos<2)){
        document.getElementById('error2').innerHTML='please enter correct emailid';
        email.focus();
        return false;
    }
    else{
        document.getElementById("error2").innerHTML='';
        return true;
    }
}