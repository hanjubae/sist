<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"src="xmlhttp.js"></script>
</head> 
<body>
<h1>Json 데이터 표시</h1>
<form name="ajaxForm">
   <input type="button"value="Json파일읽기"onclick="loadDataFile('jsondata.json')"><br>    
   <!--제이손 데이터 읽어오기  -->
</form>

<div id="result"></div>

<script type="text/javascript">
function loadDataFile(fName) {
      httpObj = createXMLHttpRequest(displayData);
      if(httpObj){
         httpObj.open("get", fName, true);
         httpObj.send(null);
      }
   }
function displayData() {
      if((httpObj.readyState == 4) && (httpObj.status == 200)){
      document.getElementById("result").innerHTML = parseJSON(httpObj.responseText);
      /*파씽 */
      }
    }
function parseJSON(jsData) {
   var data = eval("("+ jsData + ")");
   var resultData = "[" + data.아이템코드+ "]" + data.아이템명+ " : " + data.아이템가격 + "원";
   
   return resultData;
}
</script>

</body>
</html>