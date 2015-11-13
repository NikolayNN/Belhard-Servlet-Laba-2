function showRadioButtons(){
    var zip = document.getElementById("zip");
    var jar = document.getElementById("jar");
    var checkbox=document.getElementById("arhive");

    if(checkbox.checked){
        zip.disabled = false;
        jar.disabled = false;
    }
    if(!checkbox.checked){
        zip.disabled = true;
        jar.disabled = true;
    }
}

//
            

        

