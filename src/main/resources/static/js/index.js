function getTodayDate(){
    var today = new Date();
    var year = today.getFullYear(); // 년도
    var month = today.getMonth() + 1;  // 월
    var date = today.getDate();  // 날짜
    document.getElementById("date").textContent = year + '/' + month + '/' + date;
}

window.onload = function(){
    getTodayDate();
}

function fitImageSize(obj, href, maxWidth, maxHeight) {
    var image = new Image();
    var maxWidth = document.getElementById('company').offsetWidth/2;
 	var maxHeight = document.getElementById('company').offsetHeight;

 	image.onload = function(){

	var width = image.width;
	var height = image.height;
	var scalex = maxWidth / width;
	var scaley = maxHeight / height;

	var scale = (scalex < scaley) ? scalex : scaley;
    if (scale > 1)
        scale = 1;

        obj.width = scale * width;
		obj.height = scale * height;
		obj.style.display = "";
	}
	image.src = href;
}

function img_resize(img){
    console.log("img_resize")
    var myWidth = document.getElementById('company').offsetWidth/2;
    var myHeight = document.getElementById('company').offsetHeight;

    if( img.height > myHeight ){
        r = myHeight / img.height;
        h = img.height * r;
        img.height = h;
    }
    if(img.width > myWidth){
        r = myHeight / img.height;
        w = img.width * r;
        img.width = w;
    }
}

function input(idx){
    console.log("input")
    document.getElementById('list'+idx).removeChild(document.getElementById('printKeyword'+idx));
    var textareaKeyword = document.createElement('div');

    textareaKeyword.setAttribute('id', 'textareaKeyword'+idx);
    textareaKeyword.setAttribute('class', 'keyword');
    document.getElementById('list'+idx).appendChild(textareaKeyword);
    document.getElementById('textareaKeyword'+idx).innerHTML += createInput(idx);

}

function createInput(idx){
    return "<center><textarea id='inputTextarea"+idx+"'></textarea><br><button type='button' id='bttClick"+idx+"' onClick='output("+idx+")'>COMPLETE</button></center>"
}


function output(idx){
    document.getElementById('list'+idx).innerHTML += createOutput(idx);
    document.getElementById('list'+idx).removeChild(document.getElementById('textareaKeyword'+idx));
}

function createOutput(idx){
    var inputText = document.getElementById('inputTextarea'+idx).value;
    if(!inputText)
        inputText = "Enter the Keywords<br>(double click)";
    return "<div class='keyword' id='printKeyword"+idx+"' ondblclick='input("+idx+")'>"+inputText+"</div>";
}