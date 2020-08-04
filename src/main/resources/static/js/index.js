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
    console.log("fitImageSize : " + href)
    var image = new Image();
    var maxWidth = document.getElementById('list_ci').offsetWidth/2;
 	var maxHeight = document.getElementById('list_ci').offsetHeight;

 	image.onload = function(){
 	console.log(href + " onload")
	var width = image.width;
	var height = image.height;
	var scalex = maxWidth / width;
	var scaley = maxHeight / height;

	var scale = (scalex < scaley) ? scalex : scaley;
    if (scale > 1)
        scale = 1;

        obj.width = scale * width;
		obj.height = scale * height;
//		obj.style.display = "";
	}
	image.src = href;
}

function img_resize(img){
    console.log("img_resize")
    var myWidth = document.getElementById('list_ci').offsetWidth/2;
    var myHeight = document.getElementById('list_ci').offsetHeight;

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
    textareaKeyword.setAttribute('class', 'list_keyword');
    document.getElementById('list'+idx).appendChild(textareaKeyword);
    document.getElementById('textareaKeyword'+idx).innerHTML += createInput(idx);

}

function createInput(idx){
    return "<center><textarea id='inputTextarea"+idx+"'></textarea><button type='button' id='bttClick"+idx+"' onClick='output("+idx+")'>COMPLETE</button></center>"
}


function output(idx){
    document.getElementById('list'+idx).innerHTML += createOutput(idx);
    document.getElementById('list'+idx).removeChild(document.getElementById('textareaKeyword'+idx));
}

function createOutput(idx){
    var inputText = document.getElementById('inputTextarea'+idx).value;
    if(!inputText)
        inputText = "Enter the Keywords(double click)";
    return "<div class='list_keyword' id='printKeyword"+idx+"' ondblclick='input("+idx+")'><table id='keywordbox'><tr><td style='vertical-align:middle; word-break:normal;'>"+inputText+"</td></tr></table></div>";
}

function changeImage(idx, name){
    console.log(idx + " " + name)
    var upload = document.querySelector("#upload"+idx);
    upload.addEventListener('change', function(e){
       var get_file = e.target.files;
       var image = document.querySelector("#ciImg"+idx);
       /*FileReader 객체 생성*/
       var reader = new FileReader();

       /*reader 시작 시 함수 구현*/
       reader.onload = (function (aImg){
          console.log(1);
          return function(e){
             /*Base64 인코딩 된 스트링 데이터*/
             // --- 이미지 확장자 검사 --- //
             var name = get_file[0].name;
             var ext = name.substring(name.indexOf(".") + 1, name.length).toLowerCase();
             if(ext == "png" || ext == "jpg"){
                alert("해당 파일은 이미지 파일 입니다.");
//                  console.log(e.target.result);
                aImg.src = e.target.result;
//                  fitImageSize(this, window.atob(e.target.result), 70, 70);
             }
             else
                alert("해당 파일은 이미지 파일이 아닙니다.");
          }
       })(image)

       if(get_file){
            /* get_file[0]을 읽어서 read 행위가 종료되면 loadend 이벤트가 트리거 되고 onload에 설정했던 return으로 넘어간다.
            이와 함께 base64 인코딩 된 스트링 데이터가 result 속성에 담겨진다. */

          reader.readAsDataURL(get_file[0])
          console.log(2);
       }
    });
    upload.click();
}