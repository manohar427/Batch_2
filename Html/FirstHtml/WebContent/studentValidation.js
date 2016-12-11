function validateFields() {
		var fname = document.student.fname.value;
		var lname = document.student.lname.value;
		var email = document.student.email.value;
		var dob = document.student.dob.value;
		var gender = document.student.gender;
		var skills = document.student.skills;
		var university = document.student.university.value;
		var address = document.student.address.value;
		
		if (fname.length == 0) {
			alert("Please provide fname");
			document.student.fname.select();
			document.student.fname.style.background = "red";
			return;
		}
		if (lname.length == 0) {
			alert("Please provide lname");
			document.student.lname.select();
			document.student.lname.style.background = "red";
			return;
		}
		if (email.length == 0) {
			alert("Please provide email");
			return;
		}
		if (dob.length == 0) {
			alert("Please provide dob");
			return;
		}
		if (gender.value.length == 0) {
			alert("Please provide Gender");
			return;
		}
		var checked = 0;
		for ( var i = 0; i < skills.length; i++) {
			if (skills[i].checked == true) {
				++checked;
			}
		}
		if (checked == 0) {
			alert("Please select skills");
			return;
		}
		if (checked != 2) {
			alert("Please select  two skills");
			return;
		}
		
		if(university == "select"){
			alert("Please select University");
			return;
		}
		
		if (address.length == 0) {
			alert("Please provide address");
			return;
		}
	}

function changeColor() {
	document.student.fname.style.background = "white";
}
function changeColorLname(){
	document.student.lname.style.background = "white";
}