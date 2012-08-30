        <div id="footer">
            <div id="backTop"></div>
            <div id="copyright">Design by <a href="#" title="Designed &amp; Developed by Molitor">MOLITOR</a>
            </div>
            <div id="socialStuff">
                <a class="socialicon" id="rssIcon" href="#" title="Subscribe via RSS" rel="nofollow"></a> 
                <a class="socialicon" id="youtubeIcon" href="#" title="YouTube Channel" rel="nofollow"></a>
                <a class="socialicon" id="myspaceIcon" href="#" title="MySpace" rel="nofollow"></a>
                <a class="socialicon" id="vimeoIcon" href="#" title="Vimeo Profile" rel="nofollow"></a> 
                <a class="socialicon" id="facebookIcon" href="#" title="Facebook Profile" rel="nofollow"></a>
                <a class="socialicon" id="twitterIcon" href="#" title="Follow on Twitter" rel="nofollow"></a>
            </div>
            </div>
         </div>
         <div class="clear"></div>
      </div>
      <script src="scripts/prettyphoto.js"></script>
      <script src="scripts/backstretch.js"></script>
      <script src="scripts/audio.js"></script>
      <script src="scripts/slides.js"></script>
      <script src="scripts/custom.js"></script>
      <script>
        jQuery.noConflict(); 
        jQuery(document).ready(function(){
            jQuery.backstretch("images/content/nov2.jpg", {speed: 300});
            jQuery('#slides').slides({
                hoverPause: true,
                autoHeight: true,
                play: 10000,
                pause: 2500,
                generatePagination: false,
                slideSpeed: 800
            });
            jQuery('.bgColors').click(function(){
                var theColor = jQuery(this).children('a').css('backgroundColor');
                jQuery('#dropmenu li.current-menu-item > a,#dropmenu li.current-menu-ancestor > a,.slides_container a span,#sideToggle.open,#sidebar .widget_tag_cloud a,#commentform input[type="submit"],input[type="submit"],.whereAmI,ol.songs li.playing a,#theTags a,#backTop').css({backgroundColor:theColor});
                jQuery('h2 a, .songs a, #footer a, .morePost, .post a, .postInfo a').not(".playing a").css({color:theColor});});});
      </script>
      <div id="mesh"></div>
   </body>
</html>