<% include '/WEB-INF/includes/_header.gtpl' %> 
<!-- Banner Start -->
    <div id="sub-banner">
    	<div class="in">
        	<a href="#"><img src="/images/sub-banner1.jpg" alt="" /></a>
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
                	<div class="news">
                    	<h1 class="heading colr">Latest news</h1>
                        <ul class="late-news">
                        	
                            <% def counter = 0  
                                request.list.each{  %>
                                <li class="${counter==0?"featured":""}"> 
                                    <div class="thumb"> 
                                        <a href="/news/${it.key.id}"><img src="/images/img1${counter==0?"4":"5"}.jpg" alt="" /></a> 
                                    </div>
                                    <div class="desc">
                                        <h3><a href="/news/${it.key.id}" class="colr">${it.title}</a></h3>
                                        <p class="date">${(it.created)}</p>
                                        <p>
                                            ${it.content.size()>300?it.content[0..250]:it.content}...
                                        </p>
                                        <a href="blog-detail.html" class="readmore">Continue Reading</a>
                                    </div>
                                </li>
                            <% counter++ } %> 
                        </ul>
                        <div class="paging">
                        	<ul>
                            	<li><a href="#">PREVIOUS</a></li>
                                <li><a href="#" class="active">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">23</a></li>
                                <li><a href="#">24</a></li>
                                <li><a href="#">NEXT</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- Column One End -->
                <% include '/WEB-INF/includes/_rightSide.gtpl' %>
            </div>
            <!-- Columns Section End -->
        </div>
    </div>
    <!-- Content Section End -->
<% include '/WEB-INF/includes/_footer.gtpl' %>