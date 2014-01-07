function loginValidation()
  {
	var xmlhttp= new XMLHttpRequest;
	var name= getElementbyId('studentName').value;
	var password = getElementById().value;
	alert(name " + " password);

	xmlhttp.onreadystatechange= function()
	{
		if(xmlhttp.readystate==4 && status==200)
			{
				
			}
		}

  		if ((document.getElementById('studentName').value).trim() == "") {
  			document.getElementById('studentName').style.borderColor="red";
  			return false;
  		} 
  		if(document.getElementById('pwd').value.trim()==""){
  			document.getElementById('pwd').style.borderColor="red";
  			return false;
  			
  			
  			
  		}
  	}