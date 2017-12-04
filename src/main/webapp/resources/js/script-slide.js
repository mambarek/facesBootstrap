
jQuery(function($){
    $('.navbar-toggle').click(function(){
    		$('.navbar-collapse').toggleClass('right');
    		$('.navbar-toggle').toggleClass('indexcity');
    		$('.close-icon').toggleClass('hidden');
    		$('.navbar-toggle').toggleClass('hidden');
    	});
    
    $('.navbar-close').click(function(){
        	$('.navbar-collapse').toggleClass('right');
        	$('.navbar-toggle').toggleClass('indexcity');
        	$('.navbar-toggle').toggleClass('hidden');
        	$('.close-icon').toggleClass('hidden');
        });    
});
