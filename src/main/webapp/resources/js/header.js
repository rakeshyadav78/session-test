$('.nav .nav-item a').on('click', function (e) {
    e.preventDefault();
    let menu = $(this).attr('href');
    let submenu = $(this).attr('rel')
    $('.nav .nav-item a').removeClass('active');
    $(this).toggleClass('active');
})