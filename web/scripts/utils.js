/**
 * Created by User on 11.11.2015.
 */
function isTextFieldEmpty(fieldId, errMessage, isFormValid){
    var fieldValue = document.getElementById(fieldId).value;
    if ((fieldValue == "")||(fieldValue.trim()=="")){
        alert(errMessage);
        return false;
    }else{
        return isFormValid;
    }
}

function isTextFieldContansNumb(fieldId, errMessage, isFormValid){
    var re = /\d/;
    var fieldValue = document.getElementById(fieldId).value;
    if(re.test(fieldValue)){
        alert(errMessage);
        return false;
    }else{
        return isFormValid;
    }
}

function isRadioButtonDoNotChecked(fieldId,errMessage, isFormValid){
    if(!document.getElementById(fieldId).checked == true){
        alert(errMessage);
        return false;
    }else{
        return isFormValid;
    }
}