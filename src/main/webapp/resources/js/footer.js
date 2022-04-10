$(document).ready(function () {
    $('.nav .nav-item .nav-link:first').click();
});

$('.nav .nav-item a').on('click', function (e) {
    e.preventDefault();
    let url = $(this).attr('href');
    let menu = $(this).attr('rel');
    let submenu ='default';
    	$('.nav .nav-item a').removeClass('active');
		$(this).toggleClass('active');
    pageLoad(url, menu, submenu);
});


function pageLoad(url, menu, submenu) {
    $('#pageContent').load(url, function (responseText, textStatus, xhr) {
        if (textStatus == 'success') {
            $('body').attr('data-submenu-type',submenu).attr('data-menu-type',menu)
            if (history.pushState) {
                window.history.pushState(null, null, window.location.href.split("?")[0] + "?menu=" + menu + "&submenu=" + submenu);
            }
        }
    });
}