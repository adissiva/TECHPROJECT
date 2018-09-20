function getContent(){
	$.ajax({
		url : 'ComparePlus',
		data : {
			issuesDate : $('#issuesDate').val()
		},
		success : function(responseText) {
			$('#ajaxGetUserServletResponse').text(responseText);
		}
	});
	
}