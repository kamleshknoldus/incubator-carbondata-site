

$(document).ready(function(){

  $('#fullwidth').addClass('fullwidth');

  // display video player
  $('#mList a').on('click',function(e){
    $('#fullwidth').removeClass('fullwidth');

    e.preventDefault();
    // get video url
    var u = $(this).attr('href');
    var i = u.substring(u.search('=')+1,u.length);
    // build player
    $('#mPlayer .videoview').html('<iframe width="640" height="400" src="https://www.youtube.com/embed/' + i + '" frameborder="0" allowfullscreen></iframe>');

    // display player
    $('#mPlayer').fadeIn(500);


  }); // eof display player

  // hide video player
  $('#mPlayer').on('click',function(e){

    // hide player
    $('#mPlayer').fadeOut(500);
    // destroy player
    $('#mPlayer .videoview').empty();

  }); // eof hide player
});