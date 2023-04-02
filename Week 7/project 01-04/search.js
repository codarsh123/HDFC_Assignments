


function productArray(){

    var pname =["apple", "banana", "orange", "grape", "watermelon"];

    var productName = document.getElementById("prodname").value.toLowerCase();
    var found = false;
    for (let i = 0; i < pname.length; i++) {
      if ( pname[i] === productName) {
        found=true;
        break;
      }
    }

     if(found) {
        alert("product found")
      }else{
        alert("product not found")            
      }
    

}

function deleteArray(){

    var pname =["apple", "banana", "orange", "grape", "watermelon"];

    var productName = document.getElementById("prodname").value.toLowerCase();
    for (let i = 0; i < pname.length; i++) {
      if ( pname[i] === productName) {
        delete[i];
        alert("product deleted")
      }
        alert("product not found")
      
       
    }

}