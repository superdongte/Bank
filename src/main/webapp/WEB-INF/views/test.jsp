<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
   href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
   integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
   crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container">
   <div class="card-deck mb-3 text-center">
      <div class="card mb-4 shadow-sm">
         <span class="my-0 font-weight-normal">${weather }</span>
         <span class="my-0 font-weight-normal">${weather2 }</span>
         <span class="my-0 font-weight-normal">${weather3 }</span>
         <span class="my-0 font-weight-normal">${weather4 }</span>
      </div>

      <div class="card mb-4 shadow-sm">
         <span class="my-0 font-weight-normal">잔액기준 COFIX</span>
         <span class="my-0 font-weight-normal">공시일: 2021.12.15.</span>
         <span class="my-0 font-weight-normal">1.19%</span>
         <span class="my-0 font-weight-normal">다음 공시일: 2022.01.17..</span>
      </div>
   </div>
</div>

</body>
</html>