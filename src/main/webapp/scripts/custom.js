//REMOVE TITLE ATTRIBUTE
jQuery("#dropmenu a").removeAttr("title");
	
//MENU
jQuery("#dropmenu ul").css("display", "none").parent().children("a").append("<span>&nbsp;&nbsp;+</span>");
jQuery("#dropmenu li").hover(function(){
	jQuery(this).find('ul:first').stop(true,true).slideDown(200);
	},function(){
	jQuery(this).find('ul:first').stop(true,true).slideUp(200);
});
jQuery("#dropmenu ul li a").hover(function(){
	jQuery(this).stop(true,true).animate({paddingLeft:"20px"},200);
}, function(){
	jQuery(this).stop(true,true).animate({paddingLeft:"12px"},200);
});	

//PRETTY PHOTO
jQuery("a[rel^='prettyPhoto']").prettyPhoto({
	animation_speed: 'normal', // fast/slow/normal 
	opacity: 0.35, // Value betwee 0 and 1 
	show_title: false, // true/false 
	allow_resize: true, // true/false 
	overlay_gallery: false,
	counter_separator_label: ' of ', // The separator for the gallery counter 1 "of" 2 
	theme: 'dark_square', // light_rounded / dark_rounded / light_square / dark_square 
	hideflash: true, // Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto 
	modal: false // If set to true, only the close button will close the window 
});

//SIDEBAR TOGGLE STUFF
jQuery("#leftColumn").prepend("<div id='sideToggle'>+</div>");
var sideToggle = jQuery("#sideToggle"),
	sidebar = jQuery('#sidebar'),
	mainContainer = jQuery('#mainContainer');
sideToggle.click(function(){
	if(jQuery(this).hasClass('open')){
		jQuery(this).html('+');
	} else {
		jQuery(this).html('&times;');
	}
	jQuery(this).toggleClass('open');
	sidebar.toggleClass('open');
});
sideToggle.toggle(function(){
	sidebar.toggle(500);
	mainContainer.stop(true,true).animate({marginRight:"-237px"},300);
},function(){
	sidebar.toggle(500);
	mainContainer.stop(true,true).animate({marginRight:"0"},500);
});	

//BACK TO TOP STUFF
var backTop = jQuery("#backTop");
backTop.click(function(){
	jQuery("html,body").animate({scrollTop:0},499);
});
jQuery(document).scroll(function(){
	if(jQuery(document).scrollTop()>0){
		backTop.stop(true,true).slideDown(200);
	} else {
		backTop.stop(true,true).slideUp(200);
	}
});

//SHOW NAVIGATION AND WIDGET TOGGLE AFTER LOAD
var navigation = jQuery('.navigation');
jQuery(window).load(function(){
	navigation.first().slideDown(300);
	sideToggle.slideDown(300);
});

//SONG STUFF
var songLink = jQuery("ol.songs li a");
songLink.live('mouseover', function(){
	jQuery(this).stop(true,true).animate({paddingLeft:"35px"},200);
});
songLink.live('mouseout', function(){
	jQuery(this).stop(true,true).animate({paddingLeft:"30px"},200);
});
//SHOW SONGS FUNCTION
function showSongs(){
	jQuery("ol.songs li").each(function() {
		var delayAmount = jQuery(this).index() * 200;
		jQuery(this).delay(delayAmount).animate({left:"0px"},500);
	});
}
//SHOW SONGS WHEN PAGE LOADS
jQuery(window).load(function(){
	showSongs();
});

//AJAX STUFF
var slidePage = function(url,next){  
	var leftSide = "-745px", rightSide = "745px";
	var first = next ? leftSide : rightSide;
	var second = next ? rightSide : leftSide;  
	//SHOW THE LOADING MESSAGE
	jQuery('.navigation').html("<div id='loading'>Loading...</div>"); 
	//ADD THE AJAX CONTAINER
	jQuery(".listingContainer").append('<div id="loadHere"></div>'); 
	//POSITION THE AJAX CONTAINER
	jQuery("#loadHere").css({left:second}).load(url + " .listing",'', function() { 
		//GRAB THE BG IMG
		var backImg = jQuery("#loadHere .backGroundImg").html(); 
    	//LOAD BG IMG
    	if(backImg){jQuery.backstretch(backImg, {speed: 300});}  
    	//ANIMATE NEW ITEM
    	jQuery(this).animate({left:"0"},700); 
    	//IF NO NEXT LINK
    	if(!jQuery("#loadHere .nextpostslink").length){
    		jQuery("#loadHere #nextpage").append('<a class="nextpostslink" href="">&rarr;</a>');
    	} 
    	//ANIMATE OLD ITEM
    	jQuery(".listingContainer > .listing").animate({left:first},700,function(){ 
   			//REMOVE OLD ITEM AND LOADING MSG
   			jQuery(".listingContainer > .listing, #loading").remove(); 
   			//REMOVE DIV CONTAINER
   			jQuery("div > .listing").unwrap("<div></div>"); 
   			jQuery('.navigation').first().slideDown(300); 
   			showSongs(); 
    	});
   	}); 
}
jQuery("div.pagenav a").live('click',function() {  
	var url = jQuery(this).attr('href'), next = (jQuery(this).attr("class") == "nextpostslink");
	slidePage(url,next);
	return false;
});//END AJAX STUFF
 	  

//MESH BACKGROUND STUFF
function docHeight(){
	var documentHeight = jQuery(document).height();
	jQuery("#mesh").css({height:documentHeight});		
}
jQuery(document).ready(function(){
	docHeight();
});
jQuery(window).resize(function(){
	docHeight();
});
function fetchMusic(url){ 
	var client_id = "9852543170df60b358d27d2a547daa94";
    jQuery.getJSON('http://api.soundcloud.com/resolve.json?url=' + url + '&client_id=' + client_id + '&callback=?', function(track){
        threeSixtyPlayer.playSound(track); 
        slidePage('/content/30',true);
    });
}
jQuery('#file-chooser').change(function(a){
	var file = a.target.files[0];  
	if(file){ 
		console.log(jQuery('#commentform').attr('action'));
		var fd = new FormData()
		fd.append('track[title]','title name');
		fd.append('myFile',file);  
		options = {}
		var xhr = new XMLHttpRequest(), upload = xhr.upload;
        //progress : function(event)
        upload.addEventListener("progress", options.progress, false);
        //complete : function(event)
        upload.addEventListener("load", options.complete, false);
        upload.addEventListener("error",function(){console.log(xhr.responseText);}, false);
        xhr.open('POST', jQuery('#commentform').attr('action'));
        xhr.onreadystatechange = function () {
            if (xhr.readyState != 4) {
                return;
            }
            console.log(xhr.responseText); 
        };
        xhr.send(fd);
	}
});
var upload = function(file){
	SC.connect(function() { 
		
		//SC.post('/tracks', {track:{title:'asd'}},function(callback){console.log(callback); });
	});
}
jQuery("ol.songs li a").live('click',function(a) {  
	console.log(a);
	// var url = jQuery(this).attr('href'), next = (jQuery(this).attr("class") == "nextpostslink");
	// slidePage(url,next);
	return false;
});