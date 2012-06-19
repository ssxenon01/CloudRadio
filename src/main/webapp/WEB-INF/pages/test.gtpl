<% include '/WEB-INF/includes/header.gtpl' %>
<div class="hero-unit">
<h1>Test page</h1>

<script src="http://connect.soundcloud.com/sdk.js"></script>
<script type="text/javascript">

	soundManager.url = '/swf/';
	soundManager.flashVersion = 9; // optional: shiny features (default = 8)
	soundManager.useFlashBlock = false; // optionally, enable when you're ready to dive in
    soundManager.useHighPerformance = true;
    soundManager.wmode = 'transparent';
    soundManager.useFastPolling = true;
    SC.initialize({
        client_id: '9852543170df60b358d27d2a547daa94',
        redirect_uri: 'http://localhost:8080'
    });
    soundManager.onready(function() {
        var client_id = "9852543170df60b358d27d2a547daa94",url = "http://soundcloud.com/gramatik/dont-let-me-down-remix";
        \$.getJSON('http://api.soundcloud.com/resolve.json?url=' + url + '&client_id=' + client_id + '&callback=?', function(track){
            soundManager.createSound({
                id: 'track_' + track.id,
                url: track.stream_url+'?client_id='+client_id,
                autoPlay:true
            });
        });
    });
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

