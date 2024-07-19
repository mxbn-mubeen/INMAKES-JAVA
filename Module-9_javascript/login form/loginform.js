function validate(){
    if(document.forms[0].elements[1].value.lenght<1){
        alert('username cannot empty');
        document.forms[0].elements[0].focus();
    }
    else if(document.forms[0].elements[1].value.lenght<1){
        alert('password cannot empty');
        document.forms[0].elements[1].focus();
    }
    else if(document.forms[0].elements[0].value=='ramesh'&&document.forms[0].elements[1].value=='inmakes@123')

        alert('login successful');
    else
         alert('invalid userid or password');
    }