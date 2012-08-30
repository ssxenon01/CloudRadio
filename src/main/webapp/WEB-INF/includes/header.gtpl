<!doctype html>
<html>
<head>
  <title>Gaelyk</title>
  <link rel="shortcut icon" href="/images/gaelyk-small-favicon.png" type="image/png">
  <link rel="icon" href="/images/gaelyk-small-favicon.png" type="image/png">
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
  <link rel="stylesheet" type="text/css" href="/css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" type="text/css" href="/css/360player.css">
  <link rel="stylesheet" type="text/css" href="/css/360player-visualization.css">
  <script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="/js/berniecode-animator.js"></script>
  <script type="text/javascript" src="/js/soundmanager2.js"></script>
  <script type="text/javascript" src="/js/360player.js"></script>
  <style type="text/css">
      body {
          padding-top: 60px;
      }
      
      .center {
        text-align: center;
      }
  </style>
</head>
<body>
<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=404973242877054";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

   <div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="/"><img src="/images/gaelyk-logo.png"/></a>
			<div class="nav-collapse">
				<ul class="nav">
					<li class="${request.servletPath == '/WEB-INF/pages/index.gtpl' ? 'active' : ''}"><a href="/">Home</a></li>
					<li class="${request.servletPath == '/WEB-INF/pages/datetime.gtpl' ? 'active' : ''}"><a href="/datetime">Current Time</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	</div>

    <div class="container">
