/**
 * 
 */
$(function() {
	var $registerForm = $("#register");
	$registerForm.validate({
		rules: {
			username: {
				required: true
			}
		},
		messages: {
			username: {
				required:'username must be required!!!'
			}
		}
	})
})