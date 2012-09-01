<% include '/WEB-INF/includes/_header.gtpl' %>
   <body class="home blog">
      <div id="page">
         <div id="leftColumn">
            <div id="logo">
               <div class="ui360 ui360-vis" id="ui360player" style="width: 50px; margin: 0 auto;">
                  <a href="/songs/teoh.mp3"></a>
               </div>  
            </div> 
            <div id="slides">
               <div class="slides_container">
                  <a href="post.html"> 
                     <img width="235" height="345" src="images/content/poster2-235x345.jpg" alt="poster" />
                     <span>FEB 2 - Lorem Ipsum Dolor Sit Amet</span>
                  </a>
                  <a href="/post.html">
                     <img width="235" height="345" src="images/content/jonathan-patterson-large-235x345.jpg" alt="jonathan-patterson-large" />
                     <span>OCT 1 - Lorem ipsum dolor sit amet</span>
                  </a>
                  <a href="post.html">
                     <img width="235" height="235" src="images/content/NeroWelcomeReality-235x235.png" alt="NeroWelcomeReality" />
                     <span>Nero - Welcome Reality</span>
                  </a>
                  <a href="post.html/">
                     <img width="235" height="345" src="images/content/poster3-235x345.jpg" alt="poster" />
                     <span>DEC 26 - Lorem Ipsum Dolor Sit Amet</span>
                  </a>
                  <a href="post.html">
                     <img width="235" height="235" src="images/content/4x412-packshot-235x235.jpg" alt="4x412-packshot" />
                     <span>Deadmau5 - 4x4=12</span>
                  </a>
               </div>
               <a href="#" class="next">&rarr;</a><a href="#" class="prev">&larr;</a>
            </div>
         </div>
         <div id="sidebar">
            <ul>
               <li class="widget">
                  <h2 class="widgettitle">Upload new song</h2>

                  <div class="widgetcontent">
                     <div id="respond"> 
                     <form action="/test" method="post" id="commentform">
                        <p id="flashContent"> Flash 9+ requered </p>
                        <p>or enter url</p>
                        <p><input type="text"  name="streamUrl" tabindex="1" aria-required="true" /></p>
                        <p>Title</p>
                        <p><input type="text" name="title" size="22" tabindex="2" aria-required="true" /></p>
                        <p>Artist</p>
                        <p><input type="text" name="artist" value="" size="22" tabindex="3" aria-required="true" /> </p>
                        <p>Genre</p>
                        <p><input type="text" name="genre" size="22" tabindex="4" /></p> 
                        <p>Album</p>
                        <p><input type="text" name="album"  size="22" tabindex="5" /></p>
                        <p>Lyrics</p>
                        <p><textarea name="description"  value="" size="22" tabindex="6" cols="100%" rows="10"></textarea></p>
                        <button style="float:right;">Submit</button>
                        <div class="clear"><div>
                     </form>
                  </div>
                  </div>
               </li> 
               <li class="widget">
                  <h2 class="widgettitle">Tags Widget</h2>
                  <div class="widgetcontent">
                     <div class="widget_tag_cloud">
                        <a href="#">2011</a>
                        <a href="#">2012</a>
                        <a href="#">Another Tag Example</a>
                        <a href="#">Bass</a>
                        <a href="#">Bounce</a>
                        <a href="#">Chorus</a>
                        <a href="#">Dance</a>
                        <a href="#">Friday</a>
                        <a href="#">Heart Pounding</a>
                        <a href="#">Pounding</a>
                        <a href="#">Tag Example</a>
                        <a href="#">Yet Another</a>
                     </div>
                  </div>
               </li>
            </ul>
         </div>
         <div id="mainContainer">
            <div id="navigation">
               <ul id="dropmenu">
                  <li class="current-menu-item"><a href="index.html">Home</a></li>
                  <li><a href="about.html">About</a></li>
                  <li><a href="gallery.html">Gallery</a></li>
                  <li><a href="blog.html">Blog</a></li>
                  <li>
                     <a href="#">Drops</a>
                     <ul class="sub-menu">
                        <li>
                           <a href="#">Unlimited Colors</a>
                           <ul class="sub-menu">
                              <li class="purpleColors bgColors"><a href="#">Royal</a></li>
                              <li class="yellowColors bgColors"><a href="#">Sunshine</a></li>
                              <li class="greenColors bgColors"><a href="#">Earth</a></li>
                              <li class="blueColors bgColors"><a href="#">Sky</a></li>
                              <li class="redColors bgColors"><a href="#">Blood</a></li>
                           </ul>
                        </li>
                        <li><a href="#">Sub Menu Example</a></li>
                        <li><a href="#">Another Menu Example</a></li>
                        <li><a href="#">Sample Long Page Title</a></li>
                        <li>
                           <a href="#">Sub Menu</a>
                           <ul class="sub-menu">
                              <li><a href="#">What What?!</a></li>
                              <li><a href="#">Um, What?!</a></li>
                              <li><a href="#">Are you kidding me?!</a></li>
                              <li><a href="#">You&#8217;re Joking, right?!</a></li>
                           </ul>
                        </li>
                     </ul>
                  </li>
                  <li><a href="contact.html">Contact</a></li> 
               </ul>
            </div>
            <div id="main">
               <div class="listingContainer">
                  <div class="listing">
                     <a class="thumbLink" href="post.html"><img width="510" height="750" src="images/content/noiz.jpg" class="attachment-post-thumbnail" alt="noiz" /></a>
                     <div id="rightColumn">
                        <div class="navigation">
                           <div id="backpage" class="pagenav"><a href="index_page3.html" class="previouspostslink">&larr;</a></div>
                           <div id="nextpage" class="pagenav"><a href="index_page2.html" class="nextpostslink">&rarr;</a></div>
                           <div class="whereAmI">1 of 3</div>
                        </div>
                        <div class="post">
                           <div class="backGroundImg">images/content/nov2.jpg</div>
                           <h2 class="posttitle"><a href="post.html" rel="bookmark" title="Permanent Link to JAN 12 &ndash; Lorem ipsum dolor sit amet">JAN 12 - Lorem ipsum dolor sit amet</a></h2>
                           <div class="entry">
                              <p>This area utilizes the post excerpt field on post edit screens. This content is separate from the rest of the content, so you can write a nice little intro here.</p>
                              <div class="clear"></div>
                           </div>
                           <a class="morePost" href="post.html">More &rarr;</a>        
                        </div>
                        <ol class="songs">
                           <li><a href="#" title="title">Music</a></li>
                        </ol>
                     </div>
                  </div> 
               </div>    
            </div> 
            <script type="text/javascript">
               soundManager.url = '/swf/';
               soundManager.flashVersion = 9; // optional: shiny features (default = 8)
               soundManager.useFlashBlock = false; // optionally, enable when you're ready to dive in
               soundManager.useHighPerformance = true;
               soundManager.wmode = 'transparent';
               soundManager.useFastPolling = true;  
               SC.initialize({
                  client_id: '9852543170df60b358d27d2a547daa94',
                  redirect_uri: 'http://cloudmongolia.appspot.com'
               });
               soundManager.onready(function() { 
                  fetchMusic("${request.streamUrl?:'http://soundcloud.com/merie-ksaier/bedshaped'}"); 
                });
            </script>
<% include '/WEB-INF/includes/_footer.gtpl' %>