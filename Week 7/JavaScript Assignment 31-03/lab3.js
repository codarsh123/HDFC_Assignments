function currentDate(){

    let date = new Date();
   
    if (date<12) {
        document.write(date);
        document.write("<br>Goog Morning");
    }else if(date>=12 && date<=17){
        document.write(date);
        document.write("<br>GOOD Afternoon");
    }else{
        document.write(date);
        document.write("<br>Good Evening");
    }

}