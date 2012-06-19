<% include '/WEB-INF/includes/header.gtpl' %>
<div class="hero-unit">
<h1>Test page</h1> 


<script type="text/javascript">
	soundManager.url = '/swf/';
	soundManager.flashVersion = 9; // optional: shiny features (default = 8)
	soundManager.useFlashBlock = false; // optionally, enable when you're ready to dive in
 
</script>
<p>
    <%
        log.info "outputing the datetime attribute"
    %>
    <div class="ui360"><a href="/resources/twinkle.mp3"></a></div>

    The current date and time: <%= request.getAttribute('datetime') %> 
</p>
</div>
<% include '/WEB-INF/includes/footer.gtpl' %>

