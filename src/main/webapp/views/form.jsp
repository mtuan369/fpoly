<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Thông tin đã cập nhật</h2>
    <p>Tên đầy đủ: ${fullname}</p>
    <p>Giới tính: ${gender}</p>
    <p>Quốc gia: ${country}</p>

    <form action="/update" method="post">
        <div>Fullname: <input type="text" name="fullname" value="${fullname}" /></div>
        <div>Gender: 
            <input type="radio" name="gender" value="true" ${gender == 'true' ? 'checked' : ''}> Male
            <input type="radio" name="gender" value="false" ${gender == 'false' ? 'checked' : ''}> Female
        </div>
        <div>Country: 
            <select name="country">
                <option value="VN" ${country == 'VN' ? 'selected' : ''}>Việt Nam</option>
                <option value="US" ${country == 'US' ? 'selected' : ''}>United States</option>
                <option value="CN" ${country == 'CN' ? 'selected' : ''}>China</option>
            </select>
        </div>
        <button type="submit">Update</button>
    </form>
</body>
</html>