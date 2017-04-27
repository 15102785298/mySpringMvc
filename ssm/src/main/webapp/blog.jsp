<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>wbCook &mdash; WelCome to tt's Bolg</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />



<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link
	href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,600,400italic,700'
	rel='stylesheet' type='text/css'>

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->


<style>
.div-hight {
	hight: 5px
}
</style>

</head>
<body>

	<div class="fh5co-loader"></div>

	<div id="page">
		<nav class="fh5co-nav" role="navigation">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 text-center">
						<div id="fh5co-logo">
							<a href="index.html">欢迎来到 wbCook<span>.</span></a>
						</div>
					</div>
					<div class="col-xs-12 text-center menu-1">
						<ul>
							<a href="index.html">主页</a>
							</li>
							<li class="has-dropdown"><a href="contact.html">简历</a>
								<ul class="dropdown">
									<li><a href="https://github.com/15102785298/">GitHub</a></li>
									<li><a href="http://tantian950315.top/">Resume</a></li>
									<li><a href="#">MyVideo</a></li>
								</ul></li>

							<li><a href="work.html">作品</a></li>
							<li class="active"><a href="blog.html">博客</a></li>
						</ul>
					</div>
				</div>

			</div>
		</nav>

		<header id="fh5co-header" class="fh5co-cover" role="banner"
			style="background-image: url(http://119.29.181.18/images/img_bg_4.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-md-offset-0 text-center">
						<div class="display-t">
							<div class="display-tc animate-box"
								data-animate-effect="fadeInUp">
								<h1 class="mb30">My Blog</h1>
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>

		<s:property value="blog_data" />

		<div id="fh5co-blog" class="fh5co-bg-section">
			<div class="container">
				<div class="row animate-box row-pb-md"
					data-animate-effect="fadeInUp">
					<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
						<span>Thoughts &amp; Ideas</span>
						<h2>My Blog</h2>
						<p>欢迎来到我的博客. 如果您发现博客中的问题希望您能够指出. 让我们一起进步.</p>
						<li><a href="contact.html">联系他</a></li>
					</div>
				</div>


			<script type="text/javascript">
				var data_in = ${data};
				var responseHtml = "";
				for(var i =0;i<data_in.length;i++){
				 responseHtml =responseHtml + '<div class="row">'+
					'<div class="div-hight col-md-4 col-sm-4 animate-box"'+
						'data-animate-effect="fadeInUp">'+
						'<div class="fh5co-post">'+
							'<span class="fh5co-date">'+
							data_in[i].blog_date+
							'</span>'+
							'<h4>'+
							'	<a href="#">'+data_in[i].blog_title+'</a>'+
							'</h4>'+
							'<p>'+data_in[i].blog_content+'</p>'+
							'<p class="author">'+
							'	<img src="images/person1.jpg"'+
							'		alt="Free HTML5 Bootstrap Template by FreeHTML5.co"> <cite>'+
							'		TAN TIAN</cite>'+
							'</p>'+
						'</div>'+
					'</div>';
				}
				document.write(responseHtml);
			</script>


					<div class="col-md-12 text-center">
						<nav aria-label="Page navigation">
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
								</a></li>
								<li class="active"><a href="#">1</a></li>
								<!--	 <li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>-->
								<li><a href="#" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>




		<div id="fh5co-started">
			<div class="container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
						<span>Let's work together</span>
						<h2>Start Your Project</h2>
						<p>Dignissimos asperiores vitae velit veniam totam fuga
							molestias accusamus alias autem provident. Odit ab aliquam dolor
							eius.</p>
						<p>
							<button type="submit" class="btn btn-default">Get In
								Touch</button>
						</p>
					</div>
				</div>
			</div>
		</div>

		<footer id="fh5co-footer" role="contentinfo">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-4 fh5co-widget ">
						<h3>wbCook.</h3>
						<p>wbCook 做知识的烹饪大师.</p>
						<p>
							<a href="index.html">Learn More</a>
						</p>
					</div>
				</div>

				<div class="row copyright">
					<div class="col-md-12 text-center">
						<p>
							<small class="block">&copy; 2017 WBCOOK . All Rights
								Reserved.</small>
						</p>
						<p>
						<ul class="fh5co-social-icons">
							<li><a href="https://twitter.com/"><i
									class="icon-twitter"></i></a></li>
							<li><a href="https://www.facebook.com/"><i
									class="icon-facebook"></i></a></li>
							<li><a href="https://www.linkedin.com/"><i
									class="icon-linkedin"></i></a></li>
							<li><a href="https://dribbble.com/"><i
									class="icon-dribbble"></i></a></li>
						</ul>
						</p>
					</div>
				</div>

			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

</body>
<script>
	window.onload = function() {
		/*document.getElementById("time_1").textContent="sdafsdfsdfasddddddddddaa12";
		document.getElementById("title_1").textContent="sdafsdfsdfdasssssssssssssddddasddddddddddaa12";
		document.getElementById("content_1").innerText="sdafsdfsdfasddddddddddaa12";*/
	}
</script>

</html>

