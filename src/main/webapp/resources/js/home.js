$(document).ready(function () {
    $('#homeVerticalMenu a:first').click();
});

$('#homeSideBar ul a').on('click', function (e) {
    $('#homeSideBar ul a').removeClass('active');
    $(this).toggleClass('active');

    e.preventDefault();
    let innerUrl = $(this).attr('href');
    submenu = $(this).attr('rel')
    innerPageLoad(innerUrl, submenu);

})


function innerPageLoad(innerUrl, submenu) {
    $('#homeContent').load(innerUrl, function (responseText, textStatus, xhr) {
        if (textStatus == 'success') {
            let menu = $('body').attr('data-menu-type');
            $('body').attr('data-submenu-type',submenu)
            if (history.pushState) {
                window.history.pushState(null, null, window.location.href.split("?")[0] + "?menu=" + menu + "&submenu=" + submenu);
            }
        }
    });
}
