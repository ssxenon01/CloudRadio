<% include '/WEB-INF/includes/header.gtpl' %>
<div class="hero-unit">
<h1>Test page</h1>

<script src="http://connect.soundcloud.com/sdk.js"></script> 
<p>
    <%
        log.info "outputing the datetime attribute"
    %>
    <div class="ui360"><a href="/resources/twinkle.mp3"></a></div>

    The current date and time: <%= request.getAttribute('datetime') %> 
</p>
</div>
<% include '/WEB-INF/includes/footer.gtpl' %>

