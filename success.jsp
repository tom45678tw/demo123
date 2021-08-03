<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第一次題目</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="javascripts/jquery-3.5.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
         <style type="text/css">
        .main-box {
            margin: 50px auto;
            width: 500px;
            height: 250px;
            padding: 20px;
            box-shadow: 5px 5px 10px #999;
            border: 1px solid #fff;
            text-align: center;
        }
        #p1 form {
            padding: 10px 10px 10px 10px;
            text-align: left;
        }
        #p1 label {
            display: inline-block;
            width: 100px;
            text-align: right;
            margin: 0 15px 0 0;
            color: black;
        }
        #p1 #button1 {
            margin-left: 120px;
        }
        #p1 #fail{
            color: red;
        }
        #p1 .success {
            color: blue;
        }
        #p1 .errMsg {
            position: absolute;
            color: red;
        }
      
    </style>
</head>
<body>


        <div id="p1">
            <div class="main-box">
                <h2>Login</h2>
                <div id="formwrapper">
                    <form method="post" action="home" id="login-form">
                        <p>
                            <label for="username">使用者名稱:</label>
                            <input type="text" name="username" id="username" autocomplete="off">
                        </p>
                        <p>
                            <label for="password">密碼: </label>
                            <input type="text" name="password" id="password" autocomplete="off">
                        </p>
                        <p>
                            <button id="button1">送出</button> <!--button 預設type='submit'-->
                        </p>
                    </form>
                </div>

            </div>
        </div>
      

</body>
</html>