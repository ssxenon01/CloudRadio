<% include '/WEB-INF/includes/_header.gtpl' %>
<!-- Banner Start -->
    <div id="sub-banner">
    	<div class="in">
        	<a href="#"><img src="/images/sub-banner4.jpg" alt="" /></a>
        </div>
    </div>
    <!-- Banner End -->
    <!-- Content Section Start -->
    <div id="content-sec">
    	<div class="inner">
        	<!-- Columns Section Start -->
            <div class="columns-sec twocol">
            	<!-- Column Three Start -->
                <div class="col3">
                	<div class="blog"> 
                    	<h1 class="heading colr">${request.news?.title}</h1>
                        <!-- Post Detail Start -->
                        <div class="post-detail">
                        	<div class="thumb">
                            	<a href="#"><img src="${request.news.imageUrl?:'/images/img19.jpg'}" alt="" /></a>
                            </div>
                            <div class="desc">
                                <div class="post-opts">
                                	<p>By <a href="#">Myra MacDonald</a></p>
                                    <p>${request.news?.created}</p>
                                    <p><a href="#">129 Comments</a></p>
                                    <p>Tag: <a href="#">Music,</a> <a href="#">Entertainment</a>, <a href="#">Rock</a></p>
                                </div>
                                <p>
                                	${request.news?.content}
                                </p>    
                                <div class="post-share">
                                	<div class="fb-like" data-href="http://google.com" data-send="true" data-width="680" data-show-faces="false" data-colorscheme="dark"></div>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <!-- Post Detail End -->
                        <!-- About Author Start -->
                        <div class="about-author">
                        	<div class="about-inner">
                                <div class="avatar">
                                    <a href="#"><img src="/images/avatar1.jpg" alt="" /></a>
                                </div>
                                <div class="desc">
                                    <h4><a href="#">Moke Roger</a></h4>
                                    <span class="by">Admin</span>
                                    <div class="clear"></div>
                                    <p class="txt">
                                        Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.
                                    </p>
                                    <div class="clear"></div>
                                </div>
                            </div>
                            <div class="clear"></div>
                        </div>
                        <!-- About Author End -->
                        <!-- Comments Start -->
                        <div class="comments">
                            <h1 class="heading colr">Album comments</h1>
                            <div class="fb-comments" data-href="${request.getRequestURL()}" data-num-posts="2" data-width="678" data-colorscheme="dark"></div>
                        </div>
                        <!-- Comments End --> 
                    </div>
                </div>
                <!-- Column One End -->
                <% include '/WEB-INF/includes/_rightSide.gtpl' %>
            </div>
            <!-- Columns Section End -->
        </div>
    </div>
    <!-- Content Section End -->
    <div class="clear"></div>
    <% include '/WEB-INF/includes/_footer.gtpl' %>