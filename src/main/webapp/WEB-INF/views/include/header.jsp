<!-- <link rel="stylesheet" href="resources/css/header.css"> -->
<!-- <script src="resources/js/header.js"></script> -->

<style>
.nav-link {
	color: white;
}

.nav {
	background-color: #f8f9fa !important;
	padding: 0px;
}

.nav .nav-item a {
	color: #4650DD;
	font-size: 20px;
	font-family: sans-serif;
}

.nav .nav-item a:hover {
	color: #4650DD;
	text-decoration: 2px solid underline #4650DD;
}

.nav .nav-item a.active {
	background-color: #4650DD;
	color: white;
}

#header {
	/* margin-bottom: 10px; */
	height: 100%;
}
</style>

<script type="text/javascript">
	/* $('.nav .nav-item a').on('click', function(e) {
		e.preventDefault();
		let menu = $(this).attr('href');
		let submenu = $(this).attr('rel')
		$('.nav .nav-item a').removeClass('active');
		$(this).toggleClass('active');
	}) */
</script>

<div id="header">
	<ul class="nav justify-content-center">
		<li class="nav-item"><a
			href="./pageredirect/loadTopMenu?pageName=home" rel="home"
			class="nav-link">Home</a></li>
		<li class="nav-item"><a
			href="./pageredirect/loadTopMenu?pageName=aboutus" rel="aboutus"
			class="nav-link">About Us</a></li>
		<li class="nav-item"><a
			href="./pageredirect/loadTopMenu?pageName=contactus" rel="contactus"
			class="nav-link">Contact Us</a></li>
	</ul>
</div>
