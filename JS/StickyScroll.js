document.addEventListener("DOMContentLoaded", function() {
    window.onscroll = function() { myFunction() };

    var navbar = document.getElementById("myTopnav");
    var sticky = navbar.offsetTop;

    function myFunction() {
        if (window.pageYOffset >= sticky) {
            navbar.classList.add("sticky");
        } else {
            navbar.classList.remove("sticky");
        }
    }
});

function openNewTab() {
    
    var newTab = window.open('HomePage.html', '_blank');

    setTimeout(function () {
        window.close();
    }, 0); 
}

function openNewTab1() {
    
    var newTab = window.open('AboutTheDev.html', '_blank');

    
    window.close();
}

function openNewTab2() {
    
    var newTab = window.open('IntroductionToJava.html', '_blank');

    
    window.close();
}

function openNewTab3() {
    
    var newTab = window.open('ExploreMoreInJava.html', '_blank');

    
    window.close();
}

function openNewTab4() {
    
    var newTab = window.open('DownloadCompiler.html', '_blank');

    
    window.close();
}
function openNewTab5() {
    
    var newTab = window.open('SamplePrograms.html', '_blank');

    
    window.close();
}

function logout() {
    
    var newTab = window.open('main.html', '_blank');

    
    window.close();
}